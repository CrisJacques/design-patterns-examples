### Descrição:
- Este exemplo trata de uma simulação de um controle remoto de televisão, onde o usuário pode buscar os canais 
disponíveis.
- O objetivo é demonstrar como o padrão Iterator permite percorrer uma coleção de objetos (neste caso, os canais da TV) 
sem expor a estrutura interna da coleção.
- Ao contrário do exemplo do carrinho de compras, onde o iterador disponibilizado pela classe era o próprio iterador da
interface List do Java, neste exemplo o iterador é implementado de forma personalizada, através de uma classe específica.

### Classes envolvidas:
- `TV`: Classe que implementa a interface Iterable do Java, permitindo que a lista de canais seja percorrida usando um 
Iterator. A lista de canais em si é um atributo privado, garantindo que a estrutura interna da coleção não 
seja exposta diretamente nem possa ser modificada de forma inadequada.
- `ChannelIterator`: Classe que implementa o iterador dos canais da TV.
- `Client`: Classe que simula a interação do usuário com o controle remoto. Dentro dela, temos um exemplo de uso do
Iterator construído para descobrir quais canais estão disponíveis.