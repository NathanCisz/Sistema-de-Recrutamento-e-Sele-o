package br.com.fmp.modelo;

public class Selecao {
    private String candidatoNome;
    private String vagaTitulo;
    private String status;

    public Selecao(String candidatoNome, String vagaTitulo, String status) {
        this.candidatoNome = candidatoNome;
        this.vagaTitulo = vagaTitulo;
        this.status = status;
    }

    public String getCandidatoNome() {
        return candidatoNome;
    }

    public String getVagaTitulo() {
        return vagaTitulo;
    }

    public String getStatus() {
        return status;
    }
}
