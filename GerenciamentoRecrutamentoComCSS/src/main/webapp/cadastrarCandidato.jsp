<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Candidato</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Cadastrar Candidato</h1>
        <form action="CandidatoServlet" method="post">
            Nome: <input type="text" name="nome" required><br>
            E-mail: <input type="email" name="email" required><br>
            Telefone: <input type="text" name="telefone" required><br>
            Currículo: <input type="text" name="curriculo" required><br>
            <input type="submit" value="Cadastrar">
        </form>
        <a href="index.jsp">Voltar</a>
    </div>
</body>
</html>
