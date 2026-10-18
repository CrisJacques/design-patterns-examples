### Descrição:
- Este exemplo trata de uma simulação de configuração e uso de um dispositivo Alexa, capaz de executar comandos 
previamente cadastrados.
- Aqui foi utilizado o Design Pattern Command, que encapsula uma solicitação como um objeto, permitindo maior 
flexibilidade para configuração e uso desses comandos. Com ele, o cliente não precisa conhecer os detalhes de
acionamento dos destinatários, pois isso está encapsulado nos objetos de comando.
- Cada objeto command implementa uma interface comum, permitindo que o cliente execute comandos de forma uniforme, sem 
se preocupar com a implementação específica de cada comando. Além disso, os destinatários também seguem uma interface 
comum, permitindo que o cliente interaja com eles de forma consistente.

### Classes envolvidas:
- `Alexa`: Classe que representa o dispositivo Alexa, responsável por receber e executar os comandos.
- `AlexaAI`: Classe que auxilia na identificação do comando correto a ser executado.
- `Command`: Interface comum a todos os comandos, definindo o método `execute()`.
- `TurnLightOffCommand` e `TurnLightOnCommand`: Classes concretas que implementam a interface `Command`, representando 
comandos específicos para ligar e desligar a luz.
- `GenericLight`: Interface comum a todos os destinatários de comandos, definindo os métodos `turnOn()` e `turnOff()`.
- `PhilipsHueLight` e `XiaomiLight`: Classes concretas que implementam a interface `GenericLight`, representando 
destinatários de comandos.
- `Client`: Classe que simula a interação do usuário com o dispositivo Alexa, enviando comandos para execução.
