package ClassesLocacao;

import ClassesUsuario.Cliente;
import ClassesUsuario.Funcionario;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class Locacao {
    private int codigoLocacao;
    private Cliente codigoCliente;
    private Funcionario codigoFuncionario;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private float valorTotal;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados = new ArrayList<>();
    private boolean finalizada;
    private int codigoVeiculo;

    public Locacao(int codigoLocacao, Cliente codigoCliente, Funcionario codigoFuncionario, LocalDate dataLocacao, LocalDate dataDevolucao, float valorTotal, Pagamento formaPagamento, ArrayList<Seguro> segurosContratados, boolean finalizada, int codigoVeiculo) {
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.finalizada = finalizada;
        this.codigoVeiculo = codigoVeiculo;
    }

    public Locacao() {
    }

    public int getCodigoLocacao() {
        return codigoLocacao;
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public Funcionario getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public boolean isFinalizada() {
        return finalizada;
    }
    
    public String getFinalizada() {
        return finalizada ? "Sim" : "Não";
    }

    public void setCodigoLocacao(int codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setCodigoFuncionario(Funcionario codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }
    
    public boolean possuiSeguro() {
        return segurosContratados != null;
    }
    
    public float calcularValorTotal() {
        float valor;
        valor = valorTotal;
        for (Seguro busca : segurosContratados) {
            valor = valor + busca.getValor();
        }
        return valor;
    }
    
    public boolean verificaAtraso() {
        return dataDevolucao.isBefore(LocalDate.now());
    }
    
    public String toString() {
        String seguros = "";
        String pag;
        if (formaPagamento == null)
            pag = "Forma de pagameto: [Não especificada]";
        else
            pag = formaPagamento.toString();
        for (Seguro seguro : segurosContratados) {
            seguros = seguros + seguro.toString();
        }
        return "Código da locação: " + codigoLocacao + "\n" + 
                "Código do cliente: " + codigoCliente + "\n" + 
                "Código do funcionário: " + codigoFuncionario + "\n" + 
                "Data de locação: " + dataLocacao + "\n" + 
                "Data de devolução: " + dataDevolucao + "\n" + 
                "Valor total: " + calcularValorTotal() + "\n" + 
                pag + "\n" + 
                seguros + 
                "Locação finalizada? " + getFinalizada() + "\n" + 
                "Em atraso? " + (verificaAtraso() ? "Sim" : "Não");
    }
    
}
