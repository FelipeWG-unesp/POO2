package ClassesLocacao;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class Seguro {
    private int codigoSeguro;
    private String nome;
    private String tipo;
    private String descricao;
    private float valor;

    public Seguro(int codigoSeguro, String nome, String tipo, String descricao, float valor) {
        this.codigoSeguro = codigoSeguro;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Seguro() {
    }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public String toString() {
        return "Código do seguro: " + codigoSeguro + "\n" + 
                "Nome: " + nome + "\n" + 
                "Tipo: " + tipo + "\n" + 
                "Descrição: " + descricao + "\n" + 
                "Valor: " + valor;
    }
    
}
