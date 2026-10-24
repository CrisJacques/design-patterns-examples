## Exemplo 3: Implementação mais usada do padrão Factory Method (Simple Factory) - sistema de pedidos de iPhone

### Descrição:
- Este exemplo é o mesmo do exemplo 1, porém implementando a forma mais simples do padrão Factory Method: o Simple 
Factory. A diferença em relação aos outros exemplos é que neste caso temos uma única Factory que vai ser responsável
por retornar diversos modelos de iPhone, inclusive de gerações diferentes.
- Dessa forma, o cliente não precisa mais saber qual Factory chamar, ele passa os parâmetros necessários para a Factory 
e ela retorna o modelo de iPhone desejado. Isso simplifica enormemente o código do cliente.

### Classes envolvidas:
- `IPhoneSimpleFactory`: Classe responsável por criar todas as variações de iPhone. Vai retornar o iPhone desejado de 
acordo com os parâmetros passados pelo cliente.
- `IPhone`: Classe abstrata que representa um iPhone genérico. Contém métodos comuns a todos os modelos de iPhone. 
Tanto esta classe quanto as classes concretas possuem a mesma implementação do exemplo 1.
- `IPhone11`, `IPhone11Pro`, `IPhoneX`, `IPhoneXSMax`: Classes concretas que representam os diferentes modelos de 
iPhone. Cada uma implementa os métodos específicos de seu modelo.
- `Client`: Classe que representa o cliente que deseja fazer um pedido de iPhone. Como apenas existe uma Factory, o
cliente não precisa mais se preocupar em saber qual Factory chamar, ele apenas chama a Factory passando os parâmetros 
necessários para obter o modelo de iPhone desejado. Observe que a implementação desse cliente é a mais simples dentre
todos os exemplos mostrados.