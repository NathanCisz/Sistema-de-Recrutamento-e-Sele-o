package com.controller;

import com.modelo.Vaga;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/VagaServlet")
public class VagaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Lista estática para armazenar vagas temporariamente
    private static List<Vaga> vagas = new ArrayList<>();

    // Método que retorna a lista de vagas
    public static List<Vaga> getVagas() {
        return vagas;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtendo os parâmetros do formulário
        String titulo = request.getParameter("titulo");
        String descricao = request.getParameter("descricao");
        String requisitos = request.getParameter("requisitos");
        String status = request.getParameter("status");

        // Criando uma nova vaga com os dados recebidos
        Vaga vaga = new Vaga(titulo, descricao, requisitos, status);

        // Adicionando a vaga à lista
        vagas.add(vaga);

        // Redirecionando de volta para a listagem de vagas
        response.sendRedirect("listarVagas.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Reencaminha para a página de listagem de vagas
        request.getRequestDispatcher("listarVagas.jsp").forward(request, response);
    }
}
