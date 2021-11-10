-- DTL = Data Transaction Language
-- Savepoint e rollback

begin transaction;
create table categoria(
id int primary key generated always as identity
, nome varchar(50) not null
, descricao varchar(150) not null
);

savepoint create_category.

create table pessoa(
id int primary key generated always as identity
, nome varchar(50) not null
, sobrenome varchar(150) not null

);
rollback to create_category;

commit; 
end;





