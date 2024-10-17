<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastrar Candidato</title>
</head>
<body>
    <h1>Cadastrar Candidato</h1>
    <form action="CandidatoServlet" method="post">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" required><br>
        <label for="email">E-mail:</label>
        <input type="email" name="email" required><br>
        <label for="telefone">Telefone:</label>
        <input type="text" name="telefone" required><br>
        <label for="curriculo">Currículo:</label>
        <textarea name="curriculo" required></textarea><br>
        <input type="submit" value="Cadastrar">
    </form>
    <a href="index.jsp">Voltar</a>
</body>
</html>
