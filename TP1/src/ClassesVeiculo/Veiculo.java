package ClassesVeiculo;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public abstract class Veiculo {
    protected int codigoVeiculo;
    protected String nomeModelo;
    protected String montadora;
    protected int anoFabricacao;
    protected int anoModelo;
    protected String placa;
    protected String categoria;
    protected float valorFipe;
    protected float valorDiaria;
    protected String categoriaCNHNecessaria;
    protected boolean alugado;

    public Veiculo(int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado) {
        this.codigoVeiculo = codigoVeiculo;
        this.nomeModelo = nomeModelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.placa = placa;
        this.categoria = categoria;
        this.valorFipe = valorFipe;
        this.valorDiaria = valorDiaria;
        this.categoriaCNHNecessaria = categoriaCNHNecessaria;
        this.alugado = alugado;
    }

    public Veiculo() {
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getValorFipe() {
        return valorFipe;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public String getCategoriaCNHNecessaria() {
        return categoriaCNHNecessaria;
    }

    public boolean isAlugado() {
        return alugado;
    }
    
    public String getAlugado() {
        return alugado ? "Sim" : "Não";
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValorFipe(float valorFipe) {
        this.valorFipe = valorFipe;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setCategoriaCNHNecessaria(String categoriaCNHNecessaria) {
        this.categoriaCNHNecessaria = categoriaCNHNecessaria;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public boolean isNacional() {
        return false;
    }
    
    abstract float calcularValorDiaria();
    
    public boolean estaAlugado() {
        return alugado;
    }
    
    public void alugar() {
        this.setAlugado(true);
    }
    
    public void devolver() {
        this.setAlugado(false);
    }
    
    @Override
    public String toString() {
        return "Código do veículo: " + codigoVeiculo + "\nNome do modelo: " + nomeModelo + "\nMontadora: " + montadora + "\nAno de fabricação: " + anoFabricacao + "\nAno do modelo: " + anoModelo + "\nPlaca: " + placa + "\nCategoria: " + categoria + "\nValor na FIPE: " + valorFipe + "\nValor da diária: " + valorDiaria + "\nCategoria de CNH necessária: " + categoriaCNHNecessaria + "\nEstá alugado? " + getAlugado();
    }
    
}
