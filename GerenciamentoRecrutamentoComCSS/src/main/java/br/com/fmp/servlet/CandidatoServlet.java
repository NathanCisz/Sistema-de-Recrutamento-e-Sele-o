package br.com.fmp.servlet;

import br.com.fmp.modelo.Candidato;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/CandidatoServlet")
public class CandidatoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Candidato> candidatos = (ArrayList<Candidato>) getServletContext().getAttribute("candidatos");
        if (candidatos == null) {
            candidatos = new ArrayList<>();
        }
        request.setAttribute("candidatos", candidatos);
        request.getRequestDispatcher("listarCandidatos.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String curriculo = request.getParameter("curriculo");

        Candidato novoCandidato = new Candidato(nome, email, telefone, curriculo);

        // Armazenar na lista de candidatos
        ArrayList<Candidato> candidatos = (ArrayList<Candidato>) getServletContext().getAttribute("candidatos");
        if (candidatos == null) {
            candidatos = new ArrayList<>();
        }
        candidatos.add(novoCandidato);
        getServletContext().setAttribute("candidatos", candidatos);

        // Redirecionar para a página de listagem
        response.sendRedirect("cadastrarCandidato.jsp");
    }
}
