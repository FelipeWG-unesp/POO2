package tp1;

import ClassesLocacao.Locacao;
import ClassesVeiculo.Veiculo;
import ClassesVeiculo.VeiculoImportado;
import java.time.LocalDate;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class TP1 {

    public static void main(String[] args) {
        Veiculo carro = new VeiculoImportado() {};
        
        //System.out.println(carro.toString());
        
        Locacao teste = new Locacao();
        teste.setDataDevolucao(LocalDate.of(2023, 9, 15));
        //System.out.println(teste.verificaAtraso() ? "Atrasado" : "Não atrasado");
        
        System.out.println(teste.toString());
        
    }
    
}
