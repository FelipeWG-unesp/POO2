package LocadoraDeVeiculos;

import ClassesLocacao.Locacao;
import ClassesLocacao.Seguro;
import ClassesUsuario.Usuario;
import ClassesVeiculo.Veiculo;
import Configuracao.Configuracao;
import java.util.ArrayList;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class LocadoraDeVeiculos {
    private String nome;
    private String endereco;
    private String website;
    private String redesocial;
    private ArrayList<Locacao> locacoes;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> funcioonarios;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracao;
    
    public LocadoraDeVeiculos(String nome, String endereco, String website, String redesocial, ArrayList<Locacao> locacoes, ArrayList<Veiculo> veiculos, ArrayList<Usuario> clientes, ArrayList<Usuario> funcioonarios, ArrayList<Seguro> seguros, Configuracao configuracao) {
        this.nome = nome;
        this.endereco = endereco;
        this.website = website;
        this.redesocial = redesocial;
        this.locacoes = locacoes;
        this.veiculos = veiculos;
        this.clientes = clientes;
        this.funcioonarios = funcioonarios;
        this.seguros = seguros;
        this.configuracao = configuracao;
    }

    public LocadoraDeVeiculos() {
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getWebsite() {
        return website;
    }

    public String getRedesocial() {
        return redesocial;
    }

    public ArrayList<Locacao> getLocacoes() {
        return locacoes;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Usuario> getClientes() {
        return clientes;
    }

    public ArrayList<Usuario> getFuncioonarios() {
        return funcioonarios;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setRedesocial(String redesocial) {
        this.redesocial = redesocial;
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        this.clientes = clientes;
    }

    public void setFuncioonarios(ArrayList<Usuario> funcioonarios) {
        this.funcioonarios = funcioonarios;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }
    
}
