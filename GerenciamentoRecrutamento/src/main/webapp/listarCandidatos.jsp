<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.modelo.Candidato" %>
<%@ page import="com.controller.CandidatoServlet" %>
<html>
<head>
    <title>Listar Candidatos</title>
</head>
<body>
    <h1>Listar Candidatos</h1>
    <table border="1">
        <tr>
            <th>Nome</th>
            <th>Email</th>
            <th>Telefone</th>
            <th>Currículo</th>
            <th>Ações</th>
        </tr>
        <%
            List<Candidato> candidatos = CandidatoServlet.getCandidatos();
            for (int i = 0; i < candidatos.size(); i++) {
                Candidato candidato = candidatos.get(i);
        %>
            <tr>
                <td><%= candidato.getNome() %></td>
                <td><%= candidato.getEmail() %></td>
                <td><%= candidato.getTelefone() %></td>
                <td><%= candidato.getCurriculo() %></td>
                <td>
                    <a href="ExcluirCandidatoServlet?id=<%= i %>">Excluir</a>
                </td>
            </tr>
        <%
            }
        %>
    </table>
    <a href="index.jsp">Voltar</a>
</body>
</html>
