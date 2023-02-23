use edubridge;
create table employee(emp_id int,emp_name char(20),job_name char(20),manager_id int(10),hire_date date,salary double(6,2),commission char(20),dep_id int(10) );
desc employee;
insert into employee(emp_id,emp_name,job_name,hire_date,salary,dep_id) values(68319,"KAYLING","PRESIDENT",'1991-11-18',6000.00,1001);
insert into employee(emp_id,emp_name,job_name,manager_id,hire_date,salary,dep_id) values(66928,"BLAZE","MANAGER",68319,'1991-05-01',2750.00,3001),
																						(67832,"CLARE","MANAGER",68319,'1991--06-09',2550.00,1001),
                                                                                        (65646,"JONAS","MANAGER",68319,'1991-04-02',2957.00,2001),
                                                                                        (67858,"SCARLET","ANALYST",65646,'1997-04-19',3100.00,2001),
                                                                                        (69062,"FRANK","ANALYST",65646,'1991-12-03',3100.00,2001);
select * from employee;
alter table employee modify column commission varchar(30);
alter table employee drop column commission;
alter table employee add commission char(20);
update employee set commission='Y' where dep_id=1001 or dep_id=3001;
delete from employee where job_name="ANALYST";
DELETE FROM EMPLOYEE WHERE JOB_NAME="MANAGER" AND EMP_NAME="CLARE";
UPDATE EMPLOYEE SET MANAGER_ID=68310 WHERE JOB_NAME="PRESIDENT";
TRUNCATE EMPLOYEE;
select * FROM EMPLOYEE;
DROP table EMPLOYEE;