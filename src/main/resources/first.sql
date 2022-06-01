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
SELECT type, count(type) from location group by type;


-- Create table into database
create table vendor(
	id int PRIMARY KEY,
    code varchar(20),
    name varchar(20),
    type varchar(20),
    email varchar(20),
    phone varchar(20),
    address varchar(20)
);

select * from vendor;

drop table vendor;


-- -----------------------------------
-- Reservation details ---------------
-- ------------------------------------
CREATE DATABASE RESERVATION;

USE RESERVATION;

CREATE TABLE USER (
		ID INT NOT NULL AUTO_INCREMENT,
        FIRST_NAME VARCHAR(20),
        LAST_NAME VARCHAR(20),
        EMAIL VARCHAR(20),
        PASSWORD VARCHAR(20),
        PRIMARY KEY(ID),
        UNIQUE KEY(EMAIL)
);
select * FROM USER;
SELECT * FROM RESERVATION.USER;

CREATE TABLE FLIGHT (
	ID INT NOT NULL auto_increment,
    FLIGHT_NUMBER VARCHAR(20) NOT NULL,
    OPERATING_AIRLINES VARCHAR(20) NOT NULL,
    DEPARTURE_CITY VARCHAR(20) NOT NULL,
    ARRIVAL_CITY VARCHAR(20) NOT NULL,
    DATE_OF_DEPARTURE DATE NOT NULL,
    ESTIMATED_DEPARTURE_TIME TIMESTAMP default current_timestamp,
    primary key(ID)
); 
SELECT * FROM FLIGHT;

CREATE TABLE PASSENGER (
	ID INT NOT NULL AUTO_INCREMENT,
    FIRST_NAME VARCHAR(256),
	LAST_NAME VARCHAR(256),
    MIDDLE_NAME VARCHAR(256),
    EMAIL VARCHAR(50),
    PHONE VARCHAR(50),
    primary key(ID)
);
SELECT * FROM PASSENGER;

CREATE TABLE RESERVATION(
	ID INT NOT NULL auto_increment,
    CHECKED_IN TINYINT(1),
    NUMBER_OF_BAGS INT,
    PASSENGER_ID INT,
    FLIGHT_ID INT,
    CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(ID),
    FOREIGN KEY (PASSENGER_ID) REFERENCES PASSENGER(ID) ON DELETE CASCADE,
    FOREIGN KEY (FLIGHT_ID) REFERENCES FLIGHT(ID)
);
SELECT * FROM RESERVATION;





