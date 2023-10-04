package tp1;

import ClassesVeiculo.VeiculoImportado;
import ClassesVeiculo.VeiculoNacional;
import LocadoraDeVeiculos.LocadoraDeVeiculos;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class TP1 {

    public static void main(String[] args) {
        
        VeiculoImportado carro1 = new VeiculoImportado(1, "modelo1", "montadora1", 2000, 2000, "abc1234", "a", 100000, 150, "a", false);
        VeiculoNacional carro2 = new VeiculoNacional(2, "modelo2", "montadora2", 2001, 2001, "cba1234", "a", 50000, 100, "a", false);
        
        LocadoraDeVeiculos teste;
        teste = new LocadoraDeVeiculos();
        teste.setNome("teste");
        teste.addVeiculo(carro1);
        teste.addVeiculo(carro2);
        
        System.out.println(teste.veiculosLocados());
        //System.out.println(carro1.toString());
        
    }
    
}
