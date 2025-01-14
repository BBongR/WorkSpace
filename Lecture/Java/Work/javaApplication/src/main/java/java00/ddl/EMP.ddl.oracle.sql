-- 부서 테이블 제거하기
BEGIN EXECUTE IMMEDIATE 'DROP TABLE EMP'; EXCEPTION WHEN OTHERS THEN NULL; END; 
/
-- 사원 테이블 제거하기
BEGIN EXECUTE IMMEDIATE 'DROP TABLE DEPT'; EXCEPTION WHEN OTHERS THEN NULL; END; 
/


-- 부서 테이블 생성하기
CREATE TABLE DEPT(
     DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
     DNAME VARCHAR2(14),
     LOC   VARCHAR2(13)
);

-- 사원 테이블 생성하기
CREATE TABLE EMP( 
     EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
     ENAME VARCHAR2(10),
     JOB   VARCHAR2(9),
     MGR  NUMBER(4),
     HIREDATE DATE,
     SAL NUMBER(7,2),
     COMM NUMBER(7,2),
     DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT
);
    
     

-- 사원 테이블에 샘플 데이터 추가하기
INSERT INTO DEPT VALUES(10, '경리부', '서울');
INSERT INTO DEPT VALUES(11, '회계팀', '서울');
INSERT INTO DEPT VALUES(20, '인사부', '인천');
INSERT INTO DEPT VALUES(21, 'HR팀'  , '인천');
INSERT INTO DEPT VALUES(30, '영업부', '용인'); 
INSERT INTO DEPT VALUES(31, '개발팀', '용인'); 
INSERT INTO DEPT VALUES(40, '전산부', '수원');
INSERT INTO DEPT VALUES(41, '서버부', '수원');


-- 부서 테이블에 샘플 데이터 추가하기
INSERT INTO EMP VALUES(1001, '김사랑', '사원', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '한예슬', '대리', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250,   80, 30);
INSERT INTO EMP VALUES(1003, '오지호', '과장', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500,  100, 30);
INSERT INTO EMP VALUES(1004, '이병헌', '부장', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '신동협', '과장', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450,  200, 30);
INSERT INTO EMP VALUES(1006, '장동건', '부장', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '이문세', '부장', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '감우성', '차장', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500,    0, 30);
INSERT INTO EMP VALUES(1009, '안성기', '사장', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '이병헌', '과장', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '조향기', '사원', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '강혜정', '사원', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '박중훈', '부장', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1014, '조인성', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1015, '김현수', '사원', 1008, to_date('2012-11-09','yyyy-mm-dd'), 250, NULL, 31);
INSERT INTO EMP VALUES(1016, '강정호', '사원', 1008, to_date('2013-01-09','yyyy-mm-dd'), 250, NULL, 31);
INSERT INTO EMP VALUES(1017, '이대호', '사원', 1008, to_date('2011-03-09','yyyy-mm-dd'), 250, NULL, 31);
INSERT INTO EMP VALUES(1018, '추신수', '대리', 1004, to_date('2016-10-04','yyyy-mm-dd'),1000, NULL, 21);



COMMIT;