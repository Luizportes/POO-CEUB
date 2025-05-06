public class Pessoa {
    protected String nome;
    protected String cpfOuCnpj;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String cpfOuCnpj, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpfOuCnpj = cpfOuCnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF/CNPJ: " + cpfOuCnpj;
    }
}