## Exemplo 2: Implementação do padrão Builder utilizando Builder genérico e fluent API - sistema de pedidos de refeições

### Descrição:
- Este exemplo é uma variação do exemplo 1, onde:
  - Ao invés de termos uma classe Builder para cada tipo de refeição, temos uma classe Builder genérica, que permite a
criação de uma ampla variedade de refeições, pois seus métodos de construção recebem parâmetros que definem os itens da 
refeição.
  - Os métodos da classe Builder retornam a própria instância do Builder, permitindo o encadeamento de chamadas (fluent 
API), tornando a construção da refeição mais legível e intuitiva.
  - Não há classe diretora, a própria classe cliente é responsável por chamar os métodos do Builder na ordem desejada.
  - A classe de domínio possui construtor com argumentos, que será usado pelo Builder para construir o objeto.
  - A classe Builder vai armazenando dentro de seus atributos os valores passados como parâmetros, e ao final, o 
método `thatsAll()` (poderia ser qualquer outro nome) cria a instância da classe de domínio com os valores armazenados.
  - Esta abordagem é uma das mais usadas na prática, por ser mais simples e flexível, além de melhorar a legibilidade do
código, principalmente quando há muitos parâmetros opcionais.

### Classes envolvidas:
- `FastFoodMealBuilder`: Builder genérico, cujos métodos de construção recebem parâmetros que definem os itens da 
refeição e retornam a própria instância do Builder.
- `FastFoodMeal`: Classe que representa a refeição final.
- `Client`: Classe cliente que cria diferentes tipos de refeições, chamando os métodos do Builder na ordem desejada e 
passando os parâmetros apropriados.