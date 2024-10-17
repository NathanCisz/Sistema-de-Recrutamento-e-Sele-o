package com.modelo;

public class Vaga {
    private String titulo;
    private String descricao;
    private String requisitos;
    private String status;

    public Vaga(String titulo, String descricao, String requisitos, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
