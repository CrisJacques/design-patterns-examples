## Exemplo: Implementação do padrão Decorator - Coffee Shop

### Descrição:
- Este exemplo trata de uma simulação de um Coffee Shop, onde são preparadas várias combinações de bebidas: café puro,
café com leite, café duplo, chá puro, chá com leite duplo, etc.
- Aqui foi usado o padrão Decorator para evitar a criação de uma infinidade de subclasses para contemplar todas 
as combinações possíveis de bebidas. Ou seja, estamos trocando herança por composição.
- O Decorator basicamente é uma classe que implementa a mesma interface da classe alvo, mas que realiza ações antes e/ou 
depois de repassar a chamada para a classe alvo. Dessa forma, ela estende a funcionalidade da classe alvo. O Decorator é
como um casaco: adiciona uma proteção ao frio, mas você existe sem o casaco e pode tirá-lo quando quiser.
- Por exemplo, ao invés de criar uma subclasse `ExpressoWithMilk`, criamos o Decorator `Milk` e passamos um objeto 
`Expresso` no seu construtor para que ele adicione o leite ao expresso. Neste exemplo, `Expresso` é a classe alvo (que 
vai receber novas funcionalidades a partir da aplicação de um ou mais Decorators).
- Como todas as classes alvo e os decorators seguem a mesma interface, para o cliente tanto faz se a classe é pura ou
se está envolta por um ou mais decorators. Isso traz uma grande flexibilidade para a solução.
- A ordem de aplicação dos Decorators pode produzir resultados diferentes, é preciso ficar atento a isso.
- Todos os Decorators herdam de uma classe abstrata, que também segue a mesma interface da classe alvo. Dentro dos 
métodos do Decorator base, a chamada simplesmente é repassada para o mesmo método na classe alvo. Serão os Decorators 
concretos que efetivamente adicionarão funcionalidades à classe alvo.

### Classes envolvidas:
- `DrinkDecorator`: Classe base para os Decorators (implementa a interface `Drink`).
- `DoubleDrink` e `Milk`: Decorators concretos que dobram a quantidade de bebida e adicionam leite, respectivamente.
- `Drink`: Interface que define os comportamentos de uma bebida. É implementada pelas classes alvo e pelos Decorators.
- `Expresso` e `Tea`: Classes alvo concretas que implementam diferentes tipos de bebidas.
- `Client`: Classe que cria uma variedade de bebidas apenas aplicando um ou mais Decorators em ordens diversas.
