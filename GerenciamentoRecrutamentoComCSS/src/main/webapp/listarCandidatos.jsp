<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.fmp.modelo.Candidato" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Candidatos</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Listar Candidatos</h1>
        <table>
            <tr>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Telefone</th>
                <th>Currículo</th>
            </tr>
            <%
                ArrayList<Candidato> candidatos = (ArrayList<Candidato>) application.getAttribute("candidatos");
                if (candidatos != null && !candidatos.isEmpty()) {
                    for (Candidato candidato : candidatos) {
            %>
            <tr>
                <td><%= candidato.getNome() %></td>
                <td><%= candidato.getEmail() %></td>
                <td><%= candidato.getTelefone() %></td>
                <td><%= candidato.getCurriculo() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="4">Nenhum candidato cadastrado.</td>
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
