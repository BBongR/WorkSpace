

-- SQL 에서 문자와 숫자의 차이
-- 숫자: 오른쪽 정렬
-- 문자: 왼쪽 정렬


-- SQL 에서 NULL 이란?

       


-- ########################
-- select 사용법
-- 
-- select *
--   from 테이블명;
-- 
-- select 컬럼1, 컬럼2, 컬럼3
--   from 테이블명;
-- ########################


-- DEPT 테이블에서 모든 컬럼의 데이터를 조회하시오.

-- DEPT 테이블에서  deptno, dname 컬럼의 데이터만 출력하시오.


-- EMP 테이블에서 JOB, ENAME 컬럼만 출력하시오.


-- EMP 테이블에서 모든 컬럼의 데이터만 출력하시오.



-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 컬럼에 별칭(별명) 주기
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- AS로 컬럼에 별칭 부여하기. 
-- emp 테이블에서 job 컬럼에는 직책을 , ename 컬럼에 이름이라는 별칭을 붙여 출력하시오.

-- AS없이 컬럼에 별칭 부여하기. 
-- emp 테이블에서 job 컬럼에는 직책을 , ename 컬럼에 이름이라는 별칭을 붙여 출력하시오.

-- 작은따옴표('' )로 별칭 부여하기. 
-- emp 테이블에서 job 컬럼에는  "aa//aa"를 , ename 컬럼에는 "nick -+name" 이라는 별칭을 붙여 출력하시오.



-- @@@@@@@@@@@@@@@@@@@@@@@@
-- null 처리를 위해서는
-- MySQL에서는  ifnull() 함수를 사용해야 한다
-- Oracle 에서는 nvl() 함수를 사용해야 한다.
-- @@@@@@@@@@@@@@@@@@@@@@@@
select nvl(1, 0)      from dual;
select nvl( null, 0)  from dual;
 
-- emp 테이블에서 ename과 mgr 값을 출력하시오. 
-- 단, mgr이 null 이면 0으로 바꾸어 출력하시오.


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 중복 제거 - DISTINCT
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- emp 테이블에서 ename 만 출력하되 중복되는 ename 을 제거하시오. 이병헌이 2명.


-- emp 테이블에서 deptno 값이 중복되는 것을 제거하여 출력하시오. 5개

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 컬럼 연결,  문자열 연결  
-- MySQL 인 경우는 concat을 사용
--  concat( 컬럼1  , 컬럼2  ) 
--  concat( 컬럼1  , 컬럼2 , 컬럼3, 컬럼4   ) 
-- 
-- Oracle 인 경우 는  || 를 사용.
--   컬럼  || 컬럼2   
--   컬럼1 || 컬럼2 || 컬럼3 || 컬럼4    
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- 'A and B' 를 출력하시오.
select "A and B" from dual; 

-- concat 을 이용하여 'A and B' 를 출력하시오.
select 'A' || ' and ' || 'B' from dual;


-- emp 테이블에서 김사랑 조회하기

-- '김사랑의 직급은 사원입니다' 출력하기. 
-- MySQL  인 경우: concat(ename, '의 직급은 ', job, '입니다')
-- Oracle 인 경우: ename || '의 직급은 ' || job || '입니다'


-- '김사랑의 직급은 사원입니다' 출력하는 컬럼 이름을 '직급'으로 출력하시오



-- ########################
-- where 사용법
-- 
-- select 컬럼1, 컬럼2, 컬럼3
--   from 테이블명
--  where 조건
-- ########################

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 산술연산자를 이용한 조건 검색
-- =, > , >=, <, <=, !=
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- emp 테이블에서 sal이 500보다 크거나 같은 경우만 출력하시오
  
-- emp 테이블에서 deptno 가 10 인 경우만 출력하시오.
 
 
-- 부정연산( != )
-- deptno 가 10 이 아닌 사람만 출력하시오.
 
 
-- 문제1.
-- ename 이 '이문세'인 경우만 출력

-- 문제2.
-- ename 이 '이문세'가 아닌 경우만 출력


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 논리연산자를 이용한 조건 검색 
-- and, or, not( !=, <> )
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- emp 테이블에서 deptno 가 10 인 직원만 출력하시오

-- emp 테이블에서 job이 과장인 직원만 출력하시오

-- emp 테이블에서 deptno 가 10  이고(and) job이 과장인 사람만 출력하시오.

-- emp 테이블에서 deptno 가 10  이거나(or) job이 과장인 사람만 출력하시오.




-- 문제 1. 산술연사자를 이용해서 
-- sal 값이 400보다 크거나 같고 그리고(and) 
-- sal 값이 500보다 작거나 같은 직원을 출력하시오. 5개


-- 문제 2. 산술연사자를 이용해서 
-- sal 값이 400보다 작거나 같고 또는(or) 
-- sal 값이 500보다 크거나 같은 직원을 출력하시오. 16개



-- @@@@@@@@@@@@@@@@@@@@@@@@
-- between A and B 를 이용한 조건 검색 
-- @@@@@@@@@@@@@@@@@@@@@@@@


-- 문제. sal 값이 400보다 크거나 같고 그리고(and) 
-- sal 값이 500보다 작거나 같은 직원을 출력하시오

-- 방법1. 산술 연산자를 이용하는 방법5개

-- 방법2. between A and B 를 이용하는 방법


-- 문제. 입사일(hiredate)이 2005/01/01 이전인 사람들만 출력하시오



-- 문제. 입사일(hiredate)이 2005/01/01 부터 2012/12/31 까지 입사한 사람들만 출력하시오
-- 방법1. 비교 연산자를 이용하는 경우. 10개

-- 방법2. between A and B 를 이용해서. 10개



-- @@@@@@@@@@@@@@@@@@@@@@@@
-- like를 이용한 조건 검색
-- 와일드카드: % , _
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- 이름(ename)이 '이'로 시작하는 직원을 출력하시오. 4개
select * from emp where ename like '이%';

-- 이름(ename)이 '이'로 끝나는 직원을 출력하시오. 0개
select * from emp where ename like '%이';

-- 이름(ename)에 '이'가 들어가 있는 직원을 출력하시오. 4개
select * from emp where ename like '%이%';

-- 문제. 이름(ename)에 '성'자가 들어가는 직원을 출력하시오. 3개
select *from emp where ename like '%성%';

-- 문제. 이름(ename)에 '성'자가 들어가지 않는 직원을 출력하시오. 15개
select * from emp where ename not like '%성%';

-- 와일드 카드 "_"를 사용하여 ename 가운데 글자에 "성"자가 들어 있는 사람을 출력하시오.
select * from emp where ename like '_성_';

-- 와일드 카드 "%"를 사용하여 ename이 "성"자로 끝나는 사람을 출력하시오.
select * from emp where ename like '__성';

-- 문제
-- LIKE 'a%'	 : 
-- LIKE '%a'	 : 
-- LIKE '%or%'	 : 
-- LIKE '_r%'	 : 1r, 1ra, 2rr
-- LIKE 'a_%_%' : 
-- LIKE 'a%o'	 : ao, a1o, a.....o


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- in , not in
-- in      연산. or  연산의 축약된 표현
-- not in  연산.
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- or 연산으로
-- comm이 80 이거나 100 이거나 200인 사람만 출력하시오. 3개
select * from emp where comm=80 or comm=100 or comm=200;

-- in 연산으로 
-- comm이 80 이거나 100 이거나 200인 사람만 출력하시오. 3개
select * from emp where comm in( 80,100,200 );

-- and 연산으로
-- comm이 80 이 아니고 그리고 100 이 아니고 그리고 200 이 아닌 사람만 출력하시오. 1개
select * from emp where comm!=80 and comm!=100 and comm!=200;

-- not in 연산으로 
-- comm이 80 이 아니고 그리고 100 이 아니고 그리고 200 이 아닌 사람만 출력하시오. 1개
select *from emp where comm not in( 80,100,200 );


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- is null , is not null
-- =
-- like
-- is null
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- comm 값이  null 인 경우만 출력하시오. 14개
select * from emp where comm is null;

-- comm 값이  null 이 아닌 경우만 출력하시오. 4개
select * from emp where comm is not null;


-- ########################
-- 정렬
-- 오름차순 정렬 : asc
-- 내림차순 정렬 : desc
-- ########################

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 오름차순 정렬 : ASC : ascending 
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- sal 컬럼을 오름값순으로 정렬하시오
select * from emp order by sal asc;

-- 이름(ename)을 오름차순으로 출력하시오
select * from emp order by ename asc;

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 내림차순 정렬 : DESC : descending 
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- sal 컬럼을 내림값순으로 출력하시오
select * from emp order by sal desc; 

-- 이름(ename)이 '이병헌'인 직원을 찾아서 
-- sal 값을 기준으로 오름차순으로 출력하시오.
select * from emp where ename = '이병헌'
                  order by sal asc;

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- 중복 정렬: 정렬 조건이 2개 이상인 경우
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- 이름(ename)은 오름차순으로 정렬하고 
-- 입사일(hiredate)은 내림차순으로 정렬하시오 
select * from emp order by ename asc, hiredate desc;    



-- 문제. 급여(sal)를 많이 받는 순으로 출력하되 급여가 같으면
--       이름(ename)의 철자가 빠른 순으로 출력하시오.
select * from emp order by sal desc
                  , ename asc;


-- ########################
-- 집합 연산자
--  ----------------------------------------------------
--  |         | MySQL      | Oracle      |  MsSQL      |
--  ----------------------------------------------------
--  |합집합   | union      | union       |  union      |
--  |         | union all  | union all   |  union all  |
--  ----------------------------------------------------
--  |교집합   | inner join | inner join  |  inner join |
--  |         | equip join | equip join  |  equip join |
--  |         |            | intersect   |             |
--  ----------------------------------------------------
--  |차집합   | left join  | left join   |  left join  |
--  |         | right join | right join  |  right join |
--  |         |            | minus       |             |
--  ----------------------------------------------------
-- ########################

-- GROUP_STAR 데이터 조회. 14개
select * from group_star;

-- SINGLE_STAR 데이터 조회.7개
select * from single_star;

-- 중복이 제거된 합집합(union)을 구하시오 : GROUP_STAR , SINGLE_STAR. 17개 출력
select * from group_star
union
select * from single_star;                                                                 
                                                                 
-- 중복이 포함된 합집합을 구하시오 : GROUP_STAR , SINGLE_STAR.  21개 출력
select * from group_star
union all
select * from single_star;
                                    
-- 교집합 구하기. 공통 부문만 출력 : GROUP_STAR , SINGLE_STAR.  4개
-- mysql 에서는 inner join 또는 equip join 사용 
-- oracle 에서는 intersect 를 사용.
select * from GROUP_STAR
intersect
select * from SINGLE_STAR;



-- 차집합 구하기 : GROUP_STAR - SINGLE_STAR : 10(=14-4)개 출력
-- mysql 에서는 left join 사용.
-- oracle 에서는 minus 를 사용.
select * from GROUP_STAR
minus
select * from SINGLE_STAR  ;


-- 차집합 구하기 : SINGLE_STAR - GROUP_STAR : 3(=7-4)개 출력
-- mysql 에서는 left join 사용.
-- oracle 에서는 minus 를 사용.
select * from SINGLE_STAR  
minus
select * from GROUP_STAR ;







-- ########################
-- 미션 1. READ( SELECT )
-- ########################
-- emp테이블에서 직원의 이름과 급여와 입사일만을 출력하시오. 컬럼 3개 출력하기

-- 컬럼 이름에 별칭을 붙여 출력하시오.

-- 직급이 중복되지 않게 한 번씩만 출력하시오


-- ########################
-- 미션2. SEARCHING( WHERE )
-- ########################
-- 급여가 300 이하인 직원의 직원번호, 직원 이름, 급여를 출력하기

-- 이름이 “오지호”인 직원의 직원번호, 직원명, 급여를 출력하기

-- 급여가 250이거나 300이거나 500인 직원들의 직원 번호와 직원명과 급여를 출력하시오

-- 급여가 250이거나 300이거나 500도 아닌 직원들을 검색하기


-- ########################
-- 미션3. SORTING(ORDER BY)
-- ########################
-- LIKE 연산자와 와일드 카드를 사용하여 직원들 중에서 이름이 “김”으로 시작하는 사람이나
-- 이름 중에 “기”를 포함하는 직원의 직원번호와 직원이름을 출력하되 최근 입사한 직원 순으로 
-- 직원번호, 직원명, 직급, 입사일 컬럼 만 출력하기


-- 상관이 없는 직원(사장이 되겠지요!)을 검색하기. mgr 컬럼을 사용하여 쿼리를 작성하시오.



-- 부서 번호가 빠른 직원부터 출력하되 같은 부서내의 직원을 출력할 경우 
-- 입사한지 가장 오래된 직원부터 출력하기



-- ########################
-- 미션 4.
-- ########################
-- book 테이블의 모든 데이터를 출력하시오


-- book 테이블에서 bookname,  publisher,  price,  authid   컬럼만 레코드를 출력하시오.


-- book 테이블에서 bookname 컬럼에 SQL 이 들어가 있는 레코드를 출력하시오


-- bookname 이 SQL로 끝나는 레코드를 출력하시오


-- bookname 이 SQL로 시작하는 레코드를 출력하시오


-- price가 30,700원 이상(크거나 같다)이고
--         50,000원 미만(작다)인 레코드를 출력하시오

-- price가 30,700원 이상이고 50,000원 미만인 레코드를 출력하시오.
-- 단, between문을 사용하시오


-- bookname의 값이 'JAVA' 이고
-- price 가 30,000 원 이상인 데이터를 찾으시오


-- price가 30,700원 이하(작거나 같다) 이거나 
--         58,000원 초과(크다)인 레코드를 출력하시오


-- 레코드를 price 오름차순으로 정렬하시오.


-- 레코드를 price 내림차순으로 정렬하시오.


-- 레코드를  정렬하시오. publisher 오름차순, price  내림차순


-- bookname에 'SQL' 이 들어가는 레코드 중에 price 가 를 내림차순으로 정렬하시오


