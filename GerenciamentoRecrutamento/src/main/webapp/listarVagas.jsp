<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.modelo.Vaga" %>
<%@ page import="com.controller.VagaServlet" %>
<html>
<head>
    <title>Listar Vagas</title>
</head>
<body>
    <h1>Listar Vagas</h1>
    <table border="1">
        <tr>
            <th>Título</th>
            <th>Descrição</th>
            <th>Requisitos</th>
            <th>Status</th>
            <th>Ações</th>
        </tr>
        <%
            List<Vaga> vagas = VagaServlet.getVagas();
            for (int i = 0; i < vagas.size(); i++) {
                Vaga vaga = vagas.get(i);
        %>
            <tr>
                <td><%= vaga.getTitulo() %></td>
                <td><%= vaga.getDescricao() %></td>
                <td><%= vaga.getRequisitos() %></td>
                <td><%= vaga.getStatus() %></td>
                <td>
                    <a href="ExcluirVagaServlet?id=<%= i %>">Excluir</a>
                </td>
            </tr>
        <%
            }
        %>
    </table>
    <a href="index.jsp">Voltar</a>
</body>
</html>
