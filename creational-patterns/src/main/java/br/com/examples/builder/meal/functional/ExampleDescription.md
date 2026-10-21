## Exemplo 3: Implementação do padrão Builder utilizando conceitos de programação funcional

### Descrição:
- Este exemplo é uma variação do exemplo 2, onde:
  - Ao invés de ter uma classe Builder separada, se utilizou uma classe Builder definida dentro da classe de domínio 
(Inner Class).
  - A classe de domínio é imutável, ou seja, não possui setters e seus atributos são final.
  - O cliente chama o Builder da classe de domínio diretamente.

### Classes envvolvidas:
- `FastFoodMeal`: Classe de domínio que representa uma refeição de fast food. Possui atributos finais e não possui 
setters, garantindo sua imutabilidade.
- `FastFoodMeal.Builder`: Classe interna (Inner Class) que implementa o padrão Builder. Os métodos retornam a própria 
instância do Builder, permitindo encadeamento de chamadas (fluent API).
- `Client`: Classe que demonstra como utilizar o Builder para criar instâncias de `FastFoodMeal`.