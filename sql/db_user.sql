create database db_user

use db_user

create table emp(
    u_id int identity(1,1) primary key,
	u_name char(20) ,
    u_sex varchar(10) ,
	u_password varchar(50) ,
    
)

insert into emp  values('����','��','123456')
insert into emp values('����','Ů','123456')
insert into emp values('��˹��','��','123456')
insert into emp values('����','��','123456')
insert into emp values('С��','��','123456')

select * from emp


