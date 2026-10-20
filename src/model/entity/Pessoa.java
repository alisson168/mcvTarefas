package model.entity;

public class Pessoa {



    private int id;
    private String nome;
    private String email;
    private String senha;

    public Pessoa(String email, String nome, int id, String senha) {
        this.email = email;
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    public Pessoa() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail(String readln) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha(String readln) {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
