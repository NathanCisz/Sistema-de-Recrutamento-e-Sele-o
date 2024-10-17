package br.com.fmp.servlet;

import br.com.fmp.modelo.Selecao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;

@WebServlet("/SelecaoServlet")
public class SelecaoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Selecao> selecoes = (ArrayList<Selecao>) getServletContext().getAttribute("selecoes");
        if (selecoes == null) {
            selecoes = new ArrayList<>();
        }
        request.setAttribute("selecoes", selecoes);
        request.getRequestDispatcher("listarSelecoes.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Definir a codificação para UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Verifica se o pedido é para excluir
        String action = request.getParameter("action");
        if ("delete".equals(action)) {
            String candidatoNome = removeAcentos(request.getParameter("candidatoNome"));
            String vagaTitulo = removeAcentos(request.getParameter("vagaTitulo"));

            // Recuperar a lista de seleções
            ArrayList<Selecao> selecoes = (ArrayList<Selecao>) getServletContext().getAttribute("selecoes");
            if (selecoes != null) {
                // Remove a seleção correspondente
                selecoes.removeIf(selecao -> 
                    removeAcentos(selecao.getCandidatoNome()).equals(candidatoNome) && 
                    removeAcentos(selecao.getVagaTitulo()).equals(vagaTitulo)
                );
                // Atualiza a lista no contexto do servlet
                getServletContext().setAttribute("selecoes", selecoes);
            }
        } else {
            // Caso contrário, trata como uma nova seleção
            String candidatoNome = removeAcentos(request.getParameter("candidatoNome"));
            String vagaTitulo = removeAcentos(request.getParameter("vagaTitulo"));
            String status = request.getParameter("status");

            // Criação de uma nova seleção
            Selecao novaSelecao = new Selecao(candidatoNome, vagaTitulo, status);

            // Armazenar na lista de seleções
            ArrayList<Selecao> selecoes = (ArrayList<Selecao>) getServletContext().getAttribute("selecoes");
            if (selecoes == null) {
                selecoes = new ArrayList<>();
            }
            selecoes.add(novaSelecao);
            getServletContext().setAttribute("selecoes", selecoes);
        }

        // Redirecionar de volta para a lista de seleções
        response.sendRedirect("listarSelecoes.jsp");
    }

    // Método para remover acentos
    private String removeAcentos(String input) {
        if (input == null) return null;
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .replaceAll("[^\\p{ASCII}]", "");
    }
}
