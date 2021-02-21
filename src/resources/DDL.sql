CREATE SCHEMA `retail` ;

    
    create table affilate (
       category varchar(255),
        id integer not null,
        primary key (id)
    ) engine=InnoDB
;
    
    create table customer (
       loyalty_points integer not null,
        id integer not null,
        primary key (id)
    ) engine=InnoDB
;
    
    create table discount (
       id integer not null,
        bill_amount double precision,
        bill_discount_type varchar(255),
        bill_interval integer,
        custom_discount_type varchar(255),
        custom_discount double precision,
        custom_discount_interval double precision,
        discount_calculator varchar(255),
        applicable_user_type_id integer,
        primary key (id)
    ) engine=InnoDB
;
    
    create table employee (
       birth_date datetime(6),
        nationality varchar(255),
        title varchar(255),
        id integer not null,
        store_id integer not null,
        primary key (id)
    ) engine=InnoDB
;
    
    create table grocery (
       branches_count integer,
        category varchar(255),
        id integer not null,
        primary key (id)
    ) engine=InnoDB
;
    
    create table hibernate_sequence (
       next_val bigint
    ) engine=InnoDB
;
    
    insert into hibernate_sequence values ( 1 )
;
    
    create table invoice (
       id integer not null,
        items_count integer,
        bill_amount decimal(19,2),
        bill_date tinyblob,
        bill_number varchar(255),
        due_date datetime(6),
        invoice_status varchar(255),
        paid_amount decimal(19,2),
        primary key (id)
    ) engine=InnoDB
;
    
    create table order_product (
       order_id integer not null,
        product_id integer not null
    ) engine=InnoDB
;
    
    create table orders (
       id integer not null,
        order_number varchar(255),
        invoice_id integer,
        user_id integer not null,
        primary key (id)
    ) engine=InnoDB
;
    
    create table product (
       id integer not null,
        name varchar(255),
        price decimal(19,2),
        serial_number varchar(255),
        primary key (id)
    ) engine=InnoDB
;
    
    create table store (
       id integer not null,
        address varchar(255),
        country varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB
;
    
    create table store_product (
       store_id integer not null,
        product_id integer not null
    ) engine=InnoDB
;
    
    create table user (
       id integer not null,
        city varchar(255),
        country varchar(255),
        join_date datetime(6),
        name varchar(255),
        zip_code varchar(255),
        user_type_id integer not null,
        primary key (id)
    ) engine=InnoDB
;
    
    create table user_type (
       id integer not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;
    
    create index IDX2mci768xj73obnehb9vmd0oys on invoice (bill_number);
    
    alter table invoice 
       drop index UK_2mci768xj73obnehb9vmd0oys
;
    
    alter table invoice 
       add constraint UK_2mci768xj73obnehb9vmd0oys unique (bill_number)
;
    
    alter table affilate 
       add constraint FK1l01kjxoyq8kio1bmc063qo52 
       foreign key (id) 
       references customer (id)
;
    
    alter table customer 
       add constraint FKg2o3t8h0g17smtr9jgypagdtv 
       foreign key (id) 
       references user (id)
;
    
    alter table discount 
       add constraint FK6kwo37um7p3k808c6eruwoqho 
       foreign key (applicable_user_type_id) 
       references user_type (id)
;
    
    alter table employee 
       add constraint FKeg6451w5jta9oobtdgfe5c3n5 
       foreign key (store_id) 
       references store (id)
;
    
    alter table employee 
       add constraint FKd8il4lxw1wi74qh8b7uoy6e0a 
       foreign key (id) 
       references user (id)
;
    
    alter table grocery 
       add constraint FKddxog0shhp606wku9h7o4jkrs 
       foreign key (id) 
       references customer (id)
;
    
    alter table order_product 
       add constraint FKhnfgqyjx3i80qoymrssls3kno 
       foreign key (product_id) 
       references product (id)
;
    
    alter table order_product 
       add constraint FKl5mnj9n0di7k1v90yxnthkc73 
       foreign key (order_id) 
       references orders (id)
;
    
    alter table orders 
       add constraint FKja77citbxeilgqchn5vvbi55j 
       foreign key (invoice_id) 
       references invoice (id)
;
    
    alter table orders 
       add constraint FKel9kyl84ego2otj2accfd8mr7 
       foreign key (user_id) 
       references user (id)
;
    
    alter table store_product 
       add constraint FKd91qk8cbmboomritdwn351tak 
       foreign key (product_id) 
       references product (id)
;
    
    alter table store_product 
       add constraint FKdncsr7lgl9pdsq71314etuwrp 
       foreign key (store_id) 
       references store (id)
;
    
    alter table user 
       add constraint FKlrk9xrdps0emd6d5rx5x3ib6h 
       foreign key (user_type_id) 
       references user_type (id)