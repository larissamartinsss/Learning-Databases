begin transaction; 

	insert into pais(nome, sigla) values('Brasil', 'BR');

	insert into estado(nome, sigla, pais_id) values('Amazonas', 'AM', 1);
	insert into estado(nome, sigla, pais_id) values('Ceará', 'CE', 2);
	insert into estado(nome, sigla, pais_id) values('Acre', 'AC', 3);

	insert into cidade(nome, estado_id) values('Parintins', 1);
	insert into cidade(nome, estado_id) values('Cariri', 2);
	insert into cidade(nome, estado_id) values('Rio branco', 3);
	insert into cidade(nome, estado_id) values('Manaus', 1);
	insert into cidade(nome, estado_id) values('Fortaleza', 2);
	insert into cidade(nome, estado_id) values('Maúes', 1);
	
commit;
end;


select 
	c.id as "ProdId"
	,c.nome
	,e.id as "EstadoId"
	,e.nome
	,e.sigla
	,p.id as "PaisId"
	,p.nome 
	,p.sigla
from cidade as c
join estado as e on c.estado_id = e.id
join pais as p on e.pais_id = p.id