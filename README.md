# Exemplos de Padrões de Projeto em Java

[![Java](https://img.shields.io/badge/linguagem-Java-orange?logo=openjdk)](https://www.java.com/)
[![Status](https://img.shields.io/badge/status-em%20constru%C3%A7%C3%A3o-yellow)](#)
[![Curso na Udemy](https://img.shields.io/badge/curso-Udemy-a435f0?logo=udemy&logoColor=white)](https://www.udemy.com/course/padroes-de-projeto-em-java-na-pratica/)

Repositório de exemplos práticos de padrões de projeto implementados em Java, organizados para facilitar o estudo e a execução de cada caso.

> **Status:** projeto em construção. Novos exemplos e melhorias poderão ser adicionados ao longo do tempo.

## Sobre o projeto

Os exemplos deste repositório são baseados no curso **[Padrões de Projeto em Java na Prática](https://www.udemy.com/course/padroes-de-projeto-em-java-na-pratica/)**. O código demonstra aplicações dos padrões em cenários simples, com classes de exemplo e descrições junto às implementações.

## Exemplos disponíveis

| Categoria | Padrão | Package | Exemplos |
| --- | --- | --- | --- |
| Criacional | Builder | `builder` | - Construção clássica de refeições com builders e classe diretora (`classic`)<br/> - Construção com Builder genérico e fluent API (`fluent`)<br/> - Construção funcional com Builder interno e refeição imutável (`functional`) |
| Comportamental | Chain of Responsibility | `chain` | - Dispensador de cédulas (`billsDispenser`)<br/> - Fluxo de criação de usuário (`process`) |
| Comportamental | Command | `command` | - Comandos para controle de luzes com Alexa (`alexa`)<br/> - Execução e reversão de migrations (`migration`) |
| Comportamental | Iterator | `iterator` | - Listagem e sumarização de produtos de um carrinho (`cart`)<br/> - Busca de canais de televisão (`tvChannel`) |
| Comportamental | Strategy | `strategy` | - Operações matemáticas configuráveis (`calc`)<br/> - Gerador de pessoas com combinações de estratégias de alimentação, transporte e trabalho (`person`) |
| Estrutural | Facade | `facade` | - Central de atendimento com cliente isolado do domínio, dependendo apenas da fachada (`callCenter/isolated`)<br/> - Central de atendimento com cliente dependendo do domínio e da fachada (`callCenter/withDomain`) |

Cada exemplo inclui uma classe `Client` com método `main`, que pode ser executada para observar o padrão em funcionamento. As descrições estão nos arquivos `ExampleDescription.md` correspondentes.

## Estrutura

```text
creational-patterns/
└── src/main/java/br/com/examples/
    └── builder/
        ├── classic/
        ├── fluent/
        └── functional/

behavioral-patterns/
└── src/main/java/br/com/examples/
    ├── chain/
    │   ├── billsDispenser/
    │   └── process/
    ├── command/
    │   ├── alexa/
    │   └── migration/
    ├── iterator/
    │   ├── cart/
    │   └── tvChannel/
    └── strategy/
        ├── calc/
        └── person/

structural-patterns/
└── src/main/java/br/com/examples/
    └── facade/
        └── callCenter/
            ├── isolated/
            └── withDomain/
```

## Como executar

1. Instale um JDK compatível com o código do projeto.
2. Abra o repositório no IntelliJ IDEA. Os diretórios `creational-patterns/src/main/java`, `behavioral-patterns/src/main/java` e `structural-patterns/src/main/java` estão configurados como raízes de código-fonte.
3. Abra uma das classes `Client` abaixo e execute o método `main`.

Classes de entrada:

- `br.com.examples.builder.classic.Client`
- `br.com.examples.builder.fluent.Client`
- `br.com.examples.builder.functional.Client`
- `br.com.examples.chain.billsDispenser.Client`
- `br.com.examples.chain.process.Client`
- `br.com.examples.command.alexa.Client`
- `br.com.examples.command.migration.Client`
- `br.com.examples.iterator.cart.Client`
- `br.com.examples.iterator.tvChannel.Client`
- `br.com.examples.strategy.calc.Client`
- `br.com.examples.strategy.person.Client`
- `br.com.examples.facade.callCenter.isolated.Client`
- `br.com.examples.facade.callCenter.withDomain.Client`

No código Java, cada classe está organizada em um `package` correspondente ao exemplo, por exemplo: `package br.com.examples.strategy.calc;`.

O projeto não utiliza Maven ou Gradle; os exemplos usam as bibliotecas padrão do Java.
