### Descrição:
- Este exemplo trata de uma simulação de um fluxo que envolve vários passos. Cada passo é representado por uma cadeia de
handlers, onde cada um processa os dados e passa para o próximo handler na cadeia. Neste exemplo foi implementado um 
passo referente à criação de um usuário, que envolve a validação de campos obrigatórios e a persistência do usuário em 
memória.
- Diferente do exemplo `billsDispenser`, onde todos os handlers são do mesmo tipo, neste exemplo cada handler pode ser de
um tipo diferente. Dessa forma, foi necessário criar uma classe abstrata para definir o que todos os handlers devem ter 
em comum, como o método `execute` e a referência para o próximo handler na cadeia. Cada handler implementa sua própria 
lógica de processamento, mas todos seguem a mesma estrutura definida pela classe abstrata.
- Para comunicação entre os handlers, foi criada a classe `ProcessContext`, que armazena os dados que serão processados. 
Cada handler recebe o `ProcessContext` como argumento e pode modificar seus dados antes de passar para o próximo handler 
na cadeia.

### Classes envolvidas:
- `ProcessContext`: Classe responsável por armazenar os dados que serão processados pelos handlers.
- `ProcessStep`: Classe abstrata que define a estrutura comum para todos os handlers, incluindo o método `execute` e a 
referência para o próximo handler.
- `SaveUser` e `ValidateMandatoryFields`: Handlers concretos que implementam a lógica de processamento específica para 
cada passo do fluxo.
- `ServicesCatalog`: Classe que constrói cadeias de handlers padrão e fornece método para construção de cadeias 
customizadas.
- `GenericService`: Classe que inicia a execução da cadeia, através do método `run`, que recebe o primeiro handler da 
cadeia e o ProcessContext inicial.
- `UserRepository`: Classe que simula a persistência de dados, armazenando os usuários em memória.
- `Client`: Classe que representa o ponto de entrada do fluxo, onde o usuário é criado e a cadeia de handlers é iniciada.