
--  @@@@@@@@@@@@
-- 단일행 서브 쿼리 : =
--  @@@@@@@@@@@@

-- '이문세'의 부서명 알아내기
select deptno from emp where ename = '이문세';
select dname from dept where deptno = 10; -- 10이 들어가는 자리에 위의 쿼리를 넣으면 서브쿼리

-- 서브쿼리를 이용하여 '이문세'의 부서명 알아내기

select dname
from dept
where deptno = (select deptno   
               from emp
               where ename='이문세'); 
-- 평균 급여보다 더 많은 급여를 받는 사원 출력하기. 9명
select avg(sal) from emp;
select * from emp where sal > 457.777778;


-- 서브쿼리를 이용하여 평균 급여보다 더 많은 급여를 받는 사원 출력하기
select * from emp where sal > (select avg(sal) from emp);

-- 문제. emp테이블에서 급여가 500을 초과하는 직원과 같은 부서에 근무하는 사원 구하기
#1. 급여가 500을 초과하는 직원의 부서는 3개가 존재 10,20,21
#2. 부서번호 10, 20, 21에 소속된 직원을 출력한다

select distinct from emp where sal > 500; #급여가 500을 초과하는 직원의 부서 번호를 출력
select * from emp where dptno in (10,20,21); #급여가 500을 초과하는 직원 이름.
select dept from deptno where = (select deptno from emp where sal > 500);

select ename, sal, deptno
from emp
where deptno IN ( select distinct deptno
                  from emp
                  where sal > 500); # 이쪽 제대로 못함 다시 해보기.


-- @@@@@@@@@@@@
-- 다중행 서브 쿼리
-- @@@@@@@@@@@@


-- -------------------- 
-- 다중 행 subquery in 사용 예제
-- --------------------
-- 인천에서 근무하는 직원을 출력하시오. 6개
select * from dept where loc ='인천';
select * from emp where deptno in (20, 21);

-- 서브쿼리를 이용하여 인천에서 근무하는 직원을 출력하시오.
select * from emp where deptno in (select deptno from dept where loc='인천');


-- 급여가 500을 초과하는 사원과 같은 부서(deptno) 에 근무하는 직원을 출력하시오.
select deptno from emp where sal > 500;
select * from emp where deptno in (10,20,21);


-- 서브쿼리를 이용하여 급여가 500을 초과하는 사원과 같은 부서(deptno) 에 근무하는 직원을 출력하시오.
select * from emp
where deptno in (select distinct deptno from emp where sal > 500);


---------------------- 
-- 다중 행 subquery not in 사용 예제
----------------------
-- 인천에 근무하지 않는 직원을 출력하시오.
select * from dept where loc='인천';
select * from emp where deptno!=20 or deptno!= 21 ;


-- 서브쿼리를 이용하여  인천에 근무하지 않는 직원을 출력하시오.
select * from emp
where dept in (select distinct deptno from emp where loc != '인천');#내가 한거 -> 실행이 안됨. 

select * from emp where deptno not in(20, 21);
-- -------------------- 
-- 다중 행 subquery ALL 사용 예제
-- --------------------
-- deptno=30인 부서의 최대 급여보다 많은 급여를 받는 직원을 출력하시오.
-- 첫번째 방식. MAX 사용
select max(sal) from emp where deptno=30;
select * from emp where sal > 500.00;
select * from emp where sal > (select max(sal) from emp where deptno=30);


-- 두번째 방식. ALL  사용 == 연속 AND 와 같은 의미
select sal from emp where deptno=30;
select * from emp where sal > 250 and sal > 500 and sal > 450 and sal > 480 and sal > 500 and sal > 280;

select * from emp
where sal > all (select sal from emp where deptno=30);
-- -------------------- 
-- 다중 행 subquery ANY 사용 예제
-- --------------------
-- deptno=30인 부서의 최소 급여보다 많은 급여를 받는 직원을 출력하시오.
-- 첫번째 방식. MIN 사용
select min(sal) from emp where deptno = 30;
select * from emp where sal > 250;
select * from emp where sal > (select min(sal) from emp where deptno = 30);


-- 두번째 방식. ANY 사용 == 연속 OR 와 같은 의미
select * from emp where sal > 250 or sal > 500 or sal > 450 or sal > 480 or sal > 500 or sal > 280;
select * from emp
where sal > any (select sal from emp where deptno=30);

-- -------------------- 
-- 다중 행 subquery exist 사용 예제
-- --------------------

-- 현재 직원이 있는 부서만 출력하시오. 5개만 출력되면 정상.
-- in을 사용하는 경우
select distinct deptno from emp;
select deptno from emp group by deptno;

select * from dept where deptno IN (10, 20, 21, 30, 31);
select * from dept where deptno IN (select distinct deptno from emp);

-- exists 를 사용하는 경우
select * from dept 
where exists (select distinct deptno from emp where emp.deptno = dept.deptno);
 
 
 
-- @@@@@@@@@@@@
-- table 서브 쿼리 : from 절에서 사용되는 서브쿼리
-- join 이 결합된 상태
-- @@@@@@@@@@@@
-- 인천에서 근무하는 직원을 출력하시오. 6개

-- where절 서브 쿼리를 사용하는 경우
select * from emp where deptno in (select deptno from dept where loc = '인천');


-- from절 서브 쿼리를 사용하는 경우 
select * 
from emp, (select deptno from dept where loc = '인천')d #d는 별칭
where emp.DEPTNO = d.deptno; #d는 별칭.  별칭이 있어야 함.

-- @@@@@@@@@@@@
-- scalar 서브 쿼리 : select 절에서 사용되는 서브쿼리
-- join 이 결합된 상태
-- @@@@@@@@@@@@
-- emp 출력시 deptno 대신에 dept테이블의 dname 값이 출력되도록 하시오.
select * from emp;
select dname from dept where deptno=10;

select deptno, (select dname from dept where deptno=emp.deptno) dname
from emp;




-- @@@@@@@@@@@@@@
-- 미션 05. 
-- @@@@@@@@@@@@@@

-- 1. 서브쿼리를 이용해서 영업부에 근무하는 사원의 이름과 입사일을 출력하시오. 6개
select ename, hiredate
 from emp
  where deptno in( select deptno from dept where dname = '영업부' );



-- 2. 과장의 최소 급여보다 많은 급여를 받는 직원들의 
--    이름, 급여 그리고 직급을 출력하되, 과장은 출력하지 않는다. 7개
select min(sal) from emp where job = '과장';

select ename, sal, job from emp
 where sal > 450 and job != '과장';
 
select ename, sal, job from emp
 where sal > ( select min(sal) from emp where job = '과장' ) and job != '과장';


-- 3. 인천에 위치한 부서에 소속된 직원들의 급여를 100씩 인상한 결과를 출력하시오.
select deptno from dept where loc = '인천';
select *, sal*2 인상급여 from emp where deptno in( 20, 21);

select ename, sal, sal+100 인상급여 from emp
 where deptno in( select deptno from dept where loc = '인천' );




-- 4. 부서별로 가장 급여를 많이 받는 직원의 정보를 출력하시오.
select deptno, max(sal) from emp group by deptno;
select * from emp
 where ( deptno = 10 and sal = 520  )
    or ( deptno = 20 and sal = 1000 )
    or ( deptno = 21 and sal = 1000 )
    or ( deptno = 30 and sal = 500  )
    or ( deptno = 31 and sal = 250  );

select * from emp
 where( deptno, sal ) in ( select deptno, max(sal) from emp group by deptno );



-- 5. 직급(job)이 과장인 직원들이 속한 부서 정보를 출력하시오.
select * from emp where job = '과장';
select * from dept where deptno in( 10, 30 );

select * from dept where deptno in( select deptno from emp where job = '과장' );



-- 6. 평균 급여보다 더 많은 급여를 받는 사원 출력하기
select avg( sal ) from emp;
select * from emp where sal > 457.777778;

select * from emp where sal > ( select avg( sal ) from emp );



-- 7. 이문세와 같은 부서에 근무하는 사원의 이름과 부서번호를 출력하는 SQL을 작성하시오.
select deptno from emp where ename = '이문세';
select ename, deptno from emp where deptno = 10;

select ename, deptno from emp where deptno = ( select deptno from emp where ename = '이문세' );



-- 8. 이문세와 동일한 직급을 가진 사원을 출력하시오.
select job from emp where ename = '이문세';
select * from emp where job = '부장';


select * from emp where job = ( select job from emp where ename = '이문세' );


-- 9. 이문세의 급여와 동일하거나 더 많이 받는 사원 명과 급여를 출력하시오.
select sal from emp where ename = '이문세';
select ename, sal from emp where sal >= 520;


select ename, sal from emp where sal >= ( select sal from emp where ename = '이문세' );


-- 10. 직속 상관이 감우성인 사원의 이름과 급여를 출력하시오.
select empno from emp where ename = '감우성';
select * from emp where mgr = 1008;

select * from emp where mgr = ( select empno from emp where ename = '감우성' );