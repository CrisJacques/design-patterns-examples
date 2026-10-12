### Descrição:
- Este exemplo trata de uma simulação de um caixa eletrônico que utiliza o padrão de projeto Chain of Responsibility 
para dispensar diferentes valores de notas. 
- A ideia é retornar quantas notas de cada valor são necessárias para compor o valor solicitado pelo usuário.
- O objetivo é demonstrar como o padrão permite que uma solicitação seja passada ao longo de uma cadeia de handlers até 
que um (ou mais de um) deles a processe.

### Classes envolvidas:
- `Bill`: Classe que constrói os handlers para cada valor de nota (R\$100, R\$50, R\$20, R\$10, R\$5 e R\$1).
- `Dispenser`: Classe que constrói uma cadeia de responsabilidade padrão e também permite construir cadeias customizadas.
- `Client`: Classe que simula a interação do usuário com o caixa eletrônico. Dentro dela, temos exemplos usando a cadeia 
padrão e uma cadeia customizada.