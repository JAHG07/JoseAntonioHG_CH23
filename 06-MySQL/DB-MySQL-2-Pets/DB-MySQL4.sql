-- Intersection
-- Students with contries 
use generation;
select * from students;
select * from countries;
select * from courses_has_students;
select * from courses;
select * from modules;
-- Encaontrar a que pais pertenecen 
select 
	students.idStudent as 'ID',
	students.name as 'nomre S',
    students.last_name as 'Apellido',
	countries.name as 'Pais',
    countries.code as 'Codigo'
from students 
inner join countries
on students.nationality = countries.idCountries;
-- Encontramos que tipo de id tiene la raza 
select
	students.idStudent as 'ID',
	students.name as 'nomre S',
    students.last_name as 'Apellido',
    idtypes.name as 'Documentacio'
from students
inner join idtypes
on students.IdType_id = idtypes.id_idTypes;
-- Abreviaciones 
SELECT 
    t1.name,
    t2.name,
    t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;
-- Estudiantes que esten registrados en un curso 
SELECT 
    t1.name,
    t1.idStudent,
    t1.last_name,
    t2.course_code
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student;

select 
	t1.name as 'nombre',
    t1.last_name as 'apellido',
    t2.course_code as 'codigo de curso',
    t3.name as 'nombre del curso',
    t3.credits as 'creditos'
from students t1
inner join courses_has_students t2
on t1.idStudent = t2.students_id_student
inner join courses t3
on t2.course_code = t3.code;
-- - -------------------------------
SELECT 
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;
-- Encontrar estudiantes del pais 125   ----------------
select * from students where nationality = 125;
-- Encontrar estudiante pertenezca al curso java-1  ----------
select count(*) from courses_has_students where course_code = 'JAVA-1';
-- Contar estudiantes por cada modulo  ---------------
select * from courses_has_students;
select * from courses;
select * from modules;
select * from students;

select modules.code, count(*)
from modules
inner join courses
on modules.code = courses.module_code
inner join courses_has_students
on courses.code = courses_has_students.course_code
group by modules.code;
--  Encontrar estudiantes SIN curso
select count(idStudent) from students;




	

