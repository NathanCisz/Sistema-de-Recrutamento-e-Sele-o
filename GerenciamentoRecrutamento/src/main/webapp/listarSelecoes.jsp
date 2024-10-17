<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.modelo.Selecao" %>
<%@ page import="com.controller.SelecaoServlet" %>
<html>
<head>
    <title>Listar Seleções</title>
</head>
<body>
    <h1>Listar Seleções</h1>
    <table border="1">
        <tr>
            <th>Candidato</th>
            <th>Vaga</th>
            <th>Status</th>
            <th>Ações</th>
        </tr>
        <%
            List<Selecao> selecoes = SelecaoServlet.getSelecoes();
            for (int i = 0; i < selecoes.size(); i++) {
                Selecao selecao = selecoes.get(i);
        %>
            <tr>
                <td><%= selecao.getCandidato().getNome() %></td>
                <td><%= selecao.getVaga().getTitulo() %></td>
                <td><%= selecao.getStatus() %></td>
                <td>
                    <a href="ExcluirSelecaoServlet?id=<%= i %>">Excluir</a>
                </td>
            </tr>
        <%
            }
        %>
    </table>
    <a href="index.jsp">Voltar</a>
</body>
</html>
