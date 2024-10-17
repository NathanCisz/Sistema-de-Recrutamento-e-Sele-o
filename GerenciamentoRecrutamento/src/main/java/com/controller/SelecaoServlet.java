package com.controller;

import com.modelo.Candidato;
import com.modelo.Vaga;
import com.modelo.Selecao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/SelecaoServlet")
public class SelecaoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Lista para armazenar as seleções temporariamente
    private static List<Selecao> selecoes = new ArrayList<>();

    public static List<Selecao> getSelecoes() {
        return selecoes;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtendo os parâmetros do formulário
        int idCandidato = Integer.parseInt(request.getParameter("idCandidato"));
        int idVaga = Integer.parseInt(request.getParameter("idVaga"));
        String status = request.getParameter("status");

        // Buscando o candidato e a vaga correspondentes
        Candidato candidato = CandidatoServlet.getCandidatos().get(idCandidato);
        Vaga vaga = VagaServlet.getVagas().get(idVaga);

        // Criando uma nova seleção com os dados recebidos
        Selecao selecao = new Selecao(candidato, vaga, status);

        // Adicionando a seleção à lista
        selecoes.add(selecao);

        // Redirecionando para a página de listagem de seleções
        response.sendRedirect("listarSelecoes.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Reencaminha para a página de listagem de seleções
        request.getRequestDispatcher("listarSelecoes.jsp").forward(request, response);
    }
}
