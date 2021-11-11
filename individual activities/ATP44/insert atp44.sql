begin transaction;
	
	insert into categoria(nome, descricao)  values ('eletrodomesticos', 'moveis');

	insert into produto(nome, descricao, preco, categoria_id)
	values('geladeira', 'frosfree', 2300, 7);

commit; 
end;