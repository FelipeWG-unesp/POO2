package ClassesVeiculo;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class VeiculoImportado extends Veiculo {
    protected float taxaImpostoEstadual;
    protected float taxaImpostoFederal;
    
    public VeiculoImportado(int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, categoriaCNHNecessaria, alugado);
    }

    public VeiculoImportado(float taxaImpostoEstadual, float taxaImpostoFederal, int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, categoriaCNHNecessaria, alugado);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public VeiculoImportado() {
    }
    
    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    @Override
    public float calcularValorDiaria() {
        return valorDiaria + taxaImpostoEstadual + taxaImpostoFederal;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de imposto federal: " + taxaImpostoFederal + "\nTaxa de imposto estadual: " + taxaImpostoEstadual;
    }
    
}
