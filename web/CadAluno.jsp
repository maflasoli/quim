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

        <title>Cadastro de aluno</title>
        <link rel="shortcut icon" href="imagens/Icone.png">

    </head>
    <body>

        <div class="container col-lg-6 border border-dark">
            <div class="jumbotron jumbotron-fluid">
                <div class="container">
                    <h1 class="display-4">Cadastro de Aluno</h1>
                    <p class="lead">Página responsável pelo cadastro de alunos. Siga as instruções.</p>
                </div>
            </div>
            <form action="CadAluno">
                <div class="row pt-1 pb-5">
                    <div class="col pt-1">
                        <div class="row pt-1">
                            <div class="col-3 pt-1">
                                <input type="text" name="txtIdAluno" class="form-control" placeholder="ID">
                            </div>
                            <div class="col-5 pt-1">
                                <input type="text" name="txtRgAluno" class="form-control" placeholder="RG">
                            </div>
                        </div>
                        <div class="col-15 pt-1">
                            <input type="text" name="txtNomAluno" class="form-control" placeholder="Nome">
                        </div>
                        <div class="col-15 pt-1">
                            <input type="text" name="txtEndAluno" class="form-control" placeholder="Endereço">
                        </div>
                        <div class="col-8 pt-1">
                            <input type="text" name="txtTelAluno" class="form-control" placeholder="Telefone">
                        </div>
                    </div>

                    <!--***Lembrar de como será tratada a imagem***-->

                    <div class="col pt-1 pl-5">
                        <img src="imagens/AlunoSemfoto.png" class="img-fluid border border-dark" alt="Imagem responsiva" width="200" height="200">
                    </div>
                </div>
                <div class="pb-2">
                    <button type="submit" class="btn btn-primary">Salvar</button>

                    //TODO verificar se realmente foi feito o cadastro e mostrar mensagem 
<!--                    <div class="alert alert-warning alert-dismissible fade show" role="alert">
                        <strong>Oloco, meu!</strong> Olha esse alerta animado, como é chique!
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>-->

                    <button type="button" class="btn btn-secondary">Cancelar</button>
                    <p><a href="listaAluno">Listar</a></p>

                </div>
            </form>
        </div>

        <script src="js/jquery-3.5.1.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
