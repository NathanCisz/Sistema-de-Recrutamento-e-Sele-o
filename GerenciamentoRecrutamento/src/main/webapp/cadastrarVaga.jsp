<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastrar Vaga</title>
</head>
<body>
    <h1>Cadastrar Vaga</h1>
    <form action="VagaServlet" method="post">
        <label for="titulo">Título:</label>
        <input type="text" name="titulo" required><br>
        <label for="descricao">Descrição:</label>
        <textarea name="descricao" required></textarea><br>
        <label for="requisitos">Requisitos:</label>
        <textarea name="requisitos" required></textarea><br>
        <label for="status">Status:</label>
        <select name="status" required>
            <option value="Aberta">Aberta</option>
            <option value="Fechada">Fechada</option>
        </select><br>
        <input type="submit" value="Cadastrar">
    </form>
    <a href="index.jsp">Voltar</a>
</body>
</html>
