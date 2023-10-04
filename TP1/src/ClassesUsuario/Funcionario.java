package ClassesUsuario;

import java.time.LocalDate;

/**
 *
 * @Felipe Wunder Giovaneli
 */
public class Funcionario extends Usuario {
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;
    
    public Funcionario(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
    }

    public float getSalario() {
        return salario;
    }

    public String getPis() {
        return pis;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSalário: " + salario + "\nPIS: " + pis + "\nData de admissão: " + dataAdmissao;
    }
    
}
