INSERT INTO repair.brand (id, name) VALUES (1, 'Audi');
INSERT INTO repair.brand (id, name) VALUES (2, 'BMW');
INSERT INTO repair.brand (id, name) VALUES (3, 'Mercedes-Benz');
INSERT INTO repair.brand (id, name) VALUES (4, 'Volkswagen');
INSERT INTO repair.brand (id, name) VALUES (5, 'Volvo');
INSERT INTO repair.brand (id, name) VALUES (6, 'Kondimootor');

INSERT INTO repair.model (id, brand_id, name) VALUES (1, 1, 'A5');
INSERT INTO repair.model (id, brand_id, name) VALUES (2, 1, 'A6');
INSERT INTO repair.model (id, brand_id, name) VALUES (3, 2, 'M4');
INSERT INTO repair.model (id, brand_id, name) VALUES (4, 2, 'M5');


INSERT INTO repair.repair_main_category (id, name) VALUES (1, 'Mootor');
INSERT INTO repair.repair_main_category (id, name) VALUES (2, 'Veermik');
INSERT INTO repair.repair_main_category (id, name) VALUES (3, 'Elekter');
INSERT INTO repair.repair_main_category (id, name) VALUES (4, 'Kere');
INSERT INTO repair.repair_main_category (id, name) VALUES (5, 'Rehvid');
INSERT INTO repair.repair_main_category (id, name) VALUES (6, 'Klaasid');

INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (1, 6, 'Esiklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (2, 6, 'Tagaklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (3, 6, 'Küljeklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (4, 6, 'Siseklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (5, 6, 'Katuseklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (6, 1, 'Põrr-võrr');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (7, 2, 'Sillad');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (8, 3, 'Tuled');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (9, 4, 'Värvitööd');

INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (1, 1, 'Täkke parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (2, 1, 'Klaasi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (3, 1, 'Toneerimine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (4, 2, 'Täkke parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (5, 2, 'Klaasi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (6, 2, 'Toneerimine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (7, 3, 'Täkke parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (8, 3, 'Klaasi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (9, 3, 'Toneerimine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (10, 4, 'Täkke parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (11, 4, 'Klaasi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (12, 4, 'Toneerimine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (13, 5, 'Täkke parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (14, 5, 'Klaasi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (15, 5, 'Toneerimine', 0.00);
