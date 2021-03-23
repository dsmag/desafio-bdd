# language: pt
Funcionalidade: Desafio de entrar no site e fazer duas buscas

Cenário: Entrar no site do tornese um programador e buscar pelo conteúdo tdd
  Quando eu acesso o site torne se um programador
  E digito no campo de busca a palavra "tdd"
  E clico no botao buscar
  Entao devo ver o resultado na busca "tdd"

  Cenário: Entrar no site do tornese um programador e buscar pelo conteúdo bdd
	  Quando eu acesso o site torne se um programador
	  E digito no campo de busca a palavra "bdd"
	  E clico no botao buscar
	  Entao devo ver o resultado na busca "bdd"