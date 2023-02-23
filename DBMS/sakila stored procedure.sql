delimiter //

create procedure film_procedure() 
begin
	select * from film;
end //

delimiter ;

call film_procedure();