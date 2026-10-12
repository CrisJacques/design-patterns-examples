### Descrição:
- Este exemplo trata de uma simulação de um carrinho de compras em um e-commerce, onde o usuário pode adicionar produtos
ao carrinho e calcular o valor total da compra.
- O objetivo é demonstrar como o padrão Iterator permite percorrer uma coleção de objetos (neste caso, os produtos no 
carrinho) sem expor a estrutura interna da coleção.

### Classes envolvidas:
- `Cart`: Classe que implementa a interface Iterable do Java, permitindo que o carrinho de compras seja percorrido 
usando um Iterator. A lista de produtos em si é um atributo privado, garantindo que a estrutura interna do carrinho não 
seja exposta diretamente nem possa ser modificada de forma inadequada.
- `Product`: Classe que representa um produto com atributos como nome e preço.
- `Client`: Classe que simula a interação do usuário com o carrinho de compras. Dentro dela, temos exemplos de uso do 
Iterator para imprimir na tela as informações dos produtos adicionados ao carrinho e calcular o valor total da compra.