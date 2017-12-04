delimiter $
   drop function if exists udf_ipconfig $
   create function udf_ipconfig()
   returns varchar(100)
   begin
      declare myip varchar(100) $
      
      select host 
        into myip
        from information_schema.PROCESSLIST
        where id = connection_id() $
        
      return myip $   
   end $
delimiter ;   

-- 실행 방법
select udf_ipconfig() ;



-- @@@@ 문제 01.
-- emp테이블에서 직원의 이름과 급여와 입사일만을 하는 SQL문을 작성하시오.
-- @@@@
select ename 이름, sal, hiredate, udf_ipconfig() from emp;


-- @@@@ 문제 02.
-- emp 테이블에서 이름이 "기"를 포함하는 직원이나 
-- 급여가 250이거나 300이거나 500인 직원들을 출력하되 
-- 최근 입사한 순으로 직원번호, 직원명, 직급, 입사일만 출력하는 SQL문을 작성하시오.
-- @@@@
select empno, ename, job, hiredate, udf_ipconfig() from emp where ename like '%기%' or sal in (250,300,500) order by hiredate desc;

-- @@@@ 문제 03.
-- emp 테이블에서 직급(job)이 '사원'이 아닌 직원들 중에서
-- 직급(job)별 급여 총액이 1000 이상인 직원들 대해서만 급여총액과 직급을 출력하시오.
-- 단, 출력시 급여총액 순으로 오름차순 정렬하는 뷰를 만드시오. 
-- 뷰의 이름은 vw_sal 한다.
-- 출력 결과 예시: select *, udf_ipconfig() from vw_sal 
-- @@@@
create view vw_sal as
select sum(sal), job
 from emp where job != '사원'
 group by job having sum(sal)>=1000 
 order by sum(sal) asc;
select *, udf_ipconfig() from vw_sal;


-- @@@@ 문제 04.
-- emp 테이블에 영업부(deptno=30) 소속의 과장 송혜교를 추가하는 SQL문을 작성하시오. 
-- 단, 입사일은 2015-01-01 이고 커미션은 100 이다.
-- @@@@
select @empno := max(empno) from emp;
insert into emp (empno, deptno, job, ename, hiredate, comm)
         values (@empno+1, 30, '과장', '송혜교', '2015-01-01', 100);
         
select *, udf_ipconfig() from emp
where job ='과장'
  and deptno = 30
  and ename = '송혜교';
-- @@@@ 문제 05.
-- emp 테이블에서 영업부(deptno=30) 소속의 과장 송혜교의 
-- 연봉(sal)을 700으로, 커미션(comm)을 null로 수정하는 SQL문을 작성하시오.
-- @@@@
update emp set sal=700, comm=null
         where deptno=30 and job='과장' and ename='송혜교';
         
select *, udf_ipconfig() from emp
where job ='과장'
  and deptno = 30
  and ename = '송혜교';

-- @@@@ 문제 06.
-- emp 테이블에서 영업부(deptno=30) 소속의 과장 송혜교를 삭제하는 SQL문을 작성하시오.
-- @@@@ 
delete from emp where deptno=30 and job='과장' and ename='송혜교';
select *, udf_ipconfig() from emp
where job ='과장'
  and deptno = 30
  and ename = '송혜교';
-- @@@@ 문제 07.
-- 인천에서 근무하는 직원명(ename), 입사일(hiredate), 급여(sal) 그리고 부서명(dname)을 출력하는 SQL문을 작성하시오.
-- @@@@   
select e.ename, e.hiredate, e.sal, d.dname, udf_ipconfig()
 from emp e inner join dept d on e.deptno=d.deptno
 where d.loc='인천';

-- @@@@ 문제 08.
-- DDL문을 작성하여 제출하시오.
-- 아래의 SQL문에 해당되는 
-- @@@@
show columns from employee;  
show columns from project;
show columns from specialty;
show columns from assign;
select table_name
     , column_name
     , referenced_table_name
     , referenced_column_name
     , udf_ipconfig()
  from information_schema.key_column_usage
 where referenced_table_name is not null
   and table_schema = 'test' ;


CREATE TABLE `employee` (
   `emp_no` DECIMAL(4,0) NOT NULL DEFAULT '0',
   `emp_name` VARCHAR(20) NULL DEFAULT NULL,
   `salary` DECIMAL(6,0) NULL DEFAULT NULL,
   `birthday` DATE NULL DEFAULT NULL,
   PRIMARY KEY (`emp_no`)
);

CREATE TABLE `project` (
   `pro_no` DECIMAL(4,0) NOT NULL DEFAULT '0',
   `pro_content` VARCHAR(100) NULL DEFAULT NULL,
   `start_date` DATE NULL DEFAULT NULL,
   `finish_date` DATE NULL DEFAULT NULL,
   PRIMARY KEY (`pro_no`)
);

CREATE TABLE `specialty` (
   `emp_no` DECIMAL(4,0) NOT NULL DEFAULT '0',
   `specialty` VARCHAR(20) NOT NULL,
   PRIMARY KEY (`emp_no`, `specialty`),
   CONSTRAINT `specialty_employee_fk` FOREIGN KEY (`emp_no`) REFERENCES `employee` (`emp_no`)
);

CREATE TABLE `assign` (
   `emp_no` DECIMAL(4,0) NOT NULL DEFAULT '0',
   `pro_no` DECIMAL(4,0) NOT NULL DEFAULT '0',
   PRIMARY KEY (`emp_no`, `pro_no`),
   INDEX `assign_project_fk` (`pro_no`),
   CONSTRAINT `assign_employee_fk` FOREIGN KEY (`emp_no`) REFERENCES `employee` (`emp_no`),
   CONSTRAINT `assign_project_fk` FOREIGN KEY (`pro_no`) REFERENCES `project` (`pro_no`)
);