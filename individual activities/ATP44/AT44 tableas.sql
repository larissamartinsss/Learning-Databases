begin transaction;

create table carro(
id int primary key generated always as identity 
,modelo varchar(25) not null
,marca varchar(25) not null
);

insert into carro(modelo, marca) values ('fiat mobi','fiat');
insert into carro(modelo, marca) values ('civic','honda');

commit;
end;

begin transaction;

create table pais(
		id int primary key generated always as identity
		,nome varchar(50) not null
		,sigla varchar(50) not null
	);

	create table estado(
		id int primary key generated always as identity
		,nome varchar(50) not null
		,sigla varchar(50) not null
		,pais_id int not null
		,constraint fk_pais foreign key(pais_id) references pais(id)
	);

	create table cidade(
		id int primary key generated always as identity
		,nome varchar(50) not null
		,estado_id int not null
		,constraint fk_estado foreign key(estado_id) references estado(id)
	);

	insert into pais(nome, sigla) values('Brasil', 'BR');
	insert into estado(nome, sigla, pais_id) values('Amazonas', 'AM', 1);
	insert into cidade(nome, estado_id) values('Presidente Figueiredo', 1);
	
commit;
end;
