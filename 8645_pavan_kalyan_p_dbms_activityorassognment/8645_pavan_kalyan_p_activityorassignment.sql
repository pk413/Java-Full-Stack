use sakila;
select * from customer;
select first_name, sum(address_id) from customer group by first_name;
select store_id, first_name,address_id from customer group by first_name having count(address_id)>=2;
select * from customer where first_name like 'a%';

select * from city;
select * from country;
select * from city inner join country on city.country_id = country.country_id;
select * from country right join city on country.country_id = city.country_id;
select * from city left join country on city.country_id = country.country_id;
-- select * from city full join country on city.country_id = country.country_id;

select city.city_id,city.city,country.country from city cross join country;
select city.city,country.country_id from city, country where city.city_id<2;
select city.city,country.country,country.country_id from city, country where city.country_id=country.country_id;
select city.city,country.country,country.country_id from city, country where city.city_id between country.country and country.country_id;