### Descrição:
- Este exemplo trata de uma simulação de uma calculadora que utiliza o padrão de projeto Strategy para realizar 
operações matemáticas básicas (adição, subtração, multiplicação e divisão).
- Ao invés de o cliente ter que lidar com a lógica de cada operação, ele pode simplesmente escolher a estratégia 
desejada (por exemplo, `AdditionOperation`, `DivisionOperation`, etc.) e a calculadora executará a operação correspondente.

### Classes envolvidas:
- `OperationStrategy`: Interface comum para todas as estratégias de operação matemática. Define o método `calculate` que 
será implementado por cada estratégia concreta.
- `AdditionOperation`, `DivisionOperation`, `MultiplicationOperation`, `SubtractionOperation`: Classes concretas de 
estratégias de cálculos matemáticos.
- `Calculator`: Classe que utiliza a estratégia de operação matemática passada por parâmetro para realizar o cálculo.
- `Client`: Classe que estabelece qual estratégia será usada para cada cálculo.