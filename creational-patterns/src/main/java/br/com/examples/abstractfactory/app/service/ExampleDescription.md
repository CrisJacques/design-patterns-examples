## Exemplo 1: Implementação do padrão Abstract Factory - aplicativo de carros e usuários

### Descrição:
- Este exemplo trata de uma simulação de um aplicativo que gerencia cadastros de usuários e carros. Ele utiliza o padrão
Abstract Factory para criar as classes de serviços relacionados a usuários e carros, onde cada Abstract Factory cria
uma família de objetos relacionados (neste caso, serviços de usuários e carros em um determinado tipo de tecnologia, por
exemplo Rest e EJB). Os objetos de uma mesma família devem ser compatíveis e colaborar entre si, por isso que aqui a
organização das famílias de serviços leva em conta a tecnologia.
- Neste exemplo, podemos ver que o padrão Abstract Factory não serve apenas para criar famílias de objetos que 
representam entidades (por exemplo, Carros e Usuários), mas também para criar famílias de outros tipos de objetos (por
exemplo, serviços que manipulam essas entidades).

### Classes envolvidas:
- `ServicesAbstractFactory`: Interface que define os métodos para criar os serviços de usuários e carros.
- `RestAbstractFactory`: Implementação concreta da `ServicesAbstractFactory` que cria serviços de usuários e carros 
utilizando a tecnologia Rest.
- `EJBAbstractFactory`: Implementação concreta da `ServicesAbstractFactory` que cria serviços de usuários e carros 
utilizando a tecnologia EJB.
- `UserService`: Interface que define os métodos para manipular usuários.
- `CarService`: Interface que define os métodos para manipular carros.
- `UserRestApiService`: Implementação concreta da `UserService` que utiliza a tecnologia Rest.
- `CarRestApiService`: Implementação concreta da `CarService` que utiliza a tecnologia Rest.
- `UserEJBService`: Implementação concreta da `UserService` que utiliza a tecnologia EJB.
- `CarEJBService`: Implementação concreta da `CarService` que utiliza a tecnologia EJB.
- `Client`: Classe principal que demonstra o uso do padrão Abstract Factory para criar serviços de usuários e carros 
utilizando diferentes tecnologias. O cliente interage apenas com as interfaces das Abstract Factories e dos serviços, o 
que possibilita que ele funcione com qualquer implementação concreta das Abstract Factories e dos serviços, sem precisar
conhecer os detalhes de implementação.
