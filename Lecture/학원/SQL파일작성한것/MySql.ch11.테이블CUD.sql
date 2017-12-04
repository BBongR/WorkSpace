-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 테이블 CUD
-- 테이블 추가           : CREATE TABLE  테이블명                   ;
-- 테이블 변경           : ALTER  TABLE  테이블명                   ; 
-- 테이블 삭제           : DROP   TABLE  테이블명                   ;
-- 테이블 이름 바꾸기     :  Mysql : rename 
                           Oracle : rename  
-- 테이블 복제           :  Mysql : CREATE TABLE 새테이블명 AS SELECT * FROM 원본테이블;
                           Oracle : SELECT *  INTO 새테이블명 FROM 원본테이블;
-- 테이블 로우 제거      :  MySQL : 
--                      :  Oralce : TRUNCATE TABLE 테이블명                 ; // DELETE 보다 속도가 빠름.
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2


-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 테이블 컬럼 CUD
-- 테이블 컬럼 추가      : ALTER  TABLE  테이블명 ADD          컬럼이름 컬럼타입 
-- 테이블 컬럼 삭제      : ALTER  TABLE  테이블명 DROP  COLUMN 컬럼이름 
-- 테이블 컬럼 변경 타입 : ALTER  TABLE  테이블명 ALTER COLUMN 컬럼이름 컬럼타입
-- 테이블 제약 변경 조건 : ALTER  TABLE  테이블명 ALTER COLUMN 컬럼이름 컬럼타입
-- 테이블 컬럼 변경 이름 : EXEC SP_RENAME '테이블이름.컬럼이름' , '새컬럼이름', 'COLUMN'
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- dept01 테이블을 삭제하시오.
drop table if exists dept01;



-- dept01 테이블을 추가하시오.
-- 컬럼에는 
-- ename     : 문자열
-- job       : 문자열
-- email     : 문자열 
-- address   : 문자열
-- sex       : F 또는 M  두개중에 한개만 저장될 수 있게.
-- phone     : 11자리~15자리
-- birthday  : 생일. 날짜만 저장.
-- birthtime : 생시. 시간만 저장.
-- age       : 정수. 999 까지만 저장가능하게. 
-- height    : 실수. 정수부분은 3자리, 소수부분은 2자리까지.
create table dept01(
     ename     nvarchar(10)
   , job       nvarchar(20)
   , email     nvarchar(50)
   , address   nvarchar(100)
   , sex       char(1) check(sex in ('F', 'M'))
   , phone     varchar(15)
   , birthday  date
   , birthtime time
   , age       int(3)
   , height    double(5, 2)
);

select * from dept01;

-- dept01 테이블을 삭제하시오.
drop table if exists dept01;


-- dept01 테이블을 테이블 디자이너를 이용하여 추가하시오.
-- 컬럼에는 
-- ename     : 문자열
-- job       : 문자열
-- email     : 문자열 
-- address   : 문자열
-- sex       : F 또는 M  두개중에 한개만 저장될 수 있게.
-- phone     : 11자리~15자리
-- birthday  : 생일. 날짜만 저장.
-- birthtime : 생시. 시간만 저장.
-- age       : 정수. 999 까지만 저장가능하게. 
-- height    : 실수. 정수부분은 3자리, 소수부분은 2자리까지.
-- dept01 테이블을 수정하시오.


-- email 컬럼에 not null 을 설정하시오.tbtesttbtesttbtest
-- dept01 테이블에 auto_increment(sequence)를 추가하시오.
alter table dept01 modify email varchar(50) not null;
show columns from dept01;

-- dept01 insert를 이용하여 데이터를 입력하시오. 
-- ename: abc, 나머지 컬럼 값은 null로 입력
insert into dept01( ename, email)
            values ( 'abc', '') ;
            
select * from dept01;


-- 문제. dept01 테이블에 salary 컬럼을 추가하되
-- 타입은 숫자형으로 하고 정수 10자리와 소수점 3자리,
-- 그리고 not null 조건을 설정하시오.

alter table dept01 add column salary double(13, 3) not null;
show columns  from dept01;


-- 문제. dept01 테이블의 addres 컬럼 타입을 nvarchar(1000)으로 바꾸시오.
alter table dept01 modify column address nvarchar(1000);
show columns from dept01;

-- 문제. dept01 테이블에서 birthtime 컬럼을 삭제하시오.
alter table dept01 drop column birthtime;
show columns from dept01;

-- 테이블 이름 바꾸기
-- dept01 을 dept_new로 바꾸시오.
rename table dept01 to dept_new;
-- show tables; --Mysql에서만 가능


-- @@@@@
-- 테이블  복제
-- 테이블 구조와 데이터를 복제 : CREATE TABLE 새로 만들테이블명 AS SELECT * FROM 복사할테이블명
-- 테이블 구조만 복제          : CREATE TABLE 새로 만들테이블명 LIKE 복사할테이블명
-- 테이블 복제시 제약 조건은 복제 되지 않는다
-- @@@@@


-- dept 테이블을 복제해서 dept02 테이블을 만드시오.
create table dept02 as select * from dept;
show tables; -- Mysql에서만 가능
show columns from dept02;
select * from dept02;


-- 테이블 구조만 복제
-- dept 테이블 구조를 복제해서 dept03 테이블을 만드시오. 데이터는 복제하지 마시오
create table dept03 like dept;
show tables;
show columns from dept03;
select * from dept03;



-- 문제. dept 테이블에서 auto_increment를 갖는 pid 컬럼 를 추가하시오.
-- auto_inceement로 설정하려면 반드시 primary key 가 되어야 한다
-- pid 컬럼 추가.
-- pid 컬럼에 key 추가
alter table dept drop column pid;
alter table dept add column            pid int(11) not null auto_increment
               , add unique key ukpid (pid);
show columns from dept;


-- 문제. emp 테이블의 구조와 데이터를 복제해서 dept11 테이블을 만드시오.
-- 테이블 목록 출력
-- 컬럼 목록 출력
-- 데이터 출력
create table dept11 as select * from emp;
show tables;
show columns from dept11;
select * from dept11;


-- 문제. emp 테이블의 구조만 복제해서 dept12 테이블을 만드시오.
-- 테이블 목록 출력
-- 컬럼 목록 출력
-- 데이터 출력
create table dept12 like emp;
show tables;
show columns from dept12;
select * from dept12;




-- @@@@@
-- 테이블  데이터 삭제
-- DELETE   : 테이블 상태 유지.     auto_increment 정보가 유지됨
-- TRUNCATE : 테이블 상태 초기화 .  auto_increment 정보가 초기화됨
-- @@@@@

-- tbtest 테이블을 만드시오
-- pid : 정수, not null, auto_increment
-- value : 문자열

-- +-------+----------------+------+-----+---------+----------------+
-- | Field | Type           | null | key | Default | Extra          | 
-- | pid   | int(11)        |  No  | PRI | NULL    | auto_increment |
-- | val   | varchar(1000)  | YES  |     | NULL    |                |
-- +-------+----------------+------+-----+---------+----------------+
-- +---------------+
-- |  pid  |  val  |
-- +---------------+
-- |  1   |    a   |
-- |  2   |    b   |
-- |  3   |    c   |
-- |  4   |    d   |
-- +---------------+

drop table tbtest;

create table tbtest(
   pid int(11) not null auto_increment primary key
   , val nvarchar(1000)
   );

insert into tbtest( pid, val)
            values ( 5, 'a') 
            , ( 6, 'b') 
            , ( 7, 'c') 
            , ( 8, 'd') ;
            

-- e, f, g, h를 한번에 입력하는 insert문을 작성하시오.
insert into tbtest(val) values('e')
                        , ('f')
                        , ('g')
                        , ('h');
                        
         
select * from tbtest;
                           
delete from tbtest;
select * from tbtest;
insert into tbtest(val) values('a1');
select * from tbtest;

-- 문제 tbtest 테이블에서 truncate을 사용하여 데이터를 제거한 후
--  tbtest 테이블에 a2값을 입력
truncate tbtest;            -- delete는 기존의 테이블 정보가 그대로 유지 truncate는 기존의 테이블 정보가 삭제.
select * from tbtest;
insert into tbtest(val) values('a2');
select * from tbtest;


-- delete   방식:  auto_increment 컬럼 초기화 안됨
-- 문제. dept11 테이블은 delete을 사용하여 데이터를 제거하고 디자이너에서 값을 입력
-- 

-- 문제. dept12 테이블은 truncate을 사용하여 데이터를 제거하시오.
-- truncate 방식:  auto_increment 컬럼 초기화 됨


-- ########################
-- Database 목록 조회
-- MySQL : show DB명
-- Oracle : 
-- ########################
show databases;


-- ########################
-- 테이블 목록 조회 
-- MySQL : show tables;
-- Oracle : 
-- ########################
show tables;

-- ########################
-- 컬럼 목록 조회
-- MySQL : show columns from 테이블명;
-- Oracle : 
-- ########################
show columns from dept;