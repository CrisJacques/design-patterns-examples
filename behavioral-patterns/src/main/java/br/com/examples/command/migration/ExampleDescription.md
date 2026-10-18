### Descrição:
- Este exemplo trata de uma simulação de ferramenta de migration de banco de dados.
- Aqui foi utilizado o Design Pattern Command, onde cada migration foi encapsulada como um objeto Command, suportando
inclusive a possibilidade de desfazer a migration.
- Neste exemplo, cada objeto Command já executa a operação em si, sem delegar para um destinatário (diferentemente do
exemplo da Alexa, onde o comando delega a execução para um destinatário específico).

### Classes envolvidas:
- `MigrationTool`: Classe que representa a ferramenta de migration. Através dela, é possível montar e percorrer a lista 
de migrations, avançando e retrocedendo uma a uma ou executando/revertendo todas de uma vez.
- `MigrationCommand`: Classe abstrata para os comandos de migration, definindo os métodos `execute()` e `undo()`, 
possibilitando que as ações feitas no banco de dados sejam reversíveis.
- `ProductTable`, `UserTable` e `UserTableRoleColumn`: Classes concretas de migrations, que fazem e desfazem as 
alterações.
- `Client`: Classe que simula a interação do usuário com a ferramenta de migration, enviando comandos para execução e
desfazendo-os quando necessário.