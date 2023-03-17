-- Seleccionar la base de datos 
use business;
-- Revisar que hay en cada tabla 
select * from employee;
-- ALIAS
select last_name as 'Apellido' from employee;
-- Alias ++
select 
	employee_id as 'ID',
	first_name  as 'Nombre',
	last_name as 'Apellido',
	salary as 'Salario',
	department as 'Depaartamento'			
from employee;
-- Filtrar por nombre 
-- Buscar a monica 
select * from employee
where first_name = 'Monika';
-- Filtrado doble
select * from employee
where salary = 500000 and first_name = 'Vivek';
-- Filtrar por NOT
select * from employee
where not first_name = 'barrack';
-- filtrar por doble negacion 
select * from employee
where not first_name = 'santiago' and not first_name = 'ian';
-- Ordenamiento
select * from employee
order by department asc, first_name desc;
-- IN 
select * from employee
where employee_id in (1,3,7,8,5);
-- Between
select * from employee
where salary between 200000 and 500000;
-- limit
select * from employee
limit 3;
select * from employee
limit 3 offset 3;
-- LIKE
select * from employee
where last_name like binary '%A';
select * from employee
where join_date like binary '%02%';
-- UPDATE
update employee
	set salary = 300000
where employee_id = 5;
select * from employee;
update employee
	set department = 'real estate'
where employee_id = 6;
