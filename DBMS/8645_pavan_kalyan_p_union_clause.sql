use sakila;
select * from city ;
-- select * from country ;
-- select country_id,country from country union all select country_id,city from city;
select city.*,country.*
from city right join country
on city.country_id=country.country_id 
union all
select city.*,country.*
from city left join country
on city.country_id=country.country_id;

select city.*,country.*
from city right join country
on city.country_id=country.country_id 
union
select city.*,country.*
from city left join country
on city.country_id=country.country_id;