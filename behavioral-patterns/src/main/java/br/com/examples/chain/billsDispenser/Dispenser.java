package br.com.examples.chain.billsDispenser;

public class Dispenser {
    /**
     * Primeiro handler da cadeia. A partir dele, cada um dos handlers vai chamando o próximo até uma condição de
     * término da cadeia acontecer ou até a cadeia terminar
     */
    private Bill chain;

    /**
     * Construtor padrão de uma cadeia de handlers, que utiliza o construtor customizado declarado abaixo
     */
    public Dispenser() {
        this(new Bill(100), new Bill(50), new Bill(25),
                new Bill(10), new Bill(5), new Bill(1));
    }

    /**
     * Constrói a cadeia de handlers e retorna o primeiro handler da cadeia
     * @param bills - Handlers que farão parte de cadeia (quantos forem necessários, já na ordem de execução para o caso
     *              deste construtor)
     */
    public Dispenser(Bill... bills) {
        for(int index = 0; index < bills.length -1; index++) {
            Bill currentBill = bills[index];
            currentBill.setNext(bills[index + 1]);
        }
        chain = bills[0];
    }

    /**
     * Método que o cliente irá chamar para cálculo da quantidade de notas de cada valor a serem entregues ao usuário.
     * Chama o primeiro handler da cadeia, que por sua vez chamará o segundo e assim por diante.
     * @param amount - Valor a ser processado pelo handler
     */
    public void withDraw(Integer amount) {
        chain.execute(amount);
    }

}
