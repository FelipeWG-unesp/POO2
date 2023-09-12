package ClassesLocacao;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public abstract class Pagamento {
    private String tipoPagamento;

    public Pagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Pagamento() {
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public String toString() {
        return "Tipo de pagamento: " + tipoPagamento;
    }
    
}
