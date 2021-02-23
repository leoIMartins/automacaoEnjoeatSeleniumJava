$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("restaurantes/informacoes-adicionais.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Informacoes Adicionais",
  "description": "  Para que eu possa ver as informacoes adicionais\r\n  Sendo um usuario que escolheu um restaurante\r\n  Posso ver a categoria, descricao detalhada e horarios de funcionamento",
  "id": "informacoes-adicionais",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Detalhes do restaurante",
  "description": "",
  "id": "informacoes-adicionais;detalhes-do-restaurante",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@infos"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que acesso a lista de restaurantes",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu escolho o restaurante \"Burger House\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "eu vejo as seguintes informacoes adicionais:",
  "rows": [
    {
      "cells": [
        "categoria",
        "Hamburgers"
      ],
      "line": 14
    },
    {
      "cells": [
        "descrição",
        "40 anos se especializando em trash food."
      ],
      "line": 15
    },
    {
      "cells": [
        "horários",
        "Funciona todos os dias, de 10h às 22h"
      ],
      "line": 16
    }
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CardapioSteps.que_acesso_a_lista_de_restaurantes()"
});
formatter.result({
  "duration": 6363253200,
  "status": "passed"
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
  "duration": 80539400,
  "status": "passed"
});
formatter.match({
  "location": "CardapioSteps.eu_vejo_as_seguintes_informacoes_adicionais(DataTable)"
});
