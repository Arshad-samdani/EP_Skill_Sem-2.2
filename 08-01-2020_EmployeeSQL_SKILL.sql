create database EP_Skill_Week_3;
use EP_Skill_Week_3;

create table employee(
	NAME varchar(200),
    ID int not null primary key,
    AGE int,
    Dept varchar(200),
    DOB date,
    salary int,
    Designation varchar(200)
);

desc employee;

insert into employee (NAME, ID, AGE, Dept, DOB, salary, Designation) 
values ('A',101,29,'cyber security','1990-10-20',30000,'Manager'),
       ('B',102,30,'IT','1989-01-10',24000,'Line Manager'),
       ('C',103,26,'HR','1995-08-2',32000,'Team Leader'),
       ('D',104,22,'cyber security','1999-06-25',28000,'People Manager'),
       ('E',105,33,'cyber security','1987-12-14',29000,'Transition Manager'),
       ('F',106,30,'cyber security','1989-02-14',32000,'Senior Manager');

SELECT * FROM employee;

DELETE FROM employee WHERE ID = 106;

UPDATE employee SET Dept = 'PAM dept', Designation = 'Senior Manager' WHERE ID= 105;

SELECT * FROM employee;