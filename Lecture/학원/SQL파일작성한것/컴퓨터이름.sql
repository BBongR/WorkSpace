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