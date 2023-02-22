#language: pt
#enconding: UTF-8

@login
Funcionalidade: Login

Cenario: usuario invalido
Quando eu informar o usuario "Ad"
E informar a senha "asd"
E clicar no botao login 
Entao o sistema exibe a mensagem de usuario invalido

@loginSucesso
Cenario: Realizar login
Quando eu informar o usuario "standard_user"
E informar a senha "secret_sauce"
E clicar no botao login 
Entao o sistema exibe o usuario logado