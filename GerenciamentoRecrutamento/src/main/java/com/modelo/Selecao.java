package com.modelo;

public class Selecao {
    private Candidato candidato;
    private Vaga vaga;
    private String status;

    public Selecao(Candidato candidato, Vaga vaga, String status) {
        this.candidato = candidato;
        this.vaga = vaga;
        this.status = status;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
