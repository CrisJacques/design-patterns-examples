### Descrição:
- Este exemplo trata da construção de um mini sistema de pagamentos demonstrando como o padrão Facade pode tornar o
código do cliente muito mais enxuto e limpo, fazendo com que ele conheça apenas a Facade e não todos os serviços
envolvidos em um sistema de pagamentos.
- Nesta versão do exemplo, o cliente conhece apenas a Facade, desta forma não estando acoplado às classes de serviços e 
nem a classes de domínio (a dependência da classe de domínio foi extinta fazendo os métodos da Facade receberem como 
parâmetro e retornar apenas tipos primitivos e Strings).
- Isso não significa que necessariamente esta abordagem é melhor do que a mostrada no package `withDomain`, onde
o cliente depende de classe de domínio. Para cada caso, deve-se avaliar qual abordagem é mais adequada.
- Além disso, esse exemplo aborda a existência de mais de uma Facade, demonstrando que o padrão Facade não precisa ser 
aplicado apenas uma vez em um sistema, podendo haver várias Facades, cada uma com responsabilidades diferentes.

### Classes envolvidas:
- `Card` e `Register`: Classes de domínio que representam um cartão e um registro de compra no cartão, respectivamente.
- `CallCenterFacade` e `CallCenterNewCardFacade`: Fachadas que dispõem de métodos para realizar pagamentos, consultar o 
histórico de compras, criar cartões, etc, encapsulando a complexidade dos serviços envolvidos.
- `CardService`, `PaymentService`, `RegisterService`, `ReportService` e `SecurityService`: Classes de serviços que 
encapsulam a lógica de negócio de cada serviço envolvido no sistema de pagamentos.
- `Client`: Classe que representa o cliente do sistema de pagamentos, que interage apenas com a Facade.