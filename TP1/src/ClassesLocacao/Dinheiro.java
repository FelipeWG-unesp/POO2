package ClassesLocacao;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class Dinheiro extends Pagamento {
    private int qntCedulas;

    public Dinheiro(int qntCedulas, String tipoPagamento) {
        super(tipoPagamento);
        this.qntCedulas = qntCedulas;
    }

    public int getQntCedulas() {
        return qntCedulas;
    }

    public void setQntCedulas(int qntCedulas) {
        this.qntCedulas = qntCedulas;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de cédulas: " + qntCedulas;
    }
    
}
