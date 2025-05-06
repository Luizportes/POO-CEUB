import java.util.List;

public class Fornecedor extends Pessoa {
    private String razaoSocial;
    private List<String> produtos;

    public Fornecedor(String nome, String cpfOuCnpj, String endereco, String telefone, String email,
                      String razaoSocial, List<String> produtos) {
        super(nome, cpfOuCnpj, endereco, telefone, email);
        this.razaoSocial = razaoSocial;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecedor [" + super.toString() +
               ", Razão Social: " + razaoSocial +
               ", Produtos: " + produtos + "]";
    }
}
