-- Min
select min(salary) from employee;
select min(last_name) from employee;
-- Max
select max(salary) from employee;
select max(last_name) from employee;
-- Average
select avg(salary) as promedio from employee;
select avg(join_date) from employee;
select avg(last_name) from employee;
-- Suma
select sum(employee_id) , sum(salary) from employee;
-- Conteo 
select count(employee_id) from employee;
select count(distinct(salary)) as NumSalary from employee;