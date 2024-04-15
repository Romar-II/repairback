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
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (9, 4, 'Uksed');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (10, 5, '1 rehv');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (11, 5, '2 rehvi');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (12, 5, '3 rehvi');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (13, 5, 'Kõik rehvid');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (14, 1, 'Drr-Dõr-Dõr-Buh');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (15, 1, 'Tuk-Tuk-Tik-Tak');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (16, 1, 'Vedelikud');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (17, 2, 'Vedrustus');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (18, 2, 'Veljed');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (19, 3, 'Aku');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (20, 4, 'Kapott');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (21, 4, 'Pagasnik');







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
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (16, 16, 'Õlivahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (17, 16, 'Klaasipesu vedeliku täitmine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (18, 16, 'Tosooli täitmine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (19, 15, 'Diagnostika', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (20, 15, 'Kapitaalremont', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (21, 15, 'Mootori keti vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (22, 15, 'Uus mootor', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (23, 15, 'Chip tuning', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (24, 14, 'Diagnostika', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (25, 14, 'Kapitaalremont', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (26, 14, 'Mootori keti vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (27, 14, 'Uus mootor', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (28, 14, 'Chip tuning', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (29, 6, 'Diagnostika', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (30, 6, 'Kapitaalremont', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (31, 6, 'Mootori keti vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (32, 6, 'Uus mootor', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (33, 6, 'Chip tuning', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (34, 9, 'Värvitööd', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (35, 9, 'Plekitööd', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (36, 9, 'Kiletamine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (37, 20, 'Värvitööd', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (38, 20, 'Plekitööd', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (39, 20, 'Kiletamine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (40, 21, 'Värvitööd', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (41, 21, 'Plekitööd', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (42, 21, 'Kiletamine', 0.00);



