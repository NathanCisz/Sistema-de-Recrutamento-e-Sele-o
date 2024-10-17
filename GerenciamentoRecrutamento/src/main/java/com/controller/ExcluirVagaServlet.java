package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ExcluirVagaServlet")
public class ExcluirVagaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obter o ID da vaga a ser excluída
        int id = Integer.parseInt(request.getParameter("id"));

        // Remover a vaga da lista
        VagaServlet.getVagas().remove(id);

        // Redirecionar para a página de listagem
        response.sendRedirect("listarVagas.jsp");
    }
}
