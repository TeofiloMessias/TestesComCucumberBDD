#language: pt
@funcionais
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Contexto: Deve inserir uma conta com sucesso
Dado que o usuario esteja na pagina de login
Quando o usuario preecher as credencias de acesso
      | email | senha |
      |       | 			|
Entao o usuario estara logado com sucesso
Quando seleciono Contas
E seleciono Adicionar

Esquema do Cenário: Deve validar regras cadastro contas
    Quando informo a conta "<conta>"
    E seleciono Salvar
    Então recebo amensagem "<mensagem>"

Exemplos:
    | conta 							| mensagem 													|
    | Conta de Teste      | Conta adicionada com sucesso 			|
    | 							      | Informe o nome da conta						|
    | Conta mesmo nome    | Já existe uma conta com esse nome!|
