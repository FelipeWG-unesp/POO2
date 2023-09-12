package ClassesVeiculo;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class VeiculoNacional extends Veiculo {
    protected float taxaImpostoEstadual;

    public VeiculoNacional(int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, categoriaCNHNecessaria, alugado);
    }

    public VeiculoNacional(float taxaImpostoEstadual, int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, categoriaCNHNecessaria, alugado);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public VeiculoNacional(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public VeiculoNacional() {
    }
    
    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }
    
    @Override
    public float calcularValorDiaria() {
        return valorDiaria + taxaImpostoEstadual;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de imposto estadual: " + taxaImpostoEstadual;
    }
    
}
