--SQL - Linguagem comum para todos os bancos de dados *apesar de haver algumas particularidades
-- DDL - Data defition Language
-- Create, Alter, Drop 
-- varchar - "String" not null - Obrigatorio preencher
-- Tabela - Defini��o/Estrutura onde os dados ser�o armazenados
-- Tabela � formada por linhas e colunas. 

create table PESSOAS(
	nome varchar(25) not null
	,sobrenome varchar(25) not null 
	,idade int null
);

create table livros(
	titulo varchar(25) not null
	,autor varchar(25) not null 
	,ano_pub int null		
);






