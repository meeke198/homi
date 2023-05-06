CREATE DATABASE `shopping-cart-04`;
use `shopping-cart-04`;
INSERT INTO product (name, price, description, url_image)
VALUES ('Product 1', 10.0, 'Description of Product 1', 'https://url/to/image1.jpg');

INSERT INTO product (name, price, description, url_image)
VALUES ('Product 2', 20.0, 'Description of Product 2', 'https://url/to/image2.jpg');
select * from product;
select * from cart_product;
select * from cart;
INSERT INTO cart (id)
VALUES(2);
INSERT INTO cart_product(quantity,cart_id, product_id)
VALUES(1, 1, 1);
INSERT INTO cart_product(quantity,cart_id, product_id)
VALUES(1, 2, 2);
select * from cart_product where cart_id = 1;