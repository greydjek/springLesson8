create table users(
    id bigserial,
    username varchar(50) not null unique,
    password varchar(200) not null,
    email varchar(50) unique,
    primary key (id)
);
    create table roles(
        id serial,
        name varchar(50) not null,
        primary key (id)
);
    CREATE TABLE users_roles(
        user_id bigint not null,
        role_id int not null,
        primary key (user_id, role_id),
        foreign key (user_id) references users (id),
        foreign key (role_id) references roles (id)
);
insert into users (username, password, email)
values ('user', '$2a$12$3XddHbYv9ooewq754E.Pgemwi1TWHVR3sCFOoIC8xjxmQUvciSZyq', 'user@mail.ru'),
 ('admin', '$2a$12$3XddHbYv9ooewq754E.Pgemwi1TWHVR3sCFOoIC8xjxmQUvciSZyq', 'admin@mail.ru');

insert into roles (name)
values('ROLE_USER'),('ROLE_ADMIN'),('ROLE_SISADMIN'), ('REED'), ('DELETE');

insert into users_roles(user_id, role_id)
values  (1,1),(1,3),(1,4),
        (2,2),(2,4),(2,5);