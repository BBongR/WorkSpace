-- @@@@@@@@@@@@@@
-- 그룹 함수
-- sum : 합계
-- avg : 평균
-- count : 갯수
-- min : 최소값
-- max : 최대값
-- @@@@@@@@@@@@@@

-- emp 테이블에서 전체 직원수를 출력하시오
select count( * ) from emp  ;

-- emp 테이블에서 전체 직원의 급여총액(sum), 급여평균(avg), 최대급여(max), 최소급여(min) 구하기
select sum( sal ), avg( sal ), max( sal ), min( sal ) from emp ;

-- emp 테이블의 총 데이터 갯수는? 18개
select count(*) from emp ;

-- emp 테이블에서 ename 중복 제거후 갯수를 구하시오. 17개. count + distinct 결합 예제.
select  count( distinct ename ) from emp ;


-- emp 테이블에서 직원들의 커미션(comm) 총액 구하기
select comm from emp where comm is not null ;
select sum( comm ) from emp  ;


-- emp 테이블에서 커미션(comm)을 받는 직원의 수를 구하기. 4개
select comm from emp where comm is not null ;


-- emp 테이블에서 전체 직원의 수와 커미션(comm)을 받는 직원의 수를 구하시오.
select count(*) 전체직원수 , count(comm) 커미션직원수 from emp ;



-- @@@@@@@@@@@@@@
-- group by 절
-- 엑셀의 부분 합계 구하기와 유사.
-- 1. 데이터를 그룹핑할 때 사용 
-- 2. 그룹 함수를 사용할 때 사용
-- 3. GROUP BY 절에 명시된 컬럼만 SELECT 절에 사용할 수 있다.
-- @@@@@@@@@@@@@@

-- -----------------------------------
-- a. emp 테이블의 전체 직원중에서 최대급여(sal)와 최소급여(sal)를 출력하시오
-- -----------------------------------
select max(sal), min(sal) from emp ;

-- -----------------------------------
-- b. emp 테이블에서 deptno가 10인 직원의 최대급여와 최소급여 출력하시오.
-- -----------------------------------
select max(sal), min(sal) from emp where deptno=10;

-- -----------------------------------
-- c. mp 테이블에서 부서별 최대급여, 최소급여 구하기
-- -----------------------------------
select distinct deptno from emp order by deptno asc;



-- c.1 union을 이용하는 방법
-- deptno = 10 인 직원중에서 급여(sal)의 최대급여, 최소급여를 구하시오
-- deptno = 20 인 직원중에서 급여(sal)의 최대급여, 최소급여를 구하시오
-- deptno = 21 인 직원중에서 급여(sal)의 최대급여, 최소급여를 구하시오
-- deptno = 30 인 직원중에서 급여(sal)의 최대급여, 최소급여를 구하시오
-- deptno = 31 인 직원중에서 급여(sal)의 최대급여, 최소급여를 구하시오
select 10, max(sal), min(sal) from emp where deptno=10
union
select 20, max(sal), min(sal) from emp where deptno=20
union
select 21, max(sal), min(sal) from emp where deptno=21
union
select 30, max(sal), min(sal) from emp where deptno=30
union
select 31, max(sal), min(sal) from emp where deptno=31;

-- c.2 group by를 이용하는 방법
select deptno, max(sal), min(sal) from emp group by deptno ;




-- -----------------------------------
-- emp 테이블에서 중복되지 않는 직책(job)별 직원수를 출력하시오
-- 1. 데이터를 직책(job)을 기준으로 오름차순으로 정렬 하시오.
-- 2. 직책(job)별 직원수를 출력하시오
-- -----------------------------------
select job, count(job) from emp group by job order by job asc ;


-- -----------------------------------
-- 문제. emp 테이블에서 부서별(deptno)로 직원수와 커미션(comm)을 받는 직원수를 출력하되
-- 사원번호(deptno) 오름차순으로 정렬하시오.
-- 
-- 실행결과 : 부서번호, 부서별직원수, 부서별커미션받는직원수
-- -----------------------------------
select deptno 부서번호, count(*) 부서별직원수, count(comm) 부서별커미션받는직원수
  from emp group by deptno order by deptno asc ;




-- @@@@@@@@@@@@@@
-- having 절
-- 그룹핑된 데이터에서 검색할 때 사용
-- group by 절과 항상 같이 사용되어야 함. 
-- 단독 사용 불가
-- @@@@@@@@@@@@@@


-- -----------------------------------
-- emp 테이블에서 부서(deptno)별 평균 급여(sal)와 부서번호(deptno) 출력하시오.
-- -----------------------------------
select deptno, avg(sal) from emp group by deptno ;


-- -----------------------------------
-- emp 테이블에서 부서별 급여 평균이 500이상인 부서 번호와 급여 평균 구하시오.
-- 1. 부서별로 부서번호와 급여평균( avg(sal) ) 구하여 출력하시오.
-- 2. 그룹핑된 데이터에서 급여평균( avg(sal) )이 500이상인 데이터만 재검색
-- -----------------------------------
select deptno, avg(sal) 
from emp 
group by deptno ;

select deptno, avg(sal) 
from emp 
group by deptno 
having avg(sal) >= 500;



-- -----------------------------------
-- emp 테이블에서 부서번호(deptno)가 10, 20, 30인 부서중에서 ==> where    절 사용.
-- 부서별 부서번호와 급여(sal)평균 출력하시오                ==> group by 절 사용.
-- 부서별 급여평균이 500이상인 부서번호와 급여평균 구하기    ==> having   절 사용.
-- 위의 데이터를 부서번호 오름차순으로 정렬하시오.           ==> order by 절 사용. 
-- 
-- 부서번호(deptno)가 10, 20, 30인 --> where
-- 부서별                          --> group by
-- 부서별 급여평균이 500이상       --> having
-- 부서번호 오름차순으로 정렬      --> order by 
-- 부서번호와 급여(sal)평균 출력   --> select
-- 
-- deptno=20 만 출력되면 정상. 1개
-- -----------------------------------
select deptno, avg(sal) 
 from emp 
where deptno in (10, 20, 30) 
group by deptno
having avg(sal)  >= 500
order by deptno asc ;

-- -----------------------------------
-- 문제 1: 
-- 직급별 급여 총액 구하기
-- '사원'을 제외하고 
-- 직급(job)별 
-- 급여총액이 1000 이상인 직원 중에서
-- 급여총액과 직급을 출력하시오.
-- 단, 출력시 급여총액 순으로 오름차순 정렬한다.
-- 
-- 급여총액( sum(sal) )과 직급(job) 을 출력하시오.  --> select
-- '사원'을 제외                                    --> where
-- 직급(job)별                                      --> group by
-- 급여 총액이 1000 이상                            --> having
-- 급여총액 순으로 오름차순으로 정렬하시오          --> order by
-- -----------------------------------
select job, sum(sal)
 from emp
where job != '사원'
group by job
having sum(sal) >= 1000
order by sum(sal) asc  ;

-- -----------------------------------
-- 문제 2:  
-- emp 테이블에서 가장 최근에 입사한 직원의 입사일(hiredate)과 이름(ename)을 구하시오. "추신수 출력"
-- oracle : rowid나 rownum을 사용
-- MySQL  : limit 를 사용
-- mssql  : top을 이용
-- -----------------------------------
select ename, hiredate from emp where hiredate = ( select max(hiredate) from emp );


-- -----------------------------------
-- 문제 3:  
-- 최근에 입사한 직원 10명의 입사일과 이름을 구하시오
-- oracle : rowid나 rownum을 흉내내는 방법
-- mysql  : limit을 이용
-- mssql  : top을 이용
-- -----------------------------------
select hiredate, ename from emp order by hiredate desc limit 0, 10;





-- @@@@@@@@@@@@@@
-- 미션
-- @@@@@@@@@@@@@@

-- 미션 1. 급여 최고액, 최저액, 총액 및 평균을 출력하시오

-- 미션 2. 담당 업무(job)별로 급여 최고액, 최저액, 총액 및 평균 급여 출력하시오.

-- 미션 3. 담당 업무(job)별 직원수를 출력하기.

-- 미션 4. 과장의 수를 출력하시오.

-- 미션 5. 직급별 급여 총액을 구하시오.
--         a. 직원을 제외하는 쿼리문 작성
--         b. 직원을 제외하고 직급별 급여 총액(sum) 구하기
--         c. 직원을 제외하고 직급별 급여 총액이 1000 이상인  데이터만 출력.

-- 미션 6. 급여 최고액, 급여 최적액의 차액 출력하시오.

-- 미션 7. 직급별 직원의 최저 급여 출력하시오.

-- 미션 8. 부서별로 부서번호, 직원수, 평균 급여 출력하시오.

