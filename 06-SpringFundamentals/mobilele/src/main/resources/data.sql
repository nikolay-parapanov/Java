-- --some test users
-- INSERT INTO users (id, email, first_name, last_name, image_url, is_active, password)
-- VALUES (1, 'lachezar.balev@gmail.com', 'Lucho', 'Balev', null, 1, '87bf038293f793bbf45b3942753dee25179b3b0e905a17c3776d0675746193792b5918b215047d2a');
--
--
-- INSERT INTO brands (id, name)
-- VALUES (1, 'Ford'),
--        (2, 'Toyota');

INSERT INTO models (id, name, category, start_year, end_year, brand_id, image_url)
VALUES (1, 'Fiesta', 'CAR', 1976, null, 1, 'https://en.wikipedia.org/wiki/Ford_Fiesta#/media/File:Ford_Fiesta_ST-Line_(VII,_Facelift)_%E2%80%93_f_30012023.jpg')
       (2, 'Escort', 'CAR', 1968, 2000, 1, 'https://en.wikipedia.org/wiki/Ford_Escort_%28North_America%29#/media/File:97-02_Ford_Escort_sedan.jpg')
       (3, 'Yaris', 'CAR', 1999, null, 2, 'https://bg.wikipedia.org/wiki/%D0%A2%D0%BE%D0%B9%D0%BE%D1%82%D0%B0_%D0%AF%D1%80%D0%B8%D1%81#/media/%D0%A4%D0%B0%D0%B9%D0%BB:2020_Toyota_Yaris_Design_HEV_CVT_1.5_Front.jpg')

