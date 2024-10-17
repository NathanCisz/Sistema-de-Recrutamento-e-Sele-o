<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Vaga</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Cadastrar Vaga</h1>
        <form action="VagaServlet" method="post">
            Título: <input type="text" name="titulo" required><br>
            Descrição: <input type="text" name="descricao" required><br>
            Requisitos: <input type="text" name="requisitos" required><br>
            Status:
            <select name="status" required>
                <option value="Aberta">Aperta</option>
                <option value="Fechada">Fechada</option>
            </select><br>
            <input type="submit" value="Cadastrar">
        </form>
        <a href="index.jsp">Voltar</a>
    </div>
</body>
</html>
