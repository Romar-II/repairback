INSERT INTO repair.brand (id, name) VALUES (default, 'Audi');
INSERT INTO repair.brand (id, name) VALUES (default, 'BMW');
INSERT INTO repair.brand (id, name) VALUES (default, 'Mercedes-Benz');
INSERT INTO repair.brand (id, name) VALUES (default, 'Volkswagen');
INSERT INTO repair.brand (id, name) VALUES (default, 'Volvo');
INSERT INTO repair.brand (id, name) VALUES (default, 'Kondimootor');

INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'A5');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'A6');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 2, 'M4');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 2, 'M5');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'A4');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'S4');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'S5');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'A8');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 2, 'i8');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'A7');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 1, 'S7');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 3, 'A140');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 3, 'B200');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 3, 'C350');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 3, 'S500');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 5, 'S70');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 5, 'S80');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 5, 'S90');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 5, 'XC60');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 5, 'XC70');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 5, 'XC90');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 4, 'Arteon');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 4, 'Golf');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 4, 'Passat');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 4, 'Beetle');
INSERT INTO repair.model (id, brand_id, name) VALUES (default, 4, 'Touareg');



INSERT INTO repair.repair_main_category (id, name) VALUES (default, 'Mootor');
INSERT INTO repair.repair_main_category (id, name) VALUES (default, 'Veermik');
INSERT INTO repair.repair_main_category (id, name) VALUES (default, 'Elekter');
INSERT INTO repair.repair_main_category (id, name) VALUES (default, 'Kere');
INSERT INTO repair.repair_main_category (id, name) VALUES (default, 'Rehvid');
INSERT INTO repair.repair_main_category (id, name) VALUES (default, 'Klaasid');

INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 6, 'Esiklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 6, 'Tagaklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 6, 'Küljeklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 6, 'Siseklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 6, 'Katuseklaas');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 1, 'Põrr-võrr');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 2, 'Sillad');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 3, 'Tuled');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 4, 'Uksed');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 5, '1 rehv');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 5, '2 rehvi');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 5, '3 rehvi');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 5, 'Kõik rehvid');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 1, 'Drr-Dõr-Dõr-Buh');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 1, 'Tuk-Tuk-Tik-Tak');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 1, 'Vedelikud');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 2, 'Vedrustus');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 2, 'Veljed');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 3, 'Aku');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 4, 'Kapott');
INSERT INTO repair.repair_sub_category (id, repair_main_category_id, name) VALUES (default, 4, 'Pagasnik');


INSERT INTO repair.category (id, name) VALUES (default, 'Mootor');
INSERT INTO repair.category (id, name) VALUES (default, 'Veermik');
INSERT INTO repair.category (id, name) VALUES (default, 'Elekter');
INSERT INTO repair.category (id, name) VALUES (default, 'Kere');
INSERT INTO repair.category (id, name) VALUES (default, 'Rattad');
INSERT INTO repair.category (id, name) VALUES (default, 'Klaasid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 1, 'Õlid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 1, 'Laagrid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 1, 'Kilowatid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 1, 'Detsibelid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 2, 'Amordid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 2, 'Vedrustus');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 2, 'Laagrid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 2, 'Raam');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 3, 'Tuled');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 3, 'Andurid');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 3, 'Süütesüsteem');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 4, 'Uksed');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 4, 'Katus');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 4, 'Pagasnik');
INSERT INTO repair.sub_category (id, category_id, name) VALUES (default, 4, 'Kapott');
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 19, 'Aku vahetus', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 11, 'Augu parandus', 10.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 12, 'Augu parandus', 15.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 10, 'Augu parandus', 5.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 13, 'Augu parandus', 20.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 14, 'Chip tuning', 500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 6, 'Chip tuning', 500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 15, 'Chip tuning', 500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 15, 'Diagnostika', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 14, 'Diagnostika', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 6, 'Diagnostika', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 15, 'Kapitaalremont', 2000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 6, 'Kapitaalremont', 2000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 14, 'Kapitaalremont', 2000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 19, 'Kas täkku saab?', 30.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 9, 'Kiletamine', 750.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 21, 'Kiletamine', 750.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 20, 'Kiletamine', 750.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 3, 'Klaasi vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 5, 'Klaasi vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 4, 'Klaasi vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 2, 'Klaasi vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 1, 'Klaasi vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 16, 'Klaasipesu vedeliku täitmine', 15.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 14, 'Mootori keti vahetus', 1500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 6, 'Mootori keti vahetus', 1500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 15, 'Mootori keti vahetus', 1500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 16, 'Õlivahetus', 150.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 8, 'Pirni vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 21, 'Plekitööd', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 20, 'Plekitööd', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 9, 'Plekitööd', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 18, 'Puhastus', 75.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 11, 'Rehvi rõhu kontroll ja täitmine', 25.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 12, 'Rehvi rõhu kontroll ja täitmine', 25.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 10, 'Rehvi rõhu kontroll ja täitmine', 25.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 13, 'Rehvi rõhu kontroll ja täitmine', 25.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 10, 'Rehvi vahetus', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 13, 'Rehvi vahetus', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 12, 'Rehvi vahetus', 150.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 11, 'Rehvi vahetus', 100.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 18, 'Remont', 400.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 7, 'Sport tuning', 2500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 17, 'Sport tuning', 3500.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 3, 'Täkke parandus', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 4, 'Täkke parandus', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 1, 'Täkke parandus', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 2, 'Täkke parandus', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 5, 'Täkke parandus', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 4, 'Toneerimine', 70.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 1, 'Toneerimine', 70.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 3, 'Toneerimine', 70.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 2, 'Toneerimine', 70.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 5, 'Toneerimine', 70.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 16, 'Tosooli täitmine', 25.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 8, 'Tulede kontroll ja reguleerimine', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 17, 'Ülevaatus/kontroll', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 7, 'Ülevaatus/kontroll', 50.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 14, 'Uus mootor', 3000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 15, 'Uus mootor', 3000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 6, 'Uus mootor', 3000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 9, 'Vahetus', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 18, 'Vahetus', 2000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 7, 'Vahetus', 1000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 17, 'Vahetus', 2000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 20, 'Vahetus', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 21, 'Vahetus', 200.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 21, 'Värvitööd', 1000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 9, 'Värvitööd', 1000.00);
INSERT INTO repair.repair_item (id, repair_sub_category_id, name, price) VALUES (default, 20, 'Värvitööd', 1000.00);


INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 1, 1, 'Mobil', 25.000, 'Parim õli, päriselt ka 5l', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 1, 1, 'Rapsiõli', 5.000, 'Tervislik ja looduslik, 2l', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 1, 2, 'Head laagrid', 500.000, 'Parimad laagrid SKF', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 1, 2, 'Hiina laagrid', 50.000, 'Laagrid SKF', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 1, 3, 'Kilowatte juurde', 100.000, 'Lisame Kw juurde', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 1, 3, 'Kilowatte vähemaks', 50.000, 'Võtame Kw vähemaks', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 5, 'Ilusad amordid', 500.000, 'Roosad', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 5, 'Tõhusad amordid', 500.000, 'Punased', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 5, 'Kõvad amordid', 1000.000, 'Mustad', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 6, 'Hea vedrustus', 20000.000, 'Kõik vedrud maailmas', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 7, 'Head laagrid', 75.000, 'Parimad laagrid SKF', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 7, 'Hiina laagrid', 35.000, 'Laagrid SKF', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 2, 8, 'Uus raam', 10000.000, 'Uus raam sinu autole', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 3, 9, 'Ilusad tuled', 10.000, 'Kõik kiidavad', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 3, 9, 'Koledad tuled', 5.000, 'Keegi ei kiida', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 3, 9, 'Säravad tuled', 100.000, 'väga nähtavad', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 3, 10, 'Parkimise andurid', 20.000, 'Parkimse abi', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 3, 10, 'Gaasi andurid', 40.000, 'Gaasi abi', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 3, 11, 'Süütesüsteem', 150.000, 'Auto käivitumiseks', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 4, 12, 'Uksed', 5000.000, 'Uues uksed', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 4, 13, 'Katus', 6000.000, 'Uus katus', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 4, 14, 'Pagasnik', 6000.000, 'Uus pagasnik', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 4, 15, 'Kapott', 1000.000, 'Uus kapott', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 5, null, 'Rehvid', 10.000, 'Uus rehv', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 5, null, 'Veljed', 20.000, 'Uus velg', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 6, null, 'Esiklaas', 500.000, 'Uus esiklaas', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 6, null, 'Tagaklaas', 500.000, 'Uus tagaklaas', 'A');
INSERT INTO repair.product (id, category_id, sub_category_id, name, price, description, status) VALUES (default, 6, null, 'Küljeklaas', 500.000, 'Uus küljeklaas', 'A');

INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 1, 1995, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 1, 1996, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 1, 1997, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 1, 1998, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 2, 2000, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 2, 2001, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 2, 2002, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 2, 2003, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 3, 2002, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 3, 2003, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 3, 2004, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 3, 2005, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 4, 2006, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 4, 2007, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 4, 2008, 2);
INSERT INTO repair.model_year (id, model_id, number, repair_multiplier) VALUES (default, 4, 2009, 2);

INSERT INTO repair.role (id, name) VALUES (default, 'Admin');
INSERT INTO repair.role (id, name) VALUES (default, 'Customer');

INSERT INTO repair."user" (id, role_id, username, password, status) VALUES (default, 1, 'Admin', 'Admin123', 'A');
INSERT INTO repair."user" (id, role_id, username, password, status) VALUES (default, 1, 'Alar', '123', 'A');
INSERT INTO repair."user" (id, role_id, username, password, status) VALUES (default, 1, 'Marek', '123', 'A');
INSERT INTO repair."user" (id, role_id, username, password, status) VALUES (default, 1, 'Stiven', '123', 'A');






