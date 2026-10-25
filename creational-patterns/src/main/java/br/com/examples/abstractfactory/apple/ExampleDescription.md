## Exemplo 2: Combinando o padrão Abstract Factory com o padrão Factory Method

### Descrição:
- Este exemplo trata de uma simulação de um sistema de pedidos de iPhones. Os iPhones são criados através do
padrão Factory Method e a criação de certificados e empacotamento é feita a partir do padrão Abstract Factory.
- Para os iPhones, existem duas Factories: uma para os modelos da geração 11 e outra para os modelos da geração
X. Na prática, são duas Simple Factories. 
- Dentro de cada uma das Factories, há um método (o Factory Method) responsável por executar todos os passos
necessários para a criação de um iPhone. Dentre esses passos há dois cujas regras variam de país para país: 
certificados e empacotamento. É aí que entra o padrão Abstract Factory.
- Cada Abstract Factory irá gerar o certificado e o empacotamento relacionados a um determinado país. Tais objetos
são compatíveis e podem colaborar entre si, constituindo uma família de objetos, que é exatamente o que Abstract
Factories geram.

### Classes envolvidas:
- `CountryRulesAbstractFactory`: interface que define os métodos essenciais para a criação de famílias de objetos de 
empacotamento e certificados.
- `BrasilianRulesAbstractFactory` e `USRulesAbstractFactory`: fábricas concretas que implementam o empacotamento e 
certificados levando em conta as regras de cada país.
- `IPhoneFactory`: classe abstrata que serve de base para as Factories de iPhones, contendo os métodos obrigatórios para
se criar um iPhone, com um deles com implementação padrão.
- `IPhone11Factory` e `IPhoneXFactory`: fábricas concretas de iPhones, onde cada uma gera diferentes tipos de iPhone de 
uma mesma geração. Neste caso, não temos uma família de objetos, pois todos os objetos gerados por cada Factory são de
um mesmo tipo (IPhone). Famílias de objetos são objetos de tipos diferentes que estão ligados por um conceito ou um 
contexto. Tais objetos devem ser compatíveis e poder colaborar entre si.
- `Certificate`: Interface que define os métodos básicos para os certificados (que é um dos produtos das Abstract 
Factories).
- `BrazilianCertificate` e `USCertificate`: implementações concretas dos certificados para as regras do Brasil e US.
- `IPhone`: classe abstrata que define a base de comportamentos para um iPhone. Possui como dependência as regras de 
empacotamento e certificados, que serão geradas por Abstract Factories.
- `IPhone11`, `IPhone11Pro`, `IPhoneX`, `IPhoneXSMax`: implementações concretas de iPhones.
- `Packing`: Interface que define os métodos básicos para o empacotamento (que é um dos produtos das Abstract Factories).
- `BrazilianPacking` e `USPacking`: implementações concretas do empacotamento para as regras do Brasil e US.
- `Client`: classe que cria os iPhones com regras de empacotamento e certificados de acordo com o país selecionado. 
Interage apenas com as Factories, Abstract Factories e com a interface IPhone, sem conhecer as classes concretas nem dos
IPhones e nem das regras de empacotamento e certificados.