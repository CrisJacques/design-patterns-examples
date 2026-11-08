## Exemplo 1: Implementação do padrão Proxy - Banco e ATM (Caixa Eletrônico)

### Descrição:
- Este exemplo trata da construção de uma simulação bem simplificada de um banco com um caixa eletrônico. Aqui a ideia é
demonstrar um dos usos possíveis do Design Pattern Proxy, onde a classe proxy controla o acesso às funcionalidades da
classe original. Em alguns casos, ela repassará integralmente a chamada para a classe original executar o trabalho, mas
em outros casos, ela não permitirá esse repasse.
- Tanto a classe original quanto a classe proxy devem implementar a mesma interface, para que possam ser intercambiáveis
no código cliente.

### Classes envolvidas:
- `User`: Classe que representa o usuário do banco/caixa eletrônico. Classe simples de domínio, com métodos básicos.
- `Bank`: Classe que representa o banco. Nela, estão implementadas as funcionalidades de saque, depósito e redefinição
de senha. Assim como na vida real, todas essas operações estão liberadas normalmente quando o cliente está dentro da
agência do banco. Porém, via ATM, ele terá algumas restrições.
- `ATM`: Classe que funciona como um proxy para o banco (`Bank`). Nela, estão implementadas regras de negócio que irão
decidir em quais casos a operação solicitada realmente será executada (por exemplo, depósitos estão liberados sempre,
mas saques via ATM (Caixa Eletrônico) só serão permitidos abaixo de 300 reais).
- `BankOperations`: Interface que define as operações obrigatórias para o sistema bancário. As classes `Bank` e `ATM`
devem implementar esta interface para serem intercambiáveis no cliente.
- `Client`: Classe principal, que solicita a execução de uma série de ações através do banco e do caixa eletrônico. 
Enquanto que no banco todas as operações são permitidas, no ATM apenas serão permitidas as operações liberadas pelas
regras de negócio.