package ClassesLocacao;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class Cartao extends Pagamento {
    private String nome;
    private String bandeira;
    private String numero;
    private int cvv;

    public Cartao(String nome, String bandeira, String numero, int cvv, String tipoPagamento) {
        super(tipoPagamento);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
        this.cvv = cvv;
    }

    public Cartao(String tipoPagamento) {
        super(tipoPagamento);
    }

    public String getNome() {
        return nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNome: " + nome + "\nBandeira: " + bandeira + "\nNúmero: " + numero + "\nCVV: " + cvv;
    }
    
}
