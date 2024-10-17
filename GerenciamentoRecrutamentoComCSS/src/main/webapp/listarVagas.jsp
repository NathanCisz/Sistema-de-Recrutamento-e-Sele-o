<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.fmp.modelo.Vaga" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Vagas</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Listar Vagas</h1>
        <table>
            <tr>
                <th>Título</th>
                <th>Descrição</th>
                <th>Requisitos</th>
                <th>Status</th>
                <th>Ação</th>
            </tr>
            <%
                ArrayList<Vaga> vagas = (ArrayList<Vaga>) application.getAttribute("vagas");
                if (vagas != null && !vagas.isEmpty()) {
                    for (Vaga vaga : vagas) {
            %>
            <tr>
                <td><%= vaga.getTitulo() %></td>
                <td><%= vaga.getDescricao() %></td>
                <td><%= vaga.getRequisitos() %></td>
                <td><%= vaga.getStatus() %></td>
                <td>
                    <form action="VagaServlet" method="post" style="display:inline;">
                        <input type="hidden" name="titulo" value="<%= vaga.getTitulo() %>">
                        <input type="submit" value="Excluir" style="color: red;">
                    </form>
                </td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="5">Nenhuma vaga cadastrada.</td>
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
