package LocadoraDeVeiculos;

import ClassesLocacao.Locacao;
import ClassesLocacao.Seguro;
import ClassesUsuario.Cliente;
import ClassesUsuario.Funcionario;
import ClassesUsuario.Usuario;
import ClassesVeiculo.Veiculo;
import ClassesVeiculo.VeiculoNacional;
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
    private ArrayList<Locacao> locacoes = new ArrayList<>();;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();;
    private ArrayList<Cliente> clientes = new ArrayList<>();;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();;
    private ArrayList<Seguro> seguros = new ArrayList<>();;
    private Configuracao configuracao;

    public LocadoraDeVeiculos(String nome, String endereco, String website, String redesocial, ArrayList<Locacao> locacoes, ArrayList<Veiculo> veiculos, ArrayList<Cliente> clientes, ArrayList<Funcionario> funcioonarios, ArrayList<Seguro> seguros, Configuracao configuracao) {
        this.nome = nome;
        this.endereco = endereco;
        this.website = website;
        this.redesocial = redesocial;
        this.locacoes = locacoes;
        this.veiculos = veiculos;
        this.clientes = clientes;
        this.funcionarios = funcioonarios;
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Funcionario> getFuncioonarios() {
        return funcionarios;
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

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setFuncioonarios(ArrayList<Funcionario> funcioonarios) {
        this.funcionarios = funcioonarios;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }
    
    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    
    public void addLocacao(Locacao locacao) {
        this.locacoes.add(locacao);
    }
    
    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void addSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }
    
    //Funções para Relatótios
    public String todosVeiculos() {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            saida = saida + veiculo.toString();
        }
        if("".equals(saida))
            return "Nenhum veículo";
        return saida;
    }
    
    public String veiculosNacionais() {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            if (veiculo.isNacional()) {
                saida = saida + veiculo.toString();
            }
        }
        if("".equals(saida))
            return "Nenhum veículo nacional";
        return saida;
    }
    
    public String veiculosImportados() {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            if (!veiculo.isNacional()) {
                saida = saida + veiculo.toString();
            }
        }
        if("".equals(saida))
            return "Nenhum veículo importado";
        return saida;
    }
    
    public String veiculosDisponiveis() {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            if (!veiculo.estaAlugado()) {
                saida = saida + veiculo.toString();
            }
        }
        if("".equals(saida))
            return "Nenhum veículo disponível";
        return saida;
    }
    
    public String veiculosDisponiveisTipoCNH(String tipo) {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getCategoriaCNHNecessaria() == null ? tipo != null : veiculo.getCategoriaCNHNecessaria().equals(tipo)) {
                saida = saida + veiculo.toString();
            }
        }
        if("".equals(saida))
            return "Nenhum veículo disponível para essa categoria de CNH";
        return saida;
    }
    
    public String veiculosLocados() {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            if (veiculo.estaAlugado()) {
                saida = saida + veiculo.toString();
            }
        }
        if("".equals(saida))
            return "Todos os veículos estão disponíveis";
        return saida;
    }
    
    public String veiculosAtrasados() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (locacao.verificaAtraso()) {
                for (Veiculo veiculo : veiculos) {
                    if (veiculo.getCodigoVeiculo() == locacao.getCodigoVeiculo())
                        saida = saida + veiculo.toString();
                }
            }
        }
        if("".equals(saida))
            return "Nenhum veículo atrasado";
        return saida;
    }
    
    public String clientesLocaramVeiculo(int codigoVeiculo) {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (locacao.getCodigoVeiculo() == codigoVeiculo) {
                saida = saida + locacao.getCodigoCliente().toString();
            }
        }
        if("".equals(saida))
            return "Veículo nunca locado";
        return saida;
    }
    
    public String todosFuncionarios() {
        String saida = "";
        for (Funcionario funcionario : funcionarios) {
            funcionario.toString();
        }
        if("".equals(saida))
            return "Nenhum funcionários cadastrado";
        return saida;
    }
    
    public String todosClientes() {
        String saida = "";
        for (Cliente cliente : clientes) {
            cliente.toString();
        }
        if("".equals(saida))
            return "Nenhum cliente cadastrado";
        return saida;
    }
    
    public String historicoCliente(int codigoCliente) {
        String saida = "";
        for (Cliente cliente : clientes) {
            if (cliente.getCodigoUsuario() == codigoCliente) {
                for (Locacao locacao : locacoes) {
                    if (locacao.getCodigoCliente() == cliente) {
                        saida = saida + locacao.getCodigoCliente().toString();
                    }
                }
            }
        }
        if("".equals(saida))
            return "Cliente não realizou locações";
        return saida;
    }
    
    public String clientesAtrasados() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (locacao.verificaAtraso()) {
                for (Cliente cliente : clientes) {
                    if (cliente == locacao.getCodigoCliente())
                        saida = saida + cliente.toString();
                }
            }
        }
        if("".equals(saida))
            return "Nenhum veículo atrasado";
        return saida;
    }
    
    public String todasLocacoes() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            saida = saida + locacao.toString();
        }
        if("".equals(saida))
            return "Nenhuma locação realizada";
        return saida;
    }
    
    public String locacoesFinalizadas() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (locacao.isFinalizada()) {
                saida = saida + locacao.toString();
            }
        }
        if("".equals(saida))
            return "Nenhuma locação finalizada";
        return saida;
    }
    
    public String locacoesNaoFinalizadas() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (!locacao.isFinalizada()) {
                saida = saida + locacao.toString();
            }
        }
        if("".equals(saida))
            return "Nenhuma locação não finalizada";
        return saida;
    }
    
    public String locacoesNaoFinalizadasNacional() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (!locacao.isFinalizada()) {
                for (Veiculo veiculo : veiculos) {
                    if (veiculo.isNacional() && veiculo.getCodigoVeiculo() == locacao.getCodigoVeiculo()) {
                        saida = saida + locacao.toString();
                    }
                }
            }
        }
        if("".equals(saida))
            return "Nenhuma locação não finalizada de veículos nacionais";
        return saida;
    }
    
    public String locacoesNaoFinalizadasImportado() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (!locacao.isFinalizada()) {
                for (Veiculo veiculo : veiculos) {
                    if (!veiculo.isNacional() && veiculo.getCodigoVeiculo() == locacao.getCodigoVeiculo()) {
                        saida = saida + locacao.toString();
                    }
                }
            }
        }
        if("".equals(saida))
            return "Nenhuma locação não finalizada de veículos importados";
        return saida;
    }
    
    public String locacoesVencidasNaoFinalizadas() {
        String saida = "";
        for (Locacao locacao : locacoes) {
            if (!locacao.isFinalizada() && locacao.verificaAtraso()) {
                saida = saida + locacao.toString();
            }
        }
        if("".equals(saida))
            return "Nenhuma locação não finalizada e vencida";
        return saida;
    }
    
    public String todosSeguros() {
        String saida = "";
        for (Seguro seguro : seguros) {
            saida = saida + seguro.toString();
        }
        if("".equals(saida))
            return "Nenhum seguro cadastrado";
        return saida;
    }
    
}
