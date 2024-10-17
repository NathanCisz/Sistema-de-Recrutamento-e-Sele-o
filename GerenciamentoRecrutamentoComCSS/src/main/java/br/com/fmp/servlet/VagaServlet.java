package br.com.fmp.servlet;

import br.com.fmp.modelo.Vaga;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/VagaServlet")
public class VagaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Vaga> vagas = (ArrayList<Vaga>) getServletContext().getAttribute("vagas");
        if (vagas == null) {
            vagas = new ArrayList<>();
        }
        request.setAttribute("vagas", vagas);
        request.getRequestDispatcher("listarVagas.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String descricao = request.getParameter("descricao");
        String requisitos = request.getParameter("requisitos");
        String status = request.getParameter("status");

        Vaga novaVaga = new Vaga(titulo, descricao, requisitos, status);

        // Armazenar na lista de vagas
        ArrayList<Vaga> vagas = (ArrayList<Vaga>) getServletContext().getAttribute("vagas");
        if (vagas == null) {
            vagas = new ArrayList<>();
        }
        vagas.add(novaVaga);
        getServletContext().setAttribute("vagas", vagas);

        // Redirecionar para a página de listagem
        response.sendRedirect("cadastrarVaga.jsp");
    }
}
