create table if not exists infoAboutProduct (id bigserial primary key, name VARCHAR(255), weight DOUBLE, days INTEGER);
insert into infoAboutProduct (name, weight, days)
values
('bred' , 1.25, 2),
('milk' , 1.00, 2),
('shugar' , 1.00, 2),
('apple' , 50.654, 2),
('chess' , 20.45, 2);