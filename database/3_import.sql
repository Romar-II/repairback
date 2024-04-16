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

INSERT INTO repair.category (id, name) VALUES (1, 'Mootor');
INSERT INTO repair.category (id, name) VALUES (2, 'Veermik');
INSERT INTO repair.category (id, name) VALUES (3, 'Elekter');
INSERT INTO repair.category (id, name) VALUES (4, 'Kere');
INSERT INTO repair.category (id, name) VALUES (5, 'Rattad');
INSERT INTO repair.category (id, name) VALUES (6, 'Klaasid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (1, 1, 'Õlid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (2, 1, 'Laagrid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (3, 1, 'Kilowatid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (4, 1, 'Detsibelid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (5, 2, 'Amordid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (6, 2, 'Vedrustus');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (7, 2, 'Laagrid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (8, 2, 'Raam');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (9, 3, 'Tuled');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (10, 3, 'Andurid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (11, 3, 'Süütesüsteem');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (12, 4, 'Uksed');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (13, 4, 'Katus');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (14, 4, 'Pagasnik');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (15, 4, 'Kapott');
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
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (43, 9, 'Vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (44, 20, 'Vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (45, 21, 'Vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (46, 13, 'Augu parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (47, 13, 'Rehvi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (48, 13, 'Rehvi rõhu kontroll ja täitmine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (49, 10, 'Augu parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (50, 10, 'Rehvi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (51, 10, 'Rehvi rõhu kontroll ja täitmine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (52, 11, 'Augu parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (53, 11, 'Rehvi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (54, 11, 'Rehvi rõhu kontroll ja täitmine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (55, 12, 'Augu parandus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (56, 12, 'Rehvi vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (57, 12, 'Rehvi rõhu kontroll ja täitmine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (58, 8, 'Pirni vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (59, 8, 'Tulede kontroll ja reguleerimine', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (60, 19, 'Aku vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (61, 19, 'Kas täkku saab?', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (62, 7, 'Ülevaatus/kontroll', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (63, 7, 'Vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (64, 7, 'Sport tuning', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (65, 17, 'Ülevaatus/kontroll', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (66, 17, 'Vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (67, 17, 'Sport tuning', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (68, 18, 'Vahetus', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (69, 18, 'Remont', 0.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (70, 18, 'Puhastus', 0.00);

INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (1, 1, 1995, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (2, 1, 1996, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (3, 1, 1997, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (4, 1, 1998, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (5, 2, 2000, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (6, 2, 2001, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (7, 2, 2002, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (8, 2, 2003, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (9, 3, 2002, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (10, 3, 2003, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (11, 3, 2004, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (12, 3, 2005, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (13, 4, 2006, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (14, 4, 2007, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (15, 4, 2008, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (16, 4, 2009, 2);








