show databases;

create database db_diary;

use db_diary;

create table tbl_member(
memNo	  int  auto_increment comment '회원번호',
memId	  varchar(20)	unique not null	comment '회원아이디',
memPw	  varchar(20)	not null	comment '회원비번',
memMail	  varchar(50)				comment '회원메일',
memPhone  varchar(50)				comment '회원연락처',
memRegDate	timestamp default current_timestamp		comment '회원등록일',
memModDate	timestamp default current_timestamp on update current_timestamp	comment '회원최근수정일',
primary key(memNo)
) auto_increment = 1001;

show tables;
desc tbl_member;
select * from tbl_member;

insert into tbl_member(memId, memPw, memMail, memPhone) 
values('gildong', '1234', 'gildong@gmail.com','010-1234-5678');

insert into tbl_member(memId, memPw, memMail, memPhone) 
values('chanho', '0000', 'chanho@gmail.com','010-1111-1111');

set @@auto_increment_increment = 3;

insert into tbl_member(memId, memPw, memMail, memPhone) 
values('saeri', '1111', 'saeri@gmail.com','010-2222-2222');

insert into tbl_member(memId, memPw, memMail, memPhone) 
values('saeri2', '1111', 'saeri@gmail.com','010-2222-2222');

drop table tbl_member;


