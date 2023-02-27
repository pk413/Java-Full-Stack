select * from employee;
select * from department;
insert into employee(empid,empname,managerid,deptid,salary,DOB) values (1,"Emp 1",0,1,6000,'1982-08-06'),(2,"Emp 2",0,5,6000,'1982-07-11'),(3,"Emp 3",1,1,2000,'1983-11-21'),(13,"Emp 13",5,5,2000,'1984-03-09'),(3,"Emp 3",1,1,2000,'1983-11-21');
insert into employee(empid,empname,managerid,deptid) values(7,"Emp 7",5,5);
insert into department (deptid,deptname) values(1,'IT'),(2,'Admin');

select e.empid,e.empname, e.deptid from employee e left outer join department d on e.deptid = d.deptid where d.deptid is null;
select e.empid,e.empname, e.deptid from employee e where e.deptid not in (select deptid from department) ;
select e.empid,e.empname, e.deptid from employee e where not exists (select deptid from department where e.deptid=department.deptid); 

Select distinct e.empid,e.empname,e.salary from employee e, employee e1 where e.salary =e1.salary and e.empid != e1.empid;

select empid,empname, salary, count(*) as cnt from employee group by empid,empname, salary having count(*)>1;

/* the following script is not working
set rowcount 1
delete from employee where empid in ( select empid from employee group by empid,empname, salary having count(*)>1 );
set rowcount 0   
*/

select max(salary) from employee where salary not in (select max(salary) from employee);

select * from employee e where 2 = (select count(distinct e1.salary) from employee e1 where e1.salary>e.salary);

select * from employee where datediff(year,dob, getdate()) > 30;

select distinct empname from employee where dob between '01/01/1960' and '12/31/1987';

select deptid, max(salary) as salary from employee group by deptid;

select deptname from department d where d.deptname='it' union all select deptname from department d1 where d1.deptname='it';
select d.deptname from department d, department d1 where d.deptname='it' ;
-- also cross join alias same table

Select empid, empname from employee where empname like '[aeiou]%';

select * from employee where empid %2 !=0;

Create view v_employee As select empid, empname, salary From employee;

Select * from v_employee;
Select * from v_employee;
