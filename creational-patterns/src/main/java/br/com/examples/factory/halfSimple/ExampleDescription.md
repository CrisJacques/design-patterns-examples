## Exemplo 2: Implementação simplificada do padrão Factory Method - sistema de pedidos de iPhone

### Descrição:
- Este exemplo é o mesmo do exemplo 1, porém com uma implementação mais simples: foram criadas apenas duas Factories,
uma para iPhones da geração 11 e outra para iPhones da geração X. 
- Neste caso, o cliente ainda precisa saber qual Factory chamar, mas ele depende de uma quantidade menor de classes,
diminuindo a complexidade do sistema.

### Classes envolvidas:
- `IPhoneFactory`: Classe abstrata que é a base para a crição de todas as Factories. Implementação idêntica à do 
exemplo 1.
- `IPhone11Factory` e `IPhoneXFactory`: Factories concretas. Ao contrário do exemplo 1, onde cada Factory retornava
apenas um tipo de produto, estas Factories retornam diferentes modelos de iPhone da mesma geração.
- `IPhone`: Classe abstrata que representa um iPhone genérico. Contém métodos comuns a todos os modelos de iPhone. 
Tanto esta classe quanto as classes concretas possuem a mesma implementação do exemplo 1.
- `IPhone11`, `IPhone11Pro`, `IPhoneX`, `IPhoneXSMax`: Classes concretas que representam os diferentes modelos de 
iPhone. Cada uma implementa os métodos específicos de seu modelo.
- `Client`: Classe que representa o cliente que deseja fazer um pedido de iPhone. O cliente utiliza a Factory para criar
o objeto do modelo desejado sem precisar conhecer os detalhes de implementação, mas ele precisa saber qual Factory
concreta chamar para criar o modelo desejado. Porém, a quantidade de Factories é menor, o que diminui a complexidade do 
sistema.