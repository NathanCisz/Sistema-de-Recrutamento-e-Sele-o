package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ExcluirSelecaoServlet")
public class ExcluirSelecaoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obter o ID da seleção a ser excluída
        int id = Integer.parseInt(request.getParameter("id"));

        // Remover a seleção da lista
        SelecaoServlet.getSelecoes().remove(id);

        // Redirecionar para a página de listagem
        response.sendRedirect("listarSelecoes.jsp");
    }
}
