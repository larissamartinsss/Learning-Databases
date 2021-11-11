

create table produto(
id int primary key generated always as identity 
,nome varchar(25) not null
,descricao varchar(150) not null
,preco real not null
,codigo int not null
);

create table categoria(
id int primary key generated always as identity 
,nome varchar(25) not null
,descricao varchar(150) null
);

create table carro(
id int primary key generated always as identity 
,modelo varchar(30) not null
,marca varchar(25) not null
);
