package com.controller;

import com.modelo.Candidato;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CandidatoServlet")
public class CandidatoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Lista estática para armazenar os candidatos temporariamente
    private static List<Candidato> candidatos = new ArrayList<>();

    // Método que retorna a lista de candidatos
    public static List<Candidato> getCandidatos() {
        return candidatos;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtendo os parâmetros do formulário
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String curriculo = request.getParameter("curriculo");

        // Criando um novo candidato com os dados recebidos
        Candidato candidato = new Candidato(nome, email, telefone, curriculo);

        // Adicionando o candidato à lista
        candidatos.add(candidato);

        // Redirecionando de volta para a lista de candidatos
        response.sendRedirect("listarCandidatos.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Reencaminha para a página de listagem de candidatos
        request.getRequestDispatcher("listarCandidatos.jsp").forward(request, response);
    }
}
