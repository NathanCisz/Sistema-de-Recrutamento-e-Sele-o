<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.fmp.modelo.Selecao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Seleções</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Listar Seleções</h1>
        <table border="1">
            <tr>
                <th>Candidato</th>
                <th>Vaga</th>
                <th>Status</th>
                <th>Ação</th>
            </tr>
            <%
                ArrayList<Selecao> selecoes = (ArrayList<Selecao>) getServletContext().getAttribute("selecoes");
                if (selecoes != null && !selecoes.isEmpty()) {
                    for (Selecao selecao : selecoes) {
            %>
            <tr>
                <td><%= selecao.getCandidatoNome() %></td>
                <td><%= selecao.getVagaTitulo() %></td>
                <td><%= selecao.getStatus() %></td>
<td>
    <form action="SelecaoServlet" method="post" style="display:inline;">
        <input type="hidden" name="candidatoNome" value="<%= selecao.getCandidatoNome() %>">
        <input type="hidden" name="vagaTitulo" value="<%= selecao.getVagaTitulo() %>">
        <input type="hidden" name="action" value="delete"> <!-- Ação de exclusão -->
        <input type="submit" value="Excluir" style="color: red;">
    </form>
</td>


            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="4">Nenhuma seleção cadastrada.</td>
            </tr>
            <%
                }
            %>
        </table>
        <br>
        <a href="index.jsp">Voltar</a>
    </div>
</body>
</html>
