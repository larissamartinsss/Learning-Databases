alter table carro
add column ano int not null,
add column chassi varchar(25) not null;

alter table produto 
	add column categoria_id int not null,
	add constraint fk_categoria foreign key(categoria_id) references categoria(id)