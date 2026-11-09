## Exemplo 2: Implementação do padrão Proxy - Carregamento de recursos

### Descrição:
- Este exemplo trata de uma simulação de carregamento de recursos pesados (por exemplo, grandes quantidades de dados). A
ideia é demonstrar outro caso de uso do padrão Proxy: adicionar funcionalidades à classe original.
- Neste caso, o Proxy traz 3 funcionalidades adicionais:
  - Controle de acesso, através de validação de token;
  - Lazy Loading, disparando o carregamento dos recursos apenas quando realmente necessário (ao contrário da classe 
original, que já carrega os recursos na instanciação do objeto, sem nem saber se serão efetivamente usados);
  - Cache, ou seja, é chamada a classe original apenas se a cache estiver vazia, caso contrário já retorna os recursos
armazenados na cache.

### Classes envolvidas:
- `ResourceImpl`: Contém a lógica de carregamento de recursos.
- `ResourceProxy`: Proxy para classes que implementam a interface `Resource` (incluindo `ResourceImpl`), trazendo
funcionalidades adicionais para a classe original.
- `Resource`: Interface que deve ser implementada pelas classes originais e pelo Proxy, para que sejam intercambiáveis
no cliente.
- `Client`: Classe principal, que permite comparar a dinâmica de carregamento de recursos pesados usando e sem usar o 
Proxy.