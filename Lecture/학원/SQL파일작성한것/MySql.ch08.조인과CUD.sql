-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 데이터 삽입하기.
-- a. INSERT INTO ~ VALUES        를 이용한 INSERT 방법 : 기본 데이터 삽입 방법
-- b. INSERT INTO ~ SELECT ~ FROM 를 이용한 INSERT 방법 : 테이블이 있을때만 가능. 데이터 복제
-- c. INSERT INTO ~ SELECT ~ FROM 를 이용한 INSERT 방법 : 테이블이 있을때만 가능. 데이터 복사
-- d. CREATE TABLE 테이블명 ~ FROM를 이용한 INSERT 방법 : 테이블이 없을때만 가능. 테이블 복제
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- a. INSERT INTO ~ VALUES
--    emp 테이블에 경리부 소속의 사원 송중기를 추가하시오.

-- b. INSERT INTO ~ SELCET ~ FROM 를 이용한 INSERT 방법 
--    서브쿼리를 이용해서 emp 테이블에 사원 송중기를 추가

-- c. 테이블이 없는 경우에 테이블과 데이터를 복제 하는 방법
--    CREATE TABLE 새로만들테이블명 AS SELECT * FROM 복사할테이블명;

-- d. 테이블은 이미 생성되어 있고 데이터만 복사
--    INSERT INTO 복사할테이블명 SELECT * FROM 복사할테이블명 [WHERE 절]
--    new_emp 의 모든 데이터 삭제

-- e. 테이블이 없을때 테이블 구조만 복사하기 : 
--    CREATE TABLE new_table LIKE old_table;

-- f. emp01 테이블 제거하기



-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 데이터 수정하기.
-- a. UPDATE ~ SET ~ WHERE 를 이용한 UPDATE 방법 : 기본 데이터 수정 방법
-- b. 서브쿼리를              이용한 UPDATE 방법 : 
-- c. 조인을                  이용한 UPDATE 방법 : UPDATE ~ SET ~ FROM ~ WHERE
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- a. UPDATE ~ SET ~ WHERE 를 이용한 UPDATE 방법 : 기본 데이터 수정 방법
-- HR팀에서 근무하는 모든 직원을 인사부로 변경하고 월급을 300 으로 변경하시오

-- b. 서브쿼리를 이용한 UPDATE 방법 :
-- HR팀에서 근무하는 사원을 인사부로 변경하고 월급을 300 으로 변경하시오

-- c. 조인을  이용한 UPDATE 방법 : 
-- UPDATE [테이블명1] A INNER JOIN [테이블명2] B
-- ON A.[조인할 컬럼명] = B.[조인할 컬럼명]
-- SET [변경할 컬럼명] = 변경할값
-- ( WHERE 절 )
-- HR팀에서 근무하는 사원을 인사부로 변경하고 월급을 300 으로 변경하시오

-- 미션. 
-- '인사부'의 부서 위치(loc)를 '전산부'가 있는 지역(loc)으로 옮겨라.


-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 데이터 삭제하기.
-- a. DELETE FROM 테이블명 WHERE 를 이용하는 방법 : 기본 데이터 삭제 방법
-- b. 서브쿼리를 이용한 DELETE 를 하는 방법 :
-- c. 조인을 이용한 DELETE     를 하는 방법 : 
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2 

-- a. DELETE FROM ~ WHERE 를 이용하는 방법 : 기본 데이터 삭제 방법
-- 경리부에서 근무하는 모든 사원을 emp에서 삭제하시오.

-- b. 서브쿼리를 이용한 DELETE 방법 :
-- 경리부에서 근무하는 모든 사원을 emp에서 삭제하시오.

-- c. 조인을 이용한 DELETE 방법 :
-- 경리부에서 근무하는 모든 사원을 emp에서 삭제하시오.

