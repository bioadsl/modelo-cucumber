#language: pt
#enconding: UTF-8

@manterCadastro
Funcionalidade: Login

@editarUsuario
Cenario: editar Usuario
Quando acionar a aba Admin
E clicar no usuario "Antonio"
E acionar o botao EditSalvar
E informar no campo username "Marcelo"
E acionar o botao EditSalvar
Entao o sistema cadastra o usuario "Marcelo"
