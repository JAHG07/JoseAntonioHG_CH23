insert into users 
(First_name,Last_name,Fav_food)
values
('Jose Antonio','Haro','chimichangas'),
('Rodri','Chino','trolebus'),
('Gera','Sosa','papitas');
-- Selecciona todo de una tabla 
select * from users;
select First_name from users;
insert into pets
(First_name,Fav_food,`Type`,Users_idUsers)
values
('Griselo','Fresas','Nejo',1),
('Vanilla','Carne','Doggo',2),
('PProni','Huesitos','Doggo',3);
-- selecciona todo de pets
select * from pets;
-- Filtrar por FK para idenftificar a owners
select * from pets
where Users_idUsers = 3;
-- Yo
insert into users 
(First_name,Last_name,Fav_food)
values 
('Jose Antonio','Haro Gonzalez','Chimichangas');

insert into pets
(First_name,Last_name,Fav_food,`Type`,Users_idUsers)
values
('Zorrillo','Gamboa','Carne','Doggo',4);
select * from pets;
-- Alejandro
INSERT INTO users
(first_name, last_name, fav_food)
VALUES
('Alejandro', 'Hernandez', 'Lasagna');

insert into `pets`
(first_name, fav_food, `type`, users_idusers)
values
('Niebla', 'Pollo', 'Pug', 5);
-- Daniel
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Daniel', 'Guzman', 'Pizza');

INSERT INTO `pets`
(First_name, Last_name,Fav_food, `Type`, Users_idUsers)
VALUES 
('Maya', 'Lobita','Croquetonas', 'HUSKY', 6);
-- Cesar
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Cesar', 'Reyes', 'Carnita Asada');

INSERT INTO `pets`
(First_name, Last_name,Fav_food, `Type`, Users_idUsers)
VALUES 
('Max', 'Reyes','Carne', 'HUSKY', 6);
-- Ingrid 
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES 
('Ian', 'Galeana', 'Tacos');

INSERT INTO `pets`
(first_name, `type`,Users_idUsers)
VALUES 
('Ezequiel', 'Gato', 7);

