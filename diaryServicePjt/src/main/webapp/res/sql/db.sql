show databases;

create database db_diary;

use db_diary;

drop database db_member;

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

set @@auto_increment_increment = 1;
SET GLOBAL auto_increment_increment = 1;

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










-- 백신 접종 현황 시스템 DB ----------------------------------------------------------
create database db_vaccin;
show databases;
use db_vaccin;

-- 백신 타입 테이블 -------------
create table tbl_fv_type(
	fv_type_no              int auto_increment comment '백신 번호',
	fv_type                 varchar(1) not null comment '백신 타입',
	fv_type_manuf_country   varchar(20) not null comment '백신 제조국',
	fv_type_manuf_date      varchar(20) not null comment '백신 제조일',
	primary key(fv_type_no)
);

select * from tbl_fv_type;
desc tbl_fv_type;
drop table tbl_fv_type;



insert into tbl_fv_type(fv_type, fv_type_manuf_country, fv_type_manuf_date)
values('A', '한국', '2023-01-10');

insert into tbl_fv_type(fv_type, fv_type_manuf_country, fv_type_manuf_date)
values('B', '미국', '2023-01-15');

insert into tbl_fv_type(fv_type, fv_type_manuf_country, fv_type_manuf_date)
values('C', '영국', '2023-02-07');

insert into tbl_fv_type(fv_type, fv_type_manuf_country, fv_type_manuf_date)
values('D', '스웨덴', '2023-01-17');

insert into tbl_fv_type(fv_type, fv_type_manuf_country, fv_type_manuf_date)
values('E', '덴마크', '2022-12-22');

-- 접종처 테이블 ----------------------
create table tbl_fv_location(
	fv_location_no      int         not null comment '접종처 번호',
	fv_location_name    varchar(20) not null comment '접종처 이름',
	fv_location_addr    varchar(30) not null comment '접종처 주소',
	fv_location_phone   varchar(20) not null comment '접종처 연락처',
	fv_location_manager varchar(20) not null comment '담당자',
	primary key(fv_location_no)
);

select * from tbl_fv_location;
desc tbl_fv_location;
insert into tbl_fv_location values(1001, 'A접종처', 'AAA시 aaa구 471-013', '010-0000-8426', 'A담당');
insert into tbl_fv_location values(1002, 'B접종처', 'BBB시 bbb구 789-123', '010-1111-8426', 'B담당');
insert into tbl_fv_location values(1003, 'C접종처', 'CCC시 ccc구 456-789', '010-2222-8426', 'C담당');
insert into tbl_fv_location values(1004, 'D접종처', 'DDD시 ddd구 120-333', '010-3333-8426', 'D담당');
insert into tbl_fv_location values(1005, 'E접종처', 'EEE시 eee구 432-567', '010-4444-8426', 'E담당');

-- 주민등록번호 테이블 --------------------------
create table tbl_social_number(
	ss_number    varchar(20) not null comment '주민등록 번호',
	ss_name      varchar(20) not null comment '이름',
	ss_addr      varchar(30) not null comment '주소',
	ss_phone     varchar(20) not null comment '연락처',
	ss_reg_date  timestamp default current_timestamp comment '등록일',
	primary key(ss_number)
);

select * from tbl_social_number;
desc tbl_social_number;

insert into tbl_social_number(ss_number, ss_name, ss_addr, ss_phone) 
values('720520-1018547', '홍길동', 'AAA시 BBB구 CCC동 123-10', '010-458-8541');

insert into tbl_social_number(ss_number, ss_name, ss_addr, ss_phone) 
values('710210-2084561', '박찬호', 'DDD시 EEE구 FFF동 456-20', '010-412-9514');

insert into tbl_social_number(ss_number, ss_name, ss_addr, ss_phone) 
values('941230-1075214', '박세리', 'GGG시 HHH구 III동 789-30', '010-958-7536');

insert into tbl_social_number(ss_number, ss_name, ss_addr, ss_phone) 
values('650215-2050128', '이병규', 'JJJ시 KKK구 LLL동 987-40', '010-528-1478');

insert into tbl_social_number(ss_number, ss_name, ss_addr, ss_phone) 
values('800710-1025698', '손흥민', 'MMM시 NNN구 OOO동 654-50', '010-296-5236');


-- 백신 접종 현황 테이블 --
create table tbl_flu_vaccin_person(
 	fvp_no          int         auto_increment comment '접종 번호',
	fvp_name        varchar(30) not null comment '접종자 이름',
	ss_number       varchar(20) not null comment '주민등록 번호',
	fvp_mail        varchar(30) not null comment '접종자 메일',
	fvp_phone       varchar(30) not null comment '접종자 연락처',
	fv_location_no  int         not null comment '접종처 번호',
	fv_type         varchar(1)  not null comment '백신 타입',
	fvp_reg_date timestamp    default CURRENT_TIMESTAMP comment '등록일',
	primary key(fvp_no)
);

select * from tbl_flu_vaccin_person;
desc tbl_flu_vaccin_person;


-- 관리자 멤버 테이블 ------------------------------------------------
create table tbl_admin(
	admin_no      int auto_increment,
	admin_id      varchar(20) unique not null,
	admin_pw      varchar(20)        not null,
	admin_mail    varchar(50) not null,
	admin_phone   varchar(30) not null,
	admin_reg_date   timestamp default current_timestamp,
	admin_mod_date   timestamp default current_timestamp on update current_timestamp,
	primary key(admin_no)
);

insert into tbl_admin(admin_id, admin_pw, admin_mail, admin_phone) 
values('gildong', '1234', 'gildong@gmail.com','010-1234-5678');

insert into tbl_admin(admin_id, admin_pw, admin_mail, admin_phone) 
values('chanho', '0000', 'chanho@gmail.com','010-0000-0000');

insert into tbl_admin(admin_id, admin_pw, admin_mail, admin_phone) 
values('saeri', '1111', 'saeri@gmail.com','010-1111-1111');

desc tbl_admin;
select * from tbl_admin;
drop table tbl_admin;


select * from tbl_flu_vaccin_person fvp
join tbl_social_number sn
on fvp.ss_number = sn.ss_number
join tbl_fv_location fl
on fvp.fv_location_no = fl.fv_location_no
join tbl_fv_type ft
on fvp.fv_type = ft.fv_type
order by fvp.fvp_no desc;



















