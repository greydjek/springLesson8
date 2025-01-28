create table if not exists product_model (id bigserial primary key, name VARCHAR(255), price DOUBLE);

insert into product_model (name, price)
values
('bred', 21.23),
('water', 31.56 ),
('waster', 31.56),
('still_water', 31.56),
('gas_water', 31.56),
('min_water', 31.56),
('avatar', 31.56),
('tomato', 31.56),
('apple', 31.56),
('meet', 31.56),
('milk', 51.78);