show databases;

create database projectdb;

use projectdb;

create table studenttab(
	id int PRIMARY KEY AUTO_INCREMENT,
	cname varchar(20),
	scourse varchar(30),
	sfee int
);


select * from studenttab;

drop table studenttab;
