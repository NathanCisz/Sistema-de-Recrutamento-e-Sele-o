<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.fmp.modelo.Candidato" %>
<%@ page import="br.com.fmp.modelo.Vaga" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Realizar Seleção</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Realizar Seleção</h1>
        <form action="SelecaoServlet" method="post">
            Nome do Candidato: 
            <select name="candidatoNome" required>
                <option value="">Selecione um Candidato</option>
                <%
                    ArrayList<Candidato> candidatos = (ArrayList<Candidato>) application.getAttribute("candidatos");
                    if (candidatos != null) {
                        for (Candidato candidato : candidatos) {
                %>
                <option value="<%= candidato.getNome() %>"><%= candidato.getNome() %></option>
                <%
                        }
                    }
                %>
            </select><br>

            Título da Vaga: 
            <select name="vagaTitulo" required>
                <option value="">Selecione uma Vaga</option>
                <%
                    ArrayList<Vaga> vagas = (ArrayList<Vaga>) application.getAttribute("vagas");
                    if (vagas != null) {
                        for (Vaga vaga : vagas) {
                %>
                <option value="<%= vaga.getTitulo() %>"><%= vaga.getTitulo() %></option>
                <%
                        }
                    }
                %>
            </select><br>

            Status:
            <select name="status" required>
                <option value="Aprovado">Aprovado</option>
                <option value="Reprovado">Reprovado</option>
            </select><br>
            <input type="submit" value="Selecionar">
        </form>
        <a href="index.jsp">Voltar</a>
    </div>
</body>
</html>
