create database db_user

use db_user

create table emp(
    u_id int identity(1,1) primary key,
	u_name char(20) ,
    u_sex varchar(10) ,
	u_password varchar(50) ,
    
)

insert into emp  values('张三','男','123456')
insert into emp values('阿狸','女','123456')
insert into emp values('崔斯特','男','123456')
insert into emp values('王五','男','123456')
insert into emp values('小冰','男','123456')

select * from emp


