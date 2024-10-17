<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.modelo.Candidato" %>
<%@ page import="com.modelo.Vaga" %>
<%@ page import="com.controller.CandidatoServlet" %>
<%@ page import="com.controller.VagaServlet" %>

<html>
<head>
    <title>Realizar Seleção</title>
</head>
<body>
    <h1>Realizar Seleção</h1>
    <form action="SelecaoServlet" method="post">
        <label for="idCandidato">Selecione o Candidato:</label>
        <select name="idCandidato">
            <%
                List<Candidato> candidatos = CandidatoServlet.getCandidatos();
                for (int i = 0; i < candidatos.size(); i++) {
                    Candidato candidato = candidatos.get(i);
            %>
                <option value="<%= i %>"><%= candidato.getNome() %></option>
            <%
                }
            %>
        </select><br>

        <label for="idVaga">Selecione a Vaga:</label>
        <select name="idVaga">
            <%
                List<Vaga> vagas = VagaServlet.getVagas();
                for (int i = 0; i < vagas.size(); i++) {
                    Vaga vaga = vagas.get(i);
            %>
                <option value="<%= i %>"><%= vaga.getTitulo() %></option>
            <%
                }
            %>
        </select><br>

        <label for="status">Status da Seleção:</label>
        <select name="status">
            <option value="Aprovado">Aprovado</option>
            <option value="Reprovado">Reprovado</option>
        </select><br>

        <input type="submit" value="Realizar Seleção">
    </form>
    <a href="index.jsp">Voltar</a>
</body>
</html>
