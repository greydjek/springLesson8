create table authorities  (id bigserial, authority varchar(256) not null,  primary key(id) );

insert into authorities (authority)
values
('REED'),
('DELETE'),
('WRITE');

--insert into roles_authorities (authorities_id, roles_id)
--values
--  (1,1),
--  (2,2),
--  (2,3);
