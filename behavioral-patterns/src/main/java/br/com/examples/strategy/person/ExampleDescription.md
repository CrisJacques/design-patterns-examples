### Descrição:
- Este exemplo trata da geração de pessoas com diferentes características, cada uma com seu jeito de se transportar, 
comer e trabalhar. 
- A ideia é demonstrar o padrão Strategy, onde cada pessoa pode ter diferentes estratégias de comportamento.

### Classes envolvidas:
- `EatStrategy`: Interface comum a todas as estratégias de alimentação. Possui o método `eat()`, que define como a 
pessoa se alimenta.
- `WorkStrategy`: Interface comum a todas as estratégias de trabalho. Possui o método `work()`, que define como a 
pessoa trabalha.
- `TransportationStrategy`: Interface comum a todas as estratégias de transporte. Possui o método `move()`, que define 
como a pessoa se desloca.
- `Person`: Classe que representa uma pessoa, contendo referências para as estratégias de alimentação, trabalho e 
transporte. Através dela, é possível criar pessoas com as mais variadas combinações de estratégias.
- `MeatFoodStrategy`, `VeggieFoodStrategy`: Implementações concretas da estratégia de alimentação.
- `DeveloperStrategy`, `NoWorkStrategy`, `PilotStrategy`: Implementações concretas da estratégia de trabalho.
- `AirplaneStrategy`, `BikeStrategy`, `CarStrategy`, `WalkStrategy`: Implementações concretas da estratégia de 
transporte.
- `Client`: Classe que demonstra a criação de diferentes pessoas com combinações variadas de estratégias.