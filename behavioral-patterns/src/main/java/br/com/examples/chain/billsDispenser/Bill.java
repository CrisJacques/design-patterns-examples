package br.com.examples.chain.billsDispenser;

public class Bill {
    private Integer value;
    /**
     * Quem será o próximo handler da cadeia. Cada handler sabe chamar o próximo da cadeia, mas não sabe quem é. Isso é
     * definido no momento da construção da cadeia, onde o cliente constrói a cadeia, ou usa uma pré-definida.
     */
    private Bill next;

    /**
     * Construtor sem definição do próximo handler da cadeia. Ele poderá ser definido posteriormente usando o método
     * setNext().
     * @param value - Valor da nota
     */
    public Bill(Integer value) {
        this.value = value;
    }

    /**
     * Construtor que já define o próximo handler da cadeia.
     * @param value - Valor da nota
     * @param next - Próximo handler da cadeia
     */
    public Bill(Integer value, Bill next) {
        this.value = value;
        this.next = next;
    }

    public void setNext(Bill bill) {
        this.next = bill;
    }

    /**
     * Este método possui a execução deste handler da cadeia. Dentro dele, há 3 ações principais:
     * - Se este handler irá processar o pedido (if (remaining >= value), onde dentro do if há todo o processamento a ser
     * feito;
     * - Se a cadeia deve terminar neste handler (no caso deste exemplo, a cadeia pode terminar quando remaining == 0)
     * - Passa o pedido para o próximo, se houver
     * @param remaining - Quanto ainda precisa ser pago ao usuário
     */
    public void execute(Integer remaining) {
        if(remaining >= value) {
            int bills = remaining / value;
            remaining %= value;
            System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, value, remaining));
        }
        if (remaining == 0) return;
        if(next != null) next.execute(remaining);
    }


}
