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

create table customertab(
	id int PRIMARY KEY auto_increment,
    cname varchar(20),
    cemail varchar(30)
);

select * from customertab;

-- the location table creation for other operation
use projectdb;

create table location (
	id int PRIMARY KEY,
    code varchar(20),
    name varchar(20),
    type varchar(10)
);

SELECT * FROM location;

