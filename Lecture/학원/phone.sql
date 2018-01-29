select * from tb_phone;

insert into tb_phone(  name , manufacturer, price )
              values( 'aaaa',    'bbbb'   , 10000 );
              
select * from tb_phone where name = 'aaaa';