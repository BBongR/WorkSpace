-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 트랜잭션(transaction)
-- 
-- 데이터 처리의 논리적 작업 단위 
--		여러 개의 SQL 명령문( insert, update, delete )들의 묶음으로 처리.
--     select 문은 transaction의 대상이 아니다
-- 
-- 트랜잭션 목적:
--     데이터의 일관성 보장. all or nothing.
--		여러 개의 SQL문이 집합이 정상적으로 처리되면 정상 종료
--		여러 개의 SQL문이 중에서 하나의 SQL문이라도 잘못되면 전체 취소
-- 
-- start transaction :
-- COMMIT    : 정상 종료. 변경 사항 영구 저장. ctrl+s
-- ROLLBACK  : 전체 취소. 변경 사항 취소. ctrl+z
-- SAVEPOINT : rollback의 위치 지정. breakpoint와 유사. 실제로는 잘 사용되지 않음.
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2


-- @@@@@
-- 트랜잭션 시작
-- 
-- 작업 1. 이병헌 삭제하시오.
--      savepoint tran1 설정
--      delete
-- 작업 2. 대리를 과장으로 바꾸시오.
--      savepoint tran2 설정
--      update
-- 작업 3. 추신수를 이사로 바꾸시오.
--      savepoint tran3 설정
--      update
-- 작업 4. 추신수의 변경사항을 취소하시오. job을 원래대로 되돌린다.
--         tran3 부분 되돌리기. 
-- 작업 5. 트랜잭션 완료. commit 
-- 작업 6. 전체 되돌리기. rollback
-- @@@@@

-- 트랜잭션 시작
start transaction;

-- 작업 1. 이병헌 삭제하시오.
savepoint tran1;
delete from emp where ename = '이병헌';

-- 작업 2. 대리를 과장으로 바꾸시오.
savepoint tran2;
update emp set job = '과장' where job = '대리';

-- 작업 3. 추신수를 이사로 바꾸시오.
savepoint tran3;
update emp set job = '이사' where ename = '추신수';
select * from emp where ename = '추신수';

-- 작업 4. 부분 되돌리기. 추신수의 변경사항을 취소하시오
rollback to trans3;
select * from emp where ename = '추신수';
-- 작업 5.트랜잭션 완료. transaction 종료
commit;

-- 전체 되돌리기. transaction 종료
rollback;

select * from emp;


