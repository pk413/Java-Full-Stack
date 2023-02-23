select * from film;
 create view film_view as select title, rental_duration, length from film; 
 select * from film_view;
 update film_view set length=90 where title='academy dinosaur';
 create view customer_view as select customer_id,store_id,first_name,address_id from customer where customer_id is not null with check option;
 select * from customer_view;
 -- delete from customer_view where address_id=5;
 drop view customer_view;