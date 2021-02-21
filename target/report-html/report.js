$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cardapio/cardapio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cardápio",
  "description": "  Para que eu possa decidir o que pretendo comer\r\n  Sendo um usuário que escolheu um restaurante\r\n  Posso acessar o cardápio",
  "id": "cardápio",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 8,
  "name": "Restaurantes",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 9,
  "name": "que acesso a lista de restaurantes",
  "keyword": "Dado "
});
formatter.match({
  "location": "CardapioSteps.que_acesso_a_lista_de_restaurantes()"
});
formatter.result({
  "duration": 7954316700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Produto disponível",
  "description": "",
  "id": "cardápio;produto-disponível",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 11,
      "name": "@cardapio"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "eu escolho o restaurante \"Burger House\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "vejo os seguintes itens disponíveis no cardápio:",
  "rows": [
    {
      "cells": [
        "produto",
        "descricao",
        "preco"
      ],
      "line": 16
    },
    {
      "cells": [
        "Classic Burger",
        "O clássico. Não tem como errar.",
        "R$ 18,50"
      ],
      "line": 17
    },
    {
      "cells": [
        "Batatas Fritas",
        "Batatas fritas crocantes",
        "R$ 5,50"
      ],
      "line": 18
    },
    {
      "cells": [
        "Refrigerante",
        "O refri mais gelado da cidade",
        "R$ 4,50"
      ],
      "line": 19
    }
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Burger House",
      "offset": 26
    }
  ],
  "location": "CardapioSteps.eu_escolho_o_restaurante(String)"
});
formatter.result({
  "duration": 109948400,
  "status": "passed"
});
formatter.match({
  "location": "CardapioSteps.vejo_os_seguintes_itens_disponíveis_no_cardápio(DataTable)"
});
formatter.result({
  "duration": 94166188200,
  "status": "passed"
});
});