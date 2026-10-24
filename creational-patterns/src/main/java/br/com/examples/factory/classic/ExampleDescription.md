## Exemplo 1: Implementação clássica do padrão Factory Method - sistema de pedidos de iPhone

### Descrição:
- Este exemplo trata de uma simulação de um sistema de pedidos de iPhone, onde diferentes tipos de iPhones podem ser 
solicitados. O padrão Factory Method é utilizado para criar objetos de diferentes modelos de iPhone sem expor a lógica 
de criação ao cliente.
- Este exemplo mostra a implementação clássica do padrão e é o mais complexo, pois cada tipo de iPhone possui sua 
própria Factory (e dentro dela seu Factory Method). Dessa forma, o cliente precisa saber qual Factory chamar. Apesar 
disso, dependendo do caso de uso, pode ser uma abordagem interessante.

### Classes envolvidas:
- `IPhoneFactory`: Classe abstrata que é a base para a crição de todas as Factories. Traz a implementação padrão de 
diversos métodos comuns a todas as Factories, além do método abstrato `createIPhone()`, que deve ser implementado por 
cada Factory concreta.
- `IPhone11Factory`, `IPhone11ProFactory`, `IPhoneXFactory`, `IPhoneXSMaxFactory`: Factories concretas.
- `IPhone`: Classe abstrata que representa um iPhone genérico. Contém métodos comuns a todos os modelos de iPhone.
- `IPhone11`, `IPhone11Pro`, `IPhoneX`, `IPhoneXSMax`: Classes concretas que representam os diferentes modelos de 
iPhone. Cada uma implementa os métodos específicos de seu modelo.
- `Client`: Classe que representa o cliente que deseja fazer um pedido de iPhone. O cliente utiliza a Factory para criar
o objeto do modelo desejado sem precisar conhecer os detalhes de implementação. Porém, ele precisa saber qual Factory
concreta chamar para criar o modelo desejado.