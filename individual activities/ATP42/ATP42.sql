-- ATP42 - DML

create table produto(
id int generated always as identity 
,nome varchar(25) not null
,descricao varchar(80) not null
,preco real not null
,codigo int not null
);

create table categoria(
id int generated always as identity 
,nome varchar(25) not null
,descricao varchar(80) null
);

create table carro(
id int generated always as identity 
,modelo varchar(25) not null
,marca varchar(25) not null
);
