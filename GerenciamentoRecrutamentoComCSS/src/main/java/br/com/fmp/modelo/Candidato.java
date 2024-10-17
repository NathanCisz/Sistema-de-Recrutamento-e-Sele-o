package br.com.fmp.modelo;

public class Candidato {
    private String nome;
    private String email;
    private String telefone;
    private String curriculo;

    public Candidato(String nome, String email, String telefone, String curriculo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.curriculo = curriculo;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getCurriculo() { return curriculo; }
    public void setCurriculo(String curriculo) { this.curriculo = curriculo; }
}
