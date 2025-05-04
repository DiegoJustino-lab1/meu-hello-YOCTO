# meu-hello

> Um exemplo simples de aplicação "Hello World" para Yocto, demonstrando como criar uma receita BitBake mínima.

## Visão Geral
Este projeto apresenta um aplicativo em C que imprime "Olá, Yocto!" no console.
Ele serve como ponto de partida para entender o fluxo de criação de receitas no Yocto Project.

## Estrutura do Projeto



# meu-hello

> Um exemplo simples de aplicação "Hello World" para Yocto, demonstrando como criar uma receita BitBake mínima.

## Visão Geral
Este projeto apresenta um aplicativo em C que imprime "Olá, Yocto!" no console.
Ele serve como ponto de partida para entender o fluxo de criação de receitas no Yocto Project.

## Estrutura do Projeto

meu-hello/
├── hello.c            # Código-fonte em C imprimindo a mensagem.
└── recipes-examples/
└── meu-hello/
└── meu-hello.bb  # Receita BitBake para compilar e instalar.

Como Compilar

Copie a pasta meu-hello/ para dentro do layer: meta-seu-layer/recipes-examples/meu-hello/.

Ajuste o MD5 em LIC_FILES_CHKSUM.

No ambiente Yocto, execute:

bitbake meu-hello