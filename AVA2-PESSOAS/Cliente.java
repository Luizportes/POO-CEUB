public class Cliente extends Pessoa {
    private int codCliente;
    private String dataCadastro;
    private String historicoCompras;

    public Cliente(String nome, String cpfOuCnpj, String endereco, String telefone, String email,
                   int codCliente, String dataCadastro, String historicoCompras) {
        super(nome, cpfOuCnpj, endereco, telefone, email);
        this.codCliente = codCliente;
        this.dataCadastro = dataCadastro;
        this.historicoCompras = historicoCompras;
    }

    @Override
    public String toString() {
        return "Cliente [" + super.toString() + 
               ", Código: " + codCliente + 
               ", Data: " + dataCadastro + 
               ", Histórico: " + historicoCompras + "]";
    }
}
