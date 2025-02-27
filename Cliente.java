public class Cliente {
    private String nome;
    private String sobrenome;
    private String senha;
    private String email;

    // Construtor
    public Cliente(String nome, String sobrenome, String senha, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}