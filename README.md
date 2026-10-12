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
| Comportamental | Chain of Responsibility | `chain` | - Dispensador de cédulas (`billsDispenser`)<br/> - Fluxo de criação de usuário (`process`) |
| Comportamental | Iterator | `iterator` | - Listagem e sumarização de produtos de um carrinho (`cart`)<br/> - Busca de canais de televisão (`tvChannel`) |

Cada exemplo inclui uma classe `Client` com método `main`, que pode ser executada para observar o padrão em funcionamento. As descrições estão nos arquivos `ExampleDescription.md` correspondentes.

## Estrutura

```text
behavioral-patterns/
└── src/main/java/br/com/examples/
    ├── chain/
    │   ├── billsDispenser/
    │   └── process/
    └── iterator/
        ├── cart/
        └── tvChannel/
```

## Como executar

1. Instale um JDK compatível com o código do projeto.
2. Abra o repositório no IntelliJ IDEA. O diretório `behavioral-patterns/src/main/java` está configurado como raiz de código-fonte.
3. Abra uma das classes `Client` dos exemplos e execute o método `main`.

Classes de entrada:

- `br.com.examples.chain.billsDispenser.Client`
- `br.com.examples.chain.process.Client`
- `br.com.examples.iterator.cart.Client`
- `br.com.examples.iterator.tvChannel.Client`

O projeto não utiliza Maven ou Gradle; os exemplos usam as bibliotecas padrão do Java.
