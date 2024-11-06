DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, price double, name VARCHAR(255), PRIMARY KEY (id),  productKey int, FOREIGN KEY(productKey)
 REFERENCES infoAboutProducts(id));
INSERT INTO products (id,name, price) VALUES (1, 'bred', 80.22, 1), (2,'Milk', 50.45, 2), (3,'sugar', 80.23, 3);
DROP TABLE infoAboutProducts IF EXISTS;
CREATE TABLE IF NOT EXISTS infoAboutProducts (id bigserial,structure VARCHAR(255) , weight DOUBLE ,data INTEGER , PRIMARY KEY (id) );
INSERT INTO infoAboutProducts (id,structure, weight, data) VALUES (1, 'мука, сахар, соль', 80.22, 32), (2,'порошок молочный, вода, сахар', 50.45, 2323),
 (3,'вода, концентрат сахара, сода', 80.23, 233);
