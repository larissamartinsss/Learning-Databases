select * from categoria;

select * from produto;

select * from categoria where descricao != '';

select id, nome, preco from produto where nome like 'X%';

select p.id, p.nome, p.preco from produto as p join categoria as c on p.categoria_id = c.id where p.preco > 0;

select * from produto where categoria_id > 2;

select c.id, c.nome, c.descricao, p.nome from categoria as c join produto as p on c.id = p.categoria_id;