select * from payment;

select avg(amount) from payment;
select count(staff_id) from payment where staff_id = 1;
select count(distinct amount) from payment;
-- select first(amount) from payment;
-- select last(amount) from payment;
select max(amount) from payment;
select min(amount) from payment;
select sum(amount) from payment;
-- scalar functions
select ucase(city) from city;
select lcase(city) from city;
select mid(city, 2,4) from city;
select round(amount) from payment;