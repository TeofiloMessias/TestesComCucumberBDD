#language: pt
#Version: 1.0
#Author:Teofilo

Funcionalidade: Login

  Cenario: Fazer login com credenciais validas
    Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email | senha |
      |       | 			|
    Entao o usuario estara logado com sucesso