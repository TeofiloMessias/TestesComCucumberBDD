# language: pt

Funcionalidade: Alugar Filme
	Como um aluno
	Eu quero cadastrar alugéis de filmes
	Para controlar preços  e datas de entregas
	
Cenário: Deve alugar filem com sucesso!
	Dado um filme com estoque de 2 unidades
	E que o preço  de aluguel seja  R$ 3
	Quando alugar
	Então o preço do aluguel será R$ 3
	E a data da entrega  será no dia seguinte
	E o estoque  do filme será de 1 unidade