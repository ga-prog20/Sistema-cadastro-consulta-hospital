<%-- 
    Documento   : minha_conta
    Created on : Mar 15, 2019, 11:24:03 PM
    Autor     : jeferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css">
        <title>Minha conta</title>
    </head>
    <body>
        <header>
            <nav>
                <h1>Area de login</h1>
                <ul>
                    <li>
                        <a href="index.html"> Inicio </a>                        
                    </li>                    
                    <li>
                        <a href='login.html'> Deslogar </a>
                    </li>
                </ul>
            </nav>
        </header>
        <main>
            <section>
                <h2>nome: ${param.nome}</h2>
                <h2>senha: ${param.senha}</h2>
            </section>
        </main>
        <footer>
            <p>JEFERSON FERREIRA</p>
            <p>
                <a href="https://github.com/jeferson0993"> GIT HUB </a>
            </p>
            <p>
                <a href="https://www.linkedin.com/in/jeferson-ferreira-4a036b143"> LINKEDIN </a>
            </p>
            <p>
                <a href="https://codepen.io/jeferson0993"> CODEPEN </a>
            </p>
            <p>Java Web app MVC &copy; 2019</p>
        </footer>
    </body>
</html>
