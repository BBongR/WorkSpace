-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- 테이블 제약 조건
-- 
-- 컬럼에 제약 조건 설정 
-- 	  * NOT NULL 조건
-- 
-- 	  * DEFAULT 조건
-- 
-- 
-- 테이블에 제약 조건 설정
-- 
--     * 기본키(PRIMARY KEY)란?
--         테이블에서 유일성(UNIQUE)을 만족하는 대표 컬럼들..
--         주식별자.
--         ex) 주민번호
--     
--     * 외래키(FOREIGN KEY)란?
--         부모 자식 관계가 성립되는 테이블에서 부모를 찾기 위해 사용되는 컬럼들.
--         자식 테이블에서 설정.
--         외래식별자. 부모를 참조하는 컬럼들.
--     
--     * 유일키(Unique KEY)란?
--         유일하게 식별할 수 있는 최소 컬럼의 집합
--         슈퍼키, 후보키 
--         ex) 주민번호, 핸드폰번호, 계좌번호, ....
--     
-- 기본키, 외래키, 유일키는 테이블에 적용되는 것이다.
-- 
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 데이터 타입
-- 
-- -----------------------------------------------------------------
-- |      | MySQL         |  Oracle                   |    SQLite  |
-- -----------------------------------------------------------------
-- | 숫자 | INT           |  NUMBER( 자리수,  0 )     |    INTEGER |
-- |      | BOOLEAN       |                           |            |
-- |      | NUMERIC       |                           |            |
-- -----------------------------------------------------------------
-- |      | DOUBLE        |  NUMBER( 자리수, 소수점)  |    REAL    |
-- -----------------------------------------------------------------
-- | 문자 | CHAR          |  CHAR                     |    TEXT    |
-- |      | VARCHAR       |                           |            |
-- |      | NCHAR         |                           |            |
-- |      | NVARACHAR     |  VARCHAR2                 |            |
-- |      | TEXT          |                           |            |
-- -----------------------------------------------------------------
-- | 날짜 | DATE          |  DATE                     |    TEXT    |
-- |      | DATETIME      |                           |            |
-- -----------------------------------------------------------------
-- |      | BLOB          |  BLOB                     |    NONE    |
-- -----------------------------------------------------------------
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2



-- ########################
-- index 확인
-- MySQL  : show index from 테이블명 ;
-- Oracle : 
-- ########################

-- emp 테이블에 걸려 있는 index를 조회하시오.

  
-- #####
-- emp02 테이블 생성 DDL 문을 작성하시오.
-- +----------+-------------+------+-----+---------+-------+
-- | Field    | Type        | Null | Key | Default | Extra |
-- +----------+-------------+------+-----+---------+-------+
-- | EMPNO    | int(11)     | YES  |     | NULL    |       |
-- | ENAME    | varchar(10) | YES  |     | NULL    |       |
-- | JOB      | varchar(9)  | YES  |     | NULL    |       |
-- | MGR      | int(11)     | YES  |     | NULL    |       |
-- | HIREDATE | date        | YES  |     | NULL    |       |
-- | SAL      | double(7,2) | YES  |     | NULL    |       |
-- | COMM     | double(7,2) | YES  |     | NULL    |       |
-- | DEPTNO   | int(11)     | YES  |     | NULL    |       |
-- +----------+-------------+------+-----+---------+-------+
-- #####

-- emp02 테이블의 모든 컬럼에 null 값으로 insert 하시오.


-- #####
-- emp03 테이블 생성 DDL 문을 작성하시오.
-- empno 에 not null 조건 설정.
-- ename 에 not null 조건 설정.
-- +----------+-------------+------+-----+---------+-------+
-- | Field    | Type        | Null | Key | Default | Extra |
-- +----------+-------------+------+-----+---------+-------+
-- | EMPNO    | int(11)     | NO   |     | NULL    |       |
-- | ENAME    | varchar(10) | NO   |     | NULL    |       |
-- | JOB      | varchar(9)  | YES  |     | NULL    |       |
-- | MGR      | int(11)     | YES  |     | NULL    |       |
-- | HIREDATE | date        | YES  |     | NULL    |       |
-- | SAL      | double(7,2) | YES  |     | NULL    |       |
-- | COMM     | double(7,2) | YES  |     | NULL    |       |
-- | DEPTNO   | int(11)     | YES  |     | NULL    |       |
-- +----------+-------------+------+-----+---------+-------+
-- #####

-- emp03 테이블 데이터 insert 테스트.
-- 모든 값을 null 채워서 insert 하시오. 불가능. not null 조건 때문에.

-- empno에 10, ename에 abcd를 insert 하시오.



-- #####
-- emp04 테이블 생성 DDL 문을 작성하시오.
-- empno 에 not null 조건 설정.
-- ename 에 not null 조건 설정.
-- comm  에 default 조건 설정. default 값으로 100 사용.
-- +----------+-------------+------+-----+---------+-------+
-- | Field    | Type        | Null | Key | Default | Extra |
-- +----------+-------------+------+-----+---------+-------+
-- | EMPNO    | int(11)     | NO   |     | NULL    |       |
-- | ENAME    | varchar(10) | NO   |     | NULL    |       |
-- | JOB      | varchar(9)  | YES  |     | NULL    |       |
-- | MGR      | int(11)     | YES  |     | NULL    |       |
-- | HIREDATE | date        | YES  |     | NULL    |       |
-- | SAL      | double(7,2) | YES  |     | NULL    |       |
-- | COMM     | double(7,2) | YES  |     | 100     |       |
-- | DEPTNO   | int(11)     | YES  |     | NULL    |       |
-- +----------+-------------+------+-----+---------+-------+
-- #####
 CREATE TABLE "EMP04" 
   (	"EMPNO" NUMBER(11,0) NOT NULL ENABLE, 
	"ENAME" VARCHAR2(10 BYTE) NOT NULL ENABLE, 
	"JOB" VARCHAR2(9 BYTE), 
	"MGR" NUMBER(11,0), 
	"HIREDATE" DATE, 
	"SAL" NUMBER(7,2), 
	"COMM" NUMBER(7,2) DEFAULT 100, 
	"DEPTNO" NUMBER(11,0)
   )

-- emp04 테이블 데이터 insert 테스트.
-- 모든 값을 null 채워서 insert 하시오. 불가능. not null 조건 때문에.

-- empno에 10, ename에 abcd를 insert 하시오.




-- #####
-- emp06 테이블 생성 DDL 문을 작성하시오.
-- empno 에 not null 조건 설정.
-- ename 에 not null 조건 설정.
-- comm  에 default 조건 설정. default 값으로 100 사용.
-- empno 에 primary key 조건 설정.
-- +----------+-------------+------+-----+---------+-------+
-- | Field    | Type        | Null | Key | Default | Extra |
-- +----------+-------------+------+-----+---------+-------+
-- | EMPNO    | int(11)     | NO   | PRI | NULL    |       |
-- | ENAME    | varchar(10) | NO   |     | NULL    |       |
-- | JOB      | varchar(9)  | YES  |     | NULL    |       |
-- | MGR      | int(11)     | YES  |     | NULL    |       |
-- | HIREDATE | date        | YES  |     | NULL    |       |
-- | SAL      | double(7,2) | YES  |     | NULL    |       |
-- | COMM     | double(7,2) | YES  |     | 100     |       |
-- | DEPTNO   | int(11)     | YES  |     | NULL    |       |
-- +----------+-------------+------+-----+---------+-------+
-- #####



-- #####
-- emp07 테이블 생성 DDL 문을 작성하시오.
-- empno 에 not null 조건 설정.
-- ename 에 not null 조건 설정.
-- comm  에 default 조건 설정. default 값으로 100 사용.
-- empno 와 ename  에 primary key 조건 설정.
-- +----------+-------------+------+-----+---------+-------+
-- | Field    | Type        | Null | Key | Default | Extra |
-- +----------+-------------+------+-----+---------+-------+
-- | EMPNO    | int(11)     | NO   | PRI | NULL    |       |
-- | ENAME    | varchar(10) | NO   | PRI | NULL    |       |
-- | JOB      | varchar(9)  | YES  |     | NULL    |       |
-- | MGR      | int(11)     | YES  |     | NULL    |       |
-- | HIREDATE | date        | YES  |     | NULL    |       |
-- | SAL      | double(7,2) | YES  |     | NULL    |       |
-- | COMM     | double(7,2) | YES  |     | 100     |       |
-- | DEPTNO   | int(11)     | YES  |     | NULL    |       |
-- +----------+-------------+------+-----+---------+-------+
-- #####


-- #####
-- emp08 테이블 생성 DDL 문을 작성하시오.
-- empno 에 not null 조건 설정.
-- ename 에 not null 조건 설정.
-- comm  에 default 조건 설정. default 값으로 100 사용.
-- empno 와 ename  에 primary key 조건 설정.
-- empno 에 unique  조건 설정.
-- +----------+-------------+------+---------+---------+-------+
-- | Field    | Type        | Null | Key     | Default | Extra |
-- +----------+-------------+------+---------+---------+-------+
-- | EMPNO    | int(11)     | NO   | PRI     | NULL    |       |
-- | ENAME    | varchar(10) | NO   | PRI     | NULL    |       |
-- | JOB      | varchar(9)  | YES  |         | NULL    |       |
-- | MGR      | int(11)     | YES  |         | NULL    |       |
-- | HIREDATE | date        | YES  |         | NULL    |       |
-- | SAL      | double(7,2) | YES  |         | NULL    |       |
-- | COMM     | double(7,2) | YES  |         | 100     |       |
-- | DEPTNO   | int(11)     | YES  |         | NULL    |       |
-- | PHONE    | varchar(13) | YES  | UNI     | NULL    |       |
-- +----------+-------------+------+---------+---------+-------+
-- #####
 CREATE TABLE "EMP08" 
   (	"EMPNO" NUMBER(11,0) NOT NULL ENABLE, 
	"ENAME" VARCHAR2(10 BYTE) NOT NULL ENABLE, 
	"JOB" VARCHAR2(9 BYTE), 
	"MGR" NUMBER(11,0), 
	"HIREDATE" DATE, 
	"SAL" NUMBER(7,2), 
	"COMM" NUMBER(7,2) DEFAULT 100, 
	"DEPTNO" NUMBER(11,0), 
	"PHONE" VARCHAR2(13 BYTE), 
	 PRIMARY KEY ("EMPNO", "ENAME"),
   UNIQUE ("PHONE")
   )


-- #####
-- emp09 테이블 생성 DDL 문을 작성하시오.
-- empno 에 not null 조건 설정.
-- ename 에 not null 조건 설정.
-- comm  에 default 조건 설정. default 값으로 100 사용.
-- empno 와 ename  에 primary key 조건 설정.
-- empno 에 unique  조건 설정.
-- 
-- emp09.deptno 와 dept.deptno 에 foreign key 조건 설정.
-- +----------+-------------+------+---------+---------+-------+
-- | Field    | Type        | Null | Key     | Default | Extra |
-- +----------+-------------+------+---------+---------+-------+
-- | EMPNO    | int(11)     | NO   | PRI     | NULL    |       |
-- | ENAME    | varchar(10) | NO   | PRI     | NULL    |       |
-- | JOB      | varchar(9)  | YES  |         | NULL    |       |
-- | MGR      | int(11)     | YES  |         | NULL    |       |
-- | HIREDATE | date        | YES  |         | NULL    |       |
-- | SAL      | double(7,2) | YES  |         | NULL    |       |
-- | COMM     | double(7,2) | YES  |         | 100     |       |
-- | DEPTNO   | int(11)     | YES  |         | NULL    |       |
-- | PHONE    | varchar(13) | YES  | UNI     | NULL    |       |
-- +----------+-------------+------+---------+---------+-------+
-- #####


-- ######################  
-- 미션. ERD를 이용해서 DB를 구축하시오
-- 
-- 아래의 조건에 맞게 테이블을 만들고 제약 조건 PK, FK를 설정하시오. 
-- 
-- * employee 테이블;                            
-- +----------+--------------+------+-----+---------+-------+    
-- | Field    | Type         | Null | Key | Default | Extra |    
-- +----------+--------------+------+-----+---------+-------+    
-- | emp_no   | decimal(4,0) | NO   | PRI | 0       |       |    
-- | emp_name | varchar(20)  | YES  |     | NULL    |       |    
-- | salary   | decimal(6,0) | YES  |     | NULL    |       |    
-- | birthday | date         | YES  |     | NULL    |       |    
-- +----------+--------------+------+-----+---------+-------+    
-- 
-- 직원(employee) 테이블 기본 키에 제약조건 조건명 추가하시오. employee_pk_
 CREATE TABLE "EMPLOYEE" 
   (	"EMP_NO" NUMBER(4,0) DEFAULT 0 NOT NULL ENABLE, 
	"EMP_NAME" VARCHAR2(20 BYTE), 
	"SALARY" NUMBER(6,0), 
	"BIRTHDAY" DATE, 
	 CONSTRAINT "EMPLOYEE_PK" PRIMARY KEY ("EMP_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE
   )
   
   
-- * project 테이블;                             
-- +-------------+--------------+------+-----+---------+-------+ 
-- | Field       | Type         | Null | Key | Default | Extra | 
-- +-------------+--------------+------+-----+---------+-------+ 
-- | pro_no      | decimal(4,0) | NO   | PRI | 0       |       | 
-- | pro_content | varchar(100) | YES  |     | NULL    |       | 
-- | start_date  | date         | YES  |     | NULL    |       | 
-- | finish_date | date         | YES  |     | NULL    |       | 
-- +-------------+--------------+------+-----+---------+-------+ 
--
-- 프로젝트(project) 테이블에 기본 키를 추가하시오 제약조건 이름: project_pk 
  CREATE TABLE "PROJECT" 
   (	"PRO_NO" NUMBER(4,0) DEFAULT 0 NOT NULL ENABLE, 
	"PRO_CONTENT" VARCHAR2(100 BYTE), 
	"START_DATE" DATE, 
	"FINISH_DATE" DATE, 
	 CONSTRAINT "PROJECT_PK" PRIMARY KEY ("PRO_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE
   )
   
   
-- * specialty 테이블;                           
-- +-----------+--------------+------+-----+---------+-------+   
-- | Field     | Type         | Null | Key | Default | Extra |   
-- +-----------+--------------+------+-----+---------+-------+   
-- | emp_no    | decimal(4,0) | NO   | PRI | 0       |       |   
-- | specialty | varchar(20)  | NO   | PRI |         |       |   
-- +-----------+--------------+------+-----+---------+-------+   
--
-- 특기(specialty) 테이블에 외래 키를 추가하기 제약조건 이름: specialty_fk 
CREATE TABLE "SPECIALTY" 
   (	"EMP_NO" NUMBER(4,0) DEFAULT 0 NOT NULL ENABLE, 
	"SPECIALTY" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	 CONSTRAINT "SPECIALTY_PK" PRIMARY KEY ("EMP_NO", "SPECIALTY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE
   )
   
   
-- * assign 테이블;                              
-- +--------+--------------+------+-----+---------+-------+      
-- | Field  | Type         | Null | Key | Default | Extra |      
-- +--------+--------------+------+-----+---------+-------+      
-- | emp_no | decimal(4,0) | NO   | PRI | 0       |       |      
-- | pro_no | decimal(4,0) | NO   | PRI | 0       |       |      
-- +--------+--------------+------+-----+---------+-------+  
-- 담당(assign) 테이블에 기본 키를 추가하기 제약조건 이름: assign_pk
 CREATE TABLE "ASSIGN" 
   (	"EMP_NO" NUMBER(4,0) DEFAULT 0 NOT NULL ENABLE, 
	"PRO_NO" NUMBER(4,0) DEFAULT 0 NOT NULL ENABLE, 
	 CONSTRAINT "ASSIGN_PK" PRIMARY KEY ("EMP_NO", "PRO_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE
   )






-- table relation 
-- assign 테이블과 project 테이블 사이에 외래 키를 추가하기.제약조건명: specialty_fk
-- 담당(assign) 테이블과 직원 테이블 사이에 외래키를 추가하기제약조건 이름: specialty_fk
-- +--------------+---------------+-----------------------+
-- | child table  | parent table  |                       |
-- +--------------+---------------+-----------------------+
-- | specialty    | employee      | specialty_employee_fk |
-- | assign       | employee      | assign_employee_fk    |
-- | assign       | project       | assign_project_fk     |
-- +--------------+---------------+-----------------------+



























-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- 보류. 전문가 과정에서만...
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@





-- #####
-- . emp10 테이블 생성하시오.
-- empno 에 not null 조건을 사용하시오.
-- ename 에 not null 조건을 사용하시오.
-- comm  에 default 조건을 걸고 default 값으로 100 사용.
-- deptno는 int 타입으로.
-- empno 와 ename  에 primary key 조건을 설정하고 조건명으로 emp10_pk을 사용하시오.
-- deptno 에 unique  key 조건을 설정하고 조건명으로 emp10_uk을 사용하시오.
-- emp09.deptno 와 dept.deptno 에 foreign key 조건을 설정하고 조건명으로 emp10_fk을 사용하시오.
-- #####


-- @@@@@@@@@@@@@@@@
-- alter를 이용한 제약 조건 추가
-- @@@@@@@@@@@@@@@@
-- emp02.empno에 alter를 이용해서 primary key 추가
-- st1. emp02에 primary key 삭제.
-- st2. empno에 primary key 추가.

-- emp02.deptno에 alter를 이용해서  foreign key 추가
-- 외래키 설정전에 emp02.deptno와 dept.deptno컬럼 타입을 같게 만들어야 한다.

-- emp02.job에 alter를 이용해서 unique key 추가


-- 문제. dept 테이블에 auto_increment를 갖는 pid 컬럼 를 추가하시오.
-- auto_increment 로 설정하려면 반드시 key 가 되어야 한다.
-- pid 컬럼 추가.
-- pid 컬럼에  key 추가


-- @@@@@@@@@@@@@@@@
-- alter를 이용한 제약 조건 수정
-- @@@@@@@@@@@@@@@@


-- emp02.ename에 default 값을 abc로 바꾸시오.


-- emp02.job default 값을 '인턴'로 바꾸시오.


-- emp02.ename 을 not null 로 바꾸시오.


-- emp02.job 을 null 허용으로 바꾸시오.


-- @@@@@@@@@@@@@@@@
-- alter를 이용한 제약 조건 삭제
-- @@@@@@@@@@@@@@@@

-- emp10에서 primary key 조건 삭제하기

-- emp10에서 조건명으로 foreign key 조건 삭제하기

-- emp10에서 조건명으로 unique key 조건 삭제하기


-- ######################  
-- 미션. 외래키를 설정하시오
-- 
-- auth와 book 테이블이 존재한다. 이 두 테이블간에 릴레이션을 설정하려고 한다.
-- auth.authid와 book.authid 에 auth_book_fk 라는 이름의 외래키를 설정하시오.
-- 외래키 설정이 안된다면 왜 안되는 것인가?
-- 어떻게 하면 외래키 설정 문제를 해결 할 수 있을 것인가?
-- ######################


-- join을 이용해서 부모.자식관계 설정에 방해되는 데이터를 찾으시오.
-- left join을 이용하여 차집합 구하기. book - auth 

-- join을 이용해서 부모.자식관계 설정에 방해되는 데이터를 delete하시오.

-- 외래키 설정

-- 부모 테이블에 데이터 insert 하기.

-- 외래키 설정

-- join을 이용해서 부모.자식관계 설정에 방해되는 데이터를 찾으시오.
-- left join을 이용하여 차집합 구하기. book - auth 
  
  