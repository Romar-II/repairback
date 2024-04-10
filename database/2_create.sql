-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-04-09 08:47:08.26

-- tables
-- Table: brand
CREATE TABLE brand (
                       id serial  NOT NULL,
                       name varchar(255)  NOT NULL,
                       CONSTRAINT brand_pk PRIMARY KEY (id)
);

-- Table: car
CREATE TABLE car (
                     id serial  NOT NULL,
                     reg_number varchar(255)  NOT NULL,
                     user_id int  NOT NULL,
                     model_year_id int  NOT NULL,
                     CONSTRAINT car_pk PRIMARY KEY (id)
);

-- Table: category
CREATE TABLE category (
                          id serial  NOT NULL,
                          name varchar(255)  NOT NULL,
                          CONSTRAINT category_pk PRIMARY KEY (id)
);

-- Table: image
CREATE TABLE image (
                       id serial  NOT NULL,
                       product_id int  NOT NULL,
                       data bytea  NOT NULL,
                       CONSTRAINT image_pk PRIMARY KEY (id)
);

-- Table: model
CREATE TABLE model (
                       id serial  NOT NULL,
                       brand_id int  NOT NULL,
                       name varchar(255)  NOT NULL,
                       CONSTRAINT model_pk PRIMARY KEY (id)
);

-- Table: model_year
CREATE TABLE model_year (
                            id serial  NOT NULL,
                            model_id int  NOT NULL,
                            number int  NOT NULL,
                            repair_multiplier int  NOT NULL,
                            CONSTRAINT model_year_pk PRIMARY KEY (id)
);

-- Table: order
CREATE TABLE "order" (
                         id serial  NOT NULL,
                         user_id int  NOT NULL,
                         status char(1)  NOT NULL,
                         CONSTRAINT order_pk PRIMARY KEY (id)
);

-- Table: order_item
CREATE TABLE order_item (
                            id serial  NOT NULL,
                            order_id int  NOT NULL,
                            product_id int  NULL,
                            repair_item_id int  NULL,
                            CONSTRAINT order_item_pk PRIMARY KEY (id)
);

-- Table: product
CREATE TABLE product (
                         id serial  NOT NULL,
                         group_id int  NOT NULL,
                         name varchar(255)  NOT NULL,
                         description varchar(255)  NOT NULL,
                         status char(1)  NOT NULL,
                         CONSTRAINT product_pk PRIMARY KEY (id)
);

-- Table: repair_item
CREATE TABLE repair_item (
                             id serial  NOT NULL,
                             repair_sub_category_id int  NOT NULL,
                             name varchar(255)  NOT NULL,
                             price decimal(10,2)  NOT NULL,
                             CONSTRAINT repair_item_pk PRIMARY KEY (id)
);

-- Table: repair_main_category
CREATE TABLE repair_main_category (
                                      id serial  NOT NULL,
                                      name int  NOT NULL,
                                      CONSTRAINT repair_main_category_pk PRIMARY KEY (id)
);

-- Table: repair_sub_category
CREATE TABLE repair_sub_category (
                                     id serial  NOT NULL,
                                     repair_main_category_id int  NOT NULL,
                                     name varchar(255)  NOT NULL,
                                     CONSTRAINT repair_sub_category_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
                      id serial  NOT NULL,
                      name varchar(255)  NOT NULL,
                      CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        role_Id int  NOT NULL,
                        username varchar(255)  NOT NULL,
                        password varchar(255)  NOT NULL,
                        status char(1)  NOT NULL,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: User_Role (table: user)
ALTER TABLE "user" ADD CONSTRAINT User_Role
    FOREIGN KEY (role_Id)
        REFERENCES role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: car_model_year (table: car)
ALTER TABLE car ADD CONSTRAINT car_model_year
    FOREIGN KEY (model_year_id)
        REFERENCES model_year (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: car_user (table: car)
ALTER TABLE car ADD CONSTRAINT car_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: image_product (table: image)
ALTER TABLE image ADD CONSTRAINT image_product
    FOREIGN KEY (product_id)
        REFERENCES product (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: model_brand (table: model)
ALTER TABLE model ADD CONSTRAINT model_brand
    FOREIGN KEY (brand_id)
        REFERENCES brand (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_item_repair_item (table: order_item)
ALTER TABLE order_item ADD CONSTRAINT order_item_repair_item
    FOREIGN KEY (repair_item_id)
        REFERENCES repair_item (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_product_order (table: order_item)
ALTER TABLE order_item ADD CONSTRAINT order_product_order
    FOREIGN KEY (order_id)
        REFERENCES "order" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_product_product (table: order_item)
ALTER TABLE order_item ADD CONSTRAINT order_product_product
    FOREIGN KEY (product_id)
        REFERENCES product (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_user (table: order)
ALTER TABLE "order" ADD CONSTRAINT order_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: product_group (table: product)
ALTER TABLE product ADD CONSTRAINT product_group
    FOREIGN KEY (group_id)
        REFERENCES category (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: repair_item_repair_sub_category (table: repair_item)
ALTER TABLE repair_item ADD CONSTRAINT repair_item_repair_sub_category
    FOREIGN KEY (repair_sub_category_id)
        REFERENCES repair_sub_category (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: repair_sub_category_repair_main_category (table: repair_sub_category)
ALTER TABLE repair_sub_category ADD CONSTRAINT repair_sub_category_repair_main_category
    FOREIGN KEY (repair_main_category_id)
        REFERENCES repair_main_category (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: year_model (table: model_year)
ALTER TABLE model_year ADD CONSTRAINT year_model
    FOREIGN KEY (model_id)
        REFERENCES model (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

