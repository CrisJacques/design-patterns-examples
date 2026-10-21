### Descrição:
- Este exemplo trata de uma simulação de um sistema de pedidos de refeições, utilizando o padrão de projeto Builder. 
O objetivo é demonstrar como construir objetos complexos (neste caso, uma refeição) passo a passo, permitindo a criação 
de diferentes variações de refeições sem a necessidade de criar múltiplos construtores.
- Neste caso, está sendo feita uma implementação mais clássica do padrão Builder, contendo a classe diretora, que é 
responsável por chamar os métodos dos builders em uma dada ordem.
- Como todos os Builders herdam de uma mesma classe abstrata, a classe diretora é compatível com qualquer Builder.

### Classes envolvidas:
- `FastFoodMealBuilder`: Classe abstrata que define os métodos para construir as partes de uma refeição (por exemplo, 
prato principal, acompanhamento, bebida).
- `FatMealBuilder`, `JustFriesBuilder`, `Menu1Builder`, `Menu2Builder`: Classes concretas que implementam diferentes
variações de refeições.
- `MealDirector`: Classe diretora que define a ordem de construção da refeição, chamando os métodos do Builder.
- `FastFoodMeal`: Classe que representa a refeição final, contendo os itens construídos pelo Builder.
- `Client`: Classe cliente que utiliza a classe diretora para construir diferentes tipos de refeições, escolhendo o 
Builder apropriado.