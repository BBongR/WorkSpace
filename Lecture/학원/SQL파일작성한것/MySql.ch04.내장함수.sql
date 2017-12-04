-- @@@@@@@@@@
-- from 절 생략 여부
-- 테이블 생략 여부
-- MySql  : from절  생략 가능
-- MsSql  : from절  생략 가능
-- Oracle : 테이블 생략 불가. dual 테이블 사용.
--          dual 테이블은 oracle에만 있는 1행1열의 테이블이다.
--          dual 테이블은 단순 계산이나 연산을 위해서 사용된다.

-- @@@@@@@@@@

-- 24*35의 계산 결과를 출력하시오.
select 24*35;
-- 현재 날짜와 시간을 출력하시오
select now();
-- 현재 날짜를 출력하시오
select curdate();
-- 현재  시간을 출력하시오
select curtime();

-- @@@@@@@@@@
-- 숫자 관련 함수
-- @@@@@@@@@@

--  2356.2578정수값 구하기: floor
select floor( 2356.2578);
--  2356.2578 반올림: round
-- round를 이용하여  2356.2578 에서 정수만 출력하시오.
select round( 2356.2578, 0);

-- round를 이용하여  2356.2578의 정수 두번째 자리에서 반올림하여 출력하시오.
select round( 2356.2578, -2);

-- round를 이용하여  2356.2578의 소수 세번째 자리에서 반올림하여 출력하시오.
select round( 2356.2578, 2);

-- 버림: 
-- MySQL : truncate
-- Oracle : trunc
-- truncate(trunc)를 이용하여  2356.2578에서 정수만 출력하시오.
select truncate(2356.2678, 0);
-- truncate(trunc)를 이용하여  2356.2578에서 정수 두번째 자리에서 버리시오.
select truncate(2356.2678, -2);
-- truncate(trunc)를 이용하여  2356.2578에서 소수 세번째 자리에서 버리시오.
select truncate(2356.2678, 2);
-- 나머지 구하기: mod
-- mod를 이용하여 2356을 3으로 나눈 나머지를 구하시오.
select mod(2356, 3);

select mod(2356.2678, 3);
-- @@@@@@@@@@
-- 문자 관련 함수 
-- @@@@@@@@@@

-- 대문자 변환 : upper()
select upper('sdfw dfdwddv sdfsfwqefr 강강강')

-- 소문자 변환 : lower()
select lower('SDFWD vDSFWW dfwEE 강강')

-- 문자 길이 구하기. length(). 'kfa 가나다'의 길이로 처리하시오.
-- mySQL : 한글은 3byte, 영문은 1byte
-- oracle : 한글은 2byte, 영문자는 1byte
select length ('kfa 가나다');
select length ('kfaa 가나다');
select length ('kfa 가나다라');
-- 바이트 길이 구하기. 한글은 2byte, 영문자는 1byte

-- 문자열 추출. 
-- MySQL  : substring
-- Oracle : substr
select substring( 'abcdefghij', 4, 4);
select substring( 'abcdefghij', 4);
select substring( 'abcdefghij', -5);
select substring( 'abcdefghij', -5, 3);

-- 왼쪽에 기호 채우기. lpad
select lpad ('abcd', 10, '*');
select lpad ('abcd', 10, 0);
select lpad ('abcd', 10, '0');

-- 오른쪽에 기호 채우기. rpad
select rpad ('abcd', 10, '*');
select rpad ('abcd', 10, 0);
select rpad ('abcd', 10, '0');

-- 문자열 바꾸기. replace
select 'abcdefghij', replace( 'abcdefghij', 'de', '  ');


-- @@@@@@@@@@
-- 날짜 관련 함수 
-- MySQL  : now() ,curdate(), curtime()  , date_format(), date_add(), date_sub()
-- Oracle : sysdate, systimestamp
-- @@@@@@@@@@

-- 현재 날짜와 시간을 출력하시오
select now() ;
select now(), ename, empno from emp;

-- 현재 날짜를 출력하시오
select curdate() ;

-- 현재  시간을 출력하시오
select curtime();
-- 현재 날짜를 'YYYY/MM/DD' 포맷으로 출력하시오
select now(), date_format( now(), '%Y')
select now(), date_format( now(), '%y')
select now(), date_format( now(), '%M')
select now(), date_format( now(), '%m')
select now(), date_format( now(), '%D')
select now(), date_format( now(), '%d')

-- 현재 날짜를 'YYYY-MM-DD' 포맷으로 출력하시오
select now(), date_format( now(), '%Y/%m/%d');


-- 문제. emp 테이블에서 이름(ename)과  입사일(hiredate) 출력하시오.
-- 입사일은  'YY/MM/DD' 포맷으로 출력하시오
select ename, date_format(hiredate, '%y/%m/%d') from emp; 

-- emp 테이블에서 입사일을 date_format 'YYYY/MM/DD' 포맷으로 출력하시오
select date_format(hiredate, '%Y-%m-%d') from emp; 

-- 현재 시간를 'hh:mm:ss' 포맷으로 출력하시오
select now(), date_format(now(), '%H');
select now(), date_format(now(), '%h');
select now(), date_format(now(), '%i');
select now(), date_format(now(), '%s');

select now(), curtime(), date_format( now(), '%H:%i:%s' ), date_format(curtime(), '%H:%i:%s');
select now(), date_format(now(), '%T');

-- 이번달의 첫째날 구하기. 일반화
select now(), concat( date_format(now(), '%Y-%m'), '-01');

-- 이번달의 첫째날 요일 구하기
select '2017-10-01', date_format('2017-10-01', '%a');

-- 이번달의 첫째날 요일 구하기. 일반화
select concat( date_format(now(), '%Y-%m'), '-01')
     , date_format( concat( date_format(now(), '%Y-%m'), '-01'), '%a');

-- 문제. emp 테이블에서 입사일(hiredate)과 입사일의 요일이 출력되도록 하시오.
select hiredate, date_format( hiredate, '%a' ) from emp;

-- 해당 월의 마지막 일을 출력하시오.
select curdate(), last_day( curdate() );

-- 문제. emp 테이블에서 입사일(hiredate)과 입사할 달의 마지막 일을 출력되도록 하시오
select hiredate, last_day(hiredate) from emp;

-- 오늘은 이번달의 몇 주차인가?
select now(), dayofweek( now() );

-- 지금부터 '2014-01-01'까지의 개월 수 차이를 계산하시오. timestampdiff()
select now(), '2014-01-01', timestampdiff( MONTH, now(), '2014-01-01');

-- 지금부터 '2014-01-01'까지의 년수 차이를 계산하시오. timestampdiff()
select now(), '2014-01-01', timestampdiff( YEAR, now(), '2014-01-01');

-- 지금부터 '2014-01-01'까지의 일수를 계산하시오. timestampdiff()
select now(), '2014-01-01', timestampdiff( DAY, now(), '2014-01-01');

-- 오늘 날짜에 6개월을 계산하시오.
select now(), date_add( now(), INTERVAL 6 MONTH );

-- 오늘 날짜에 -6개월 계산하시오.
select now(), date_add( now(), INTERVAL -6 MONTH );

--  문제.오늘 날짜에 17년후를 계산하시오.
select now(), date_add( now(), INTERVAL 17 YEAR );

-- 지금부터 가장 가까운 수요일은 몇일후 인가?
-- case when then else 을 이용하시오.

-- if( dayofweek( now() ) >= 4) {
--      4 - dayofweek( now() )
-- }
-- else {
--      4 + (7-dayofweek( now() )
-- }
select now()
     , dayofweek ( now() )
     , CASE WHEN dayofweek( now() ) <= 4 THEN 4 - dayofweek( now() )
            ELSE 4 + (7-dayofweek( now() ) )
            END as '일수';

select now(), dayofweek ( now() ), 4 - dayofweek ( now()      ); -- 수요일 이전인 경우
select now(), dayofweek ( now() ), 4 + (7-dayofweek ( now() ) ); -- 수요일 초과인 경우

-- 지금부터 가장 가까운 수요일은 몇일인가?


-- 해당 월의 마지막 일을 구하기








-- @@@@@@@@@@
-- 형변환 함수 
-- MySQL : convert() : date <--> character <--> number
-- Oracle : to_char, to_date, to_number
-- @@@@@@@@@@

-- 현재일자를 문자열로 변환, 날짜 -> 문자 : YYYY, MM, DD
select now(), convert( now(), nchar(4) );
select now(), convert( now(), nchar(7) );
select now(), convert( now(), nchar(10) );

-- 현재시간을 문자열로 변환, 날짜 -> 문자 : hh:mm, hh:mm:ss
select curtime(), convert( curtime(), char(5)); 
select curtime(), convert( curtime(), char(8)); 

-- 문자를 날짜로 변환. 문자 -> 날짜, 변환 후에는 DATE 포맷이 된다.
select '2017-10-16', convert( '2017-10-16', DATE );
select '17:10:15', convert( '17:10:15', TIME );
select '2017-10-16 17:10:15', convert( '2017-10-16 17:10:15', DATETIME );

-- 문자를 숫자로 변환
select '-120'   , convert( '-120'   , SIGNED   );
select '120'    , convert( '120'    , UNSIGNED );
select '120.124', convert( '120.124', DECIMAL( 10, 0 ) );
select '120.124', convert( '120.124', DECIMAL(  7, 5 ) ); -- 이상하게 나옴 자릿수 보고 결정해야함 (7, 3)으로 하면 제대로 출력됨
select '120.124', convert( '120.124', DECIMAL(  8, 5 ) );
select '120.124', convert( '120.124', DECIMAL( 10, 5 ) );

-- 문제. 문자를 숫자로 변환: 20,000,000.73797874857848 을 DECIMAL을 이용하여 실수로 바꾸시오.
select '20,000,000.73797874857848'
              , replace( '20000000.73797874857848', ',', '')
				  , convert( replace( '20,000,000.73797874857848', ',', ''), DECIMAL( 22, 14 ) );
-- 안됨				  
set @aaa := '20,000,000.73797874857848';
set @bbb := replace( '20000000.73797874857848', ',', '');
set @ccc := length( @bbb ) -1;
select @aaa, @bbb, @ccc, convert( @bbb, DECIMAL( @ccc, 14 ) );

-- @@@@@@@@@@
-- NULL을 처리하는 함수
-- mysql : ifnull(), if()
-- oracle: nvl()
-- @@@@@@@@@@

-- ifnull 사용법
select ifnull( null, 1 );
select ifnull(    0, 1 );
select ifnull(  '0', 1 );

-- @@@@@@@@@@
-- 선택 함수 : CASE 문. 자바의 연속if 와 유사
-- CASE WHEN ELSE 
-- @@@@@@@@@@ 


-- CASE WHEN THEN ELSE 를 사용하여 부서명을 출력하시오.
-- deptno = 10 이면 경리부
-- deptno = 20 이면 인사과
-- deptno = 30 이면 영업부
-- deptno = 40 이면 전산부
-- 아니면 나머지부(21, 31)
select ename, deptno, CASE WHEN deptno=10 THEN '경리부'
                           WHEN deptno=20 THEN '인사과'
                           WHEN deptno=30 THEN '영업부'
                           WHEN deptno=40 THEN '전산부'
                           ELSE '나머지부'
                           END
                           from emp;


-- @@@@@@@@@@@@@@
-- 미션
-- @@@@@@@@@@@@@@
-- 미션 1. 9월에 입사한 사원을 출력하시오 1개
-- 오늘 날짜에서 월을 추출하려면
select now(), substring( now(), 6, 2);

-- 입사일(hiredate)에서 월을 추출해오려면
select hiredate, substring( hiredate, 6, 2) from emp;

-- 9월에 입사한 직원을 찾아서 출력하시오
select * from emp where substring( hiredate, 6, 2) = '09';

-- 미션 2. SUBSTR 함수를 이용하여 2003년도에 입사한 사원을 검색하기. 2개
select * from emp where substring( hiredate, 1, 4) = '2003';

-- 미션 3. 이름(ename)이 '기'로 끝나는 사원을 검색하시오. 2개
select * from emp where ename like '__기';

-- 미션 4. 이름의 두 번째 글자에 '동'이 있는 사원을 검색하기. 2개
select * from emp where ename like '_동%';

-- 미션 5. 직급(job)에 따라 직급에 따라 급여를 인상하시오.
-- '부장'인 사원은 5% 인상 
-- '과장'인 사원은 10% 인상
-- '대리'인 사원은 15% 인상 
-- '사원'인 사원은 20% 인상
select ename, job, CASE WHEN job='부장' THEN '5% 인상'
                        WHEN job='과장' THEN '10% 인상'
                        WHEN job='대리' THEN '15% 인상'
                        WHEN job='사원' THEN '20% 인상'
                   END
from emp;

-- 미션 6. 입사일을 연도는 2자리(YY), 
--         월은 숫자로 표시하고 
--         요일은 약어(DY)로 출력하시오.
-- 구글 검색을 이용 
select hiredate, date_format( hiredate, '%y %c %W') from emp;
