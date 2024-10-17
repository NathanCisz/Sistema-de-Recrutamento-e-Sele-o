package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ExcluirCandidatoServlet")
public class ExcluirCandidatoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obter o ID do candidato a ser excluído
        int id = Integer.parseInt(request.getParameter("id"));

        // Remover o candidato da lista
        CandidatoServlet.getCandidatos().remove(id);

        // Redirecionar para a página de listagem
        response.sendRedirect("listarCandidatos.jsp");
    }
}
