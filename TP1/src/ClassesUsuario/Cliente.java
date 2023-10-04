package ClassesUsuario;

import java.time.LocalDate;

/**
 *
 * @Felipe Wunder Giovneli
 */
public class Cliente extends Usuario {
    protected String categoriaCNH;
    protected String numeroCNH;
    protected LocalDate validadeCNH;
    protected boolean clienteOuro;
    
    public Cliente(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public LocalDate getValidadeCNH() {
        return validadeCNH;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }
    
    public String getClienteOuro() {
        return clienteOuro ? "Sim" : "Não";
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public void setValidadeCNH(LocalDate validadeCNH) {
        this.validadeCNH = validadeCNH;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCategoria de CNH: " + categoriaCNH + "\nNúmero da CNH: " + numeroCNH + "\nValidade da CNH: " + validadeCNH + "\nCliente Ouro? " + getClienteOuro();
    }
    
}
