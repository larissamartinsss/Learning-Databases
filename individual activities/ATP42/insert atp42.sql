select * from produto;
select * from categoria;

insert into categoria(nome) values ('smartphones');
insert into categoria(nome) values ('TVs');
insert into categoria(nome) values ('consoles');

insert into produto(nome, descricao, preco, categoria_id) values ('Iphone SE', '64GB 4,7', 2.500, 1);
insert into produto(nome, descricao, preco, categoria_id) values ('XIOMI', '128GB, 5,7', 1.500, 2);
insert into produto(nome, descricao, preco, categoria_id) values ('TV', 'SMARTV 4K LG, 50', 2.700, 3);
insert into produto(nome, descricao, preco, categoria_id) values ('TV', 'SMARTV 4K SONY, 40', 2.100, 4);
insert into produto(nome, descricao, preco, categoria_id) values ('PS5', 'ULTIMATE', 2.100, 5);
insert into produto(nome, descricao, preco, categoria_id) values ('XBOX ONE', '2TB, GOLD PASS', 1.900, 6);


update produto set descricao = 'iphone SE 2020 128GB' where id = 1;
update produto set descricao = 'TV FULL 4K 50ich' where id = 3;

delete from produto where id = 2;
delete from produto where id = 3;
delete from categoria where id = 6;

update produto set categoria_id = 1 where id = 3;

update produto set preco = preco-1 where preco > 1;
