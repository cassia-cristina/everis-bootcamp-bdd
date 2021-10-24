#language: pt
#encoding: utf-8

Funcionalidade: Realizar Compra no E-commerce
  Como um comprador
  Quero ver a lista de produtos disponiveis
  Para que eu possa escolher qual devo comprar

  Cenario: Adicionar produto ao carrinho
    Dado que um usuario acessa o site "http://automationpractice.com"
    E pesquisa pelo produto "Blouse"
    Quando adiciona o produto "Blouse" ao carrinho
    Entao o produto "Blouse" deve estar presente no carrinho

  Cenario: Aumentar a quantidade de produto em detalhes do produto
    Dado que um usuario acessa o site "http://automationpractice.com"
    E pesquisa pelo produto "Dress"
    E acessa o produto "Printed Chiffon Dress"
    E aumenta a quantidade
    Quando adiciona o produto "Printed Chiffon Dress" ao carrinho
    Então o produto "Printed Chiffon Dress" deve possuir a quantidade 2