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

drop table tbl_member;

select count(*) cnt from tbl_member where memId = 'gildong';

delete from tbl_member;

SET GLOBAL auto_increment_increment = 3;

select 
    * 
from 
    tbl_member 
where 
    memId = 'gildong';


create table tbl_diary(
    diaryNo        int auto_increment,
    diaryWord     varchar(100) not null,
    memId         varchar(20) unique not null,
    diaryRegDate     timestamp default current_timestamp,
    diaryModDate     timestamp default current_timestamp on update current_timestamp,
    primary key(diaryNo)
) auto_increment = 10001;

alter table tbl_diary
drop index memId;

show tables;
desc tbl_diary;
select * from tbl_diary;

-- table join
select * from tbl_diary td
join tbl_member tm
on td.memId = tm.memId
where td.memId = 'chanho';





