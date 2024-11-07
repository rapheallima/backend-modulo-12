# Módulo 12: Projeto de Manipulação de Nomes e Gêneros

Este projeto em Java é uma aplicação simples que recebe uma lista de nomes e gêneros, os organiza, e os separa em listas baseadas no gênero. O exercício foi dividido em duas partes principais:

## Funcionalidades:

1. **Entrada de Nomes:**
   - O usuário é solicitado a inserir uma lista de nomes separados por vírgulas (exemplo: `Raphael, Barbara, Julia, Roberto, Ana, Yasmim`).
   - A aplicação remove espaços extras e ordena os nomes em ordem alfabética.
   - asdasd

2. **Entrada de Gêneros:**
   - Em seguida, o usuário deve inserir os nomes e seus respectivos gêneros no formato `nome-gênero`, onde o gênero pode ser `masculino` ou `feminino` (exemplo: `Raphael-masculino, Julia-feminino`).
   - A aplicação divide os nomes e gêneros, atribuindo-os a listas separadas de acordo com o gênero especificado.

## Como Funciona:

- O programa usa o método `split(",")` para separar a entrada de nomes em um array de strings.
- A lista de nomes é limpa de espaços extras com o método `trim()` e ordenada usando `Collections.sort()`.
- Para os gêneros, o programa divide a string `nome-gênero` utilizando o método `split("-")` e verifica se o gênero informado é válido (`masculino` ou `feminino`).
- Os nomes são então armazenados nas listas correspondentes, que são exibidas ao final.
