<%-- 
    Document   : CadAluno
    Created on : 22/10/2020, 11:10:07
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--RESPONSÁVEL POR DEIXAR A PÁGINA RESPONSIVA-->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container col-lg-6 border border-dark">
            <div class="jumbotron jumbotron-fluid">
                <div class="container">
                    <h1 class="display-4">Cadastro de Aluno</h1>
                    <p class="lead">Página responsável pelo cadastro de alunos. Siga as instruções.</p>
                </div>
            </div>
            <form>
                <div class="row pt-1 pb-5">
                    <div class="col pt-1">
                        <div class="row pt-1">
                            <div class="col-3 pt-1">
                                <input type="text" class="form-control" placeholder="ID">
                            </div>
                            <div class="col-5 pt-1">
                                <input type="text" class="form-control" placeholder="RG">
                            </div>
                        </div>
                        <div class="col-15 pt-1">
                            <input type="text" class="form-control" placeholder="Nome">
                        </div>
                        <div class="col-15 pt-1">
                            <input type="text" class="form-control" placeholder="Endereço">
                        </div>
                        <div class="col-8 pt-1">
                            <input type="text" class="form-control" placeholder="Telefone">
                        </div>
                    </div>
                    <div class="col pt-1 pl-5">
                        <img src="imagens/AlunoSemfoto.png" class="img-fluid border border-dark" alt="Imagem responsiva" width="200" height="200">
                    </div>
                </div>
                <div>
                    <button type="button" class="btn btn-primary">Salvar</button>
                    <button type="button" class="btn btn-secondary">Cancelar</button>

                </div>
            </form>
        </div>

        <script src="js/jquery-3.5.1.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
