public class Usuario extends Pessoa {
    private String username;
    private String senha;
    private String nivelAcesso;

    public Usuario(String nome, String cpfOuCnpj, String endereco, String telefone, String email,
                   String username, String senha, String nivelAcesso) {
        super(nome, cpfOuCnpj, endereco, telefone, email);
        this.username = username;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Usuário [" + super.toString() +
               ", Username: " + username +
               ", Nível de Acesso: " + nivelAcesso + "]";
    }
}
