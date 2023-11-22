-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.data-initialization.using-basic-sql-scripts

-- user roles
INSERT INTO roles (id, name)
VALUES (1, 'ADMIN');
INSERT INTO roles (id, name)
VALUES (2, 'MODERATOR');
INSERT INTO roles (id, name)
VALUES (3, 'USER');

-- some test users
INSERT INTO users (id, age, full_name, level, password, username)
VALUES (1, 28, 'Admin Adminov', 'ADVANCED', '12345', 'admin');

INSERT INTO users (id, age, full_name, level, password, username)
VALUES (2, 29, 'Moderator Moderatorov', 'INTERMEDIATE', '12345',
        'moderator');

INSERT INTO users (id, age, full_name, level, password, username)
VALUES (3, 30, 'User Userov', 'BEGINNER', '12345', 'user');

INSERT INTO users (id, age, full_name, level, password, username)
VALUES (4, 33, 'Ivan Ivanov', 'BEGINNER', '12345', 'ivan');
-- user roles
-- admin
INSERT INTO users_roles (user_id, roles_id)
VALUES (1, 1);
INSERT INTO users_roles (user_id, roles_id)
VALUES (1, 2);
INSERT INTO users_roles (user_id, roles_id)
VALUES (1, 3);
-- moderator
INSERT INTO users_roles (user_id, roles_id)
VALUES (2, 2);
INSERT INTO users_roles (user_id, roles_id)
VALUES (2, 3);
-- user
INSERT INTO users_roles (user_id, roles_id)
VALUES (3, 3);
-- user 2
INSERT INTO users_roles (user_id, roles_id)
VALUES (4, 3);
INSERT INTO users_roles (user_id, roles_id)
VALUES (4, 2);
INSERT INTO users_roles (user_id, roles_id)
VALUES (4, 1);

-- categories
INSERT INTO categories (id, description, name)
VALUES ('1', 'Tracks for pedestrians.', 'PEDESTRIAN');
INSERT INTO categories (id, description, name)
VALUES ('2', 'Tracks for cars.', 'CAR');
INSERT INTO categories (id, description, name)
VALUES ('3', 'Tracks for motorcycles.', 'MOTORCYCLE');
INSERT INTO categories (id, description, name)
VALUES ('4', 'Tracks for bicycles.', 'BICYCLE');


-- routes
INSERT INTO routes ( name, description, level, video_url, author_id)
VALUES
    ('Kumata',
     'Test Description 1',
     'BEGINNER', '3nnuv-sPvrI', 1);


INSERT INTO routes ( name, description, level, video_url, author_id)
VALUES
    ('VeloErul',
     'Test Description 2',
     'INTERMEDIATE', 'mufc5ZrgrWo', 1);

INSERT INTO routes ( name, description, level, video_url, author_id)
VALUES
    ('Aleko - Cherni Vruh',
     'Test Description 3',
     'ADVANCED', 'HhKAjOb-Nj8', 1);

INSERT INTO routes ( name, description, level, video_url, author_id)
VALUES
    ('Etyra - Shipka',
     'Test Description 4',
     'BEGINNER', 'Macb-vrQzGs', 1);


INSERT INTO routes ( name, description, level, video_url, author_id)
VALUES
    ('Aladzha - Zlatni Pyasaci',
     'Test Description 5',
     'ADVANCED', 'iO7YD7V0hHk', 1);

INSERT INTO routes_categories VALUES (1,1);
INSERT INTO routes_categories VALUES (1,2);
INSERT INTO routes_categories VALUES (2,1);
INSERT INTO routes_categories VALUES (2,2);
INSERT INTO routes_categories VALUES (2,3);
INSERT INTO routes_categories VALUES (3,1);
INSERT INTO routes_categories VALUES (3,2);
INSERT INTO routes_categories VALUES (4,1);
INSERT INTO routes_categories VALUES (4,2);
INSERT INTO routes_categories VALUES (4,3);
INSERT INTO routes_categories VALUES (4,4);
--INSERT INTO routes_categories VALUES (5,1);
--INSERT INTO routes_categories VALUES (5,2);



INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Kumata', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630581072/d47iy8kxv6qni8euhojk.jpg', 1, 1);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Kumata', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630581072/d47iy8kxv6qni8euhojk.jpg', 1, 1);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Velo Erul', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630581418/tqhjrinmsb69ev7upg0q.jpg', 1, 2);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Velo Erul 2', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630582448/oowojgn4lagybkvv20jb.jpg', 1, 2);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Aleko', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630582596/tclvroyrkcfbz98yklmc.jpg', 1, 3);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Aleko 2', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630582767/ukdmkxyvlnani3hzaafi.jpg', 1, 3);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Shipka', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630583376/en6lxhaddbvhf1ksybbu.jpg', 1, 4);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Shipka 2', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630583467/koncyanx4gqwzt9vxgx4.jpg', 1, 4);


 INSERT INTO pictures(title, url, author_id, route_id)
 VALUES ('Aladja Manastir', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630583842/qabnwpgq3pp1cui19nn5.jpg', 1, 5);

INSERT INTO pictures(title, url, author_id, route_id)
VALUES ('Aladja Manastir 2', 'http://res.cloudinary.com/ch-cloud/image/upload/v1630584095/aznlgfzoxpuvl5belukb.jpg', 1, 5);