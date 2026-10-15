### Descrição:
- Este exemplo trata da construção de um mini sistema de pagamentos demonstrando como o padrão Facade pode tornar o
código do cliente muito mais enxuto e limpo, fazendo com que ele conheça apenas a Facade e não todos os serviços
envolvidos em um sistema de pagamentos.
- Nesta versão do exemplo, o cliente conhece apenas a Facade e a classe de domínio `Card`, desta forma não estando
acoplado às classes de serviços. Inclusive as classes de serviços não são visíveis para o cliente, pois estão com 
visibilidade de pacote, ou seja, não são públicas.

### Classes envolvidas:
- `Card` e `Register`: Classes de domínio que representam um cartão e um registro de compra no cartão, respectivamente.
- `CallCenterFacade`: Fachada que dispõe de métodos para realizar pagamentos, consultar o histórico de compras, etc,
encapsulando a complexidade dos serviços envolvidos.
- `CardService`, `PaymentService`, `RegisterService`, `ReportService` e `SecurityService`: Classes de serviços que 
encapsulam a lógica de negócio de cada serviço envolvido no sistema de pagamentos.
- `Client`: Classe que representa o cliente do sistema de pagamentos, que interage apenas com a Facade e a 
classe de domínio `Card`.