--user types
INSERT INTO `retail`.`user_type` (`id`, `name`) VALUES ('1', 'USER');
INSERT INTO `retail`.`user_type` (`id`, `name`) VALUES ('2', 'EMPLOYEE');
INSERT INTO `retail`.`user_type` (`id`, `name`) VALUES ('3', 'CUSTOMER');
INSERT INTO `retail`.`user_type` (`id`, `name`) VALUES ('4', 'GROCERY');
INSERT INTO `retail`.`user_type` (`id`, `name`) VALUES ('5', 'AFFILATE');


--discounts
INSERT INTO `retail`.`discount` (`id`, `generic_discount`, `generic_discount_type`, `generic_discount_interval`, `bill_amount`, `bill_discount_type`, `bill_interval`,
 `custom_discount_type`, `custom_discount`, `custom_discount_interval`, `discount_calculator`, `applicable_user_type_id`) 
 VALUES ('1', '1', 'PERCENTAGE', '100', '5', 'PERCENTAGE', '100', 'PERCENTAGE', '0', '0', 'com.mobile.components.UserDiscountCalculator', '1');

INSERT INTO `retail`.`discount` (`id`, `generic_discount`, `generic_discount_type`, `generic_discount_interval`, `bill_amount`, `bill_discount_type`, `bill_interval`,
 `custom_discount_type`, `custom_discount`, `custom_discount_interval`, `discount_calculator`, `applicable_user_type_id`) 
 VALUES ('2', '1', 'PERCENTAGE', '100', '5', 'PERCENTAGE', '100', 'PERCENTAGE', '30', '0', 'com.mobile.components.CustomDiscountCalculator', '2');
 

INSERT INTO `retail`.`discount` (`id`, `generic_discount`, `generic_discount_type`, `generic_discount_interval`, `bill_amount`, `bill_discount_type`, `bill_interval`,
 `custom_discount_type`, `custom_discount`, `custom_discount_interval`, `discount_calculator`, `applicable_user_type_id`) 
 VALUES ('3', '1', 'PERCENTAGE', '100', '0', 'PERCENTAGE', '0', 'PERCENTAGE', '0', '0', 'com.mobile.components.NODiscountCalculator', '4');


INSERT INTO `retail`.`discount` (`id`, `generic_discount`, `generic_discount_type`, `generic_discount_interval`, `bill_amount`, `bill_discount_type`, `bill_interval`,
 `custom_discount_type`, `custom_discount`, `custom_discount_interval`, `discount_calculator`, `applicable_user_type_id`) 
 VALUES ('4', '1', 'PERCENTAGE', '100', '5', 'PERCENTAGE', '100', 'PERCENTAGE', '10', '0', 'com.mobile.components.CustomDiscountCalculator', '5');
 
 

--users
INSERT INTO `retail`.`user` (`id`, `city`, `country`, `join_date`, `name`, `zip_code`, `user_type_id`) 
VALUES ('1', 'Dubai', 'UAE', '2019-02-21 03:28:18.000000', 'john', '00200', '1');

INSERT INTO `retail`.`user` (`id`, `city`, `country`, `join_date`, `name`, `zip_code`, `user_type_id`) 
VALUES ('2', 'Dubai', 'UAE', '2019-02-21 03:28:18.000000', 'Mathew', '00200', '2');

INSERT INTO `retail`.`user` (`id`, `city`, `country`, `join_date`, `name`, `zip_code`, `user_type_id`) 
VALUES ('3', 'Dubai', 'UAE', '2019-02-21 03:28:18.000000', 'Mary', '00200', '4');

INSERT INTO `retail`.`user` (`id`, `city`, `country`, `join_date`, `name`, `zip_code`, `user_type_id`) 
VALUES ('4', 'Dubai', 'UAE', '2019-02-21 03:28:18.000000', 'Ali', '00200', '5');

INSERT INTO `retail`.`user` (`id`, `city`, `country`, `join_date`, `name`, `zip_code`, `user_type_id`) 
VALUES ('5', 'Dubai', 'UAE', '2019-04-21 03:28:18.000000', 'Adel', '00200', '1');

-- invoices
INSERT INTO `retail`.`invoice` (`id`, `items_count`, `bill_amount`, `bill_number`, `due_date`, `invoice_status`) 
VALUES ('1', '5', '1000', '1234', now(), 'NOT_PAID');

INSERT INTO `retail`.`invoice` (`id`, `items_count`, `bill_amount`, `bill_number`, `due_date`, `invoice_status`) 
VALUES ('2', '5', '500', '1235', now(), 'NOT_PAID');

INSERT INTO `retail`.`invoice` (`id`, `items_count`, `bill_amount`, `bill_number`, `due_date`, `invoice_status`) 
VALUES ('3', '5', '1000', '1236', now(), 'NOT_PAID');

INSERT INTO `retail`.`invoice` (`id`, `items_count`, `bill_amount`, `bill_number`, `due_date`, `invoice_status`) 
VALUES ('4', '5', '1000', '1237', now(), 'NOT_PAID');

INSERT INTO `retail`.`invoice` (`id`, `items_count`, `bill_amount`, `bill_number`, `due_date`, `invoice_status`) 
VALUES ('5', '5', '1000', '1238', now(), 'NOT_PAID');

INSERT INTO `retail`.`invoice` (`id`, `items_count`, `bill_amount`, `bill_number`, `due_date`, `invoice_status`) 
VALUES ('6', '5', '1000', '1239', now(), 'NOT_PAID');

--orders
INSERT INTO `retail`.`orders` (`id`, `order_number`, `invoice_id`, `user_id`) 
VALUES ('1', '1234', '1', '1');

INSERT INTO `retail`.`orders` (`id`, `order_number`, `invoice_id`, `user_id`) 
VALUES ('2', '1235', '2', '1');

INSERT INTO `retail`.`orders` (`id`, `order_number`, `invoice_id`, `user_id`) 
VALUES ('3', '1236', '3', '2');

INSERT INTO `retail`.`orders` (`id`, `order_number`, `invoice_id`, `user_id`) 
VALUES ('4', '1237', '4', '3');

INSERT INTO `retail`.`orders` (`id`, `order_number`, `invoice_id`, `user_id`) 
VALUES ('5', '1238', '5', '4');

INSERT INTO `retail`.`orders` (`id`, `order_number`, `invoice_id`, `user_id`) 
VALUES ('6', '1239', '6', '5');
