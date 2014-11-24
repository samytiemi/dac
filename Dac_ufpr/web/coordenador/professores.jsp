
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../favicon.ico">

    <title></title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Grade Horaria - TADS</a>
             </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="index.jsp">Grade Horária</a></li>
                <li><a href="professores.jsp">Professores</a></li>
                <li><a href="#">Sair</a></li>
            </ul>
        </div>    
        </div><!--/.navbar-collapse --> 
    </div>

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <div class="container">
            <br />
            <p>Lista de Professores</p>
            <br /><br />
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Buscar professor...">
                </div>
                    <button type="submit" class="btn btn-default">Buscar</button>
                </form>
            <br/>
            
            <div class="table-responsive">
                <table class="table">
                    <tr>
                        <td>
                            <p>Código</p>
                        </td>
                        <td>
                            <p>Nome</p>
                        </td>
                        <td>
                            <p>Disciplinas</p>
                        </td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>001</p>
                        </td>
                        <td>
                            <p>Rafaela Otemaier</p>
                        </td>
                        <td>
                            <p>Web II | DAC</p>
                        </td>
                        <td>
                            <a href="visualizarProfessor.jsp"><button type="button" class="btn btn-default btn-sm">
                                <span class="glyphicon glyphicon-search"></span> 
                                </button></a>
                            <button type="button" class="btn btn-default btn-sm">
                                <span class="glyphicon glyphicon-trash"></span> 
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>001</p>
                        </td>
                        <td>
                            <p>Rafaela Otemaier</p>
                        </td>
                        <td>
                            <p>Web II | DAC</p>
                        </td>
                        <td>
                            <a href="visualizarProfessor.jsp"><button type="button" class="btn btn-default btn-sm">
                                <span class="glyphicon glyphicon-search"></span> 
                                </button></a>
                            <button type="button" class="btn btn-default btn-sm">
                                <span class="glyphicon glyphicon-trash"></span> 
                            </button>
                        </td>
                    </tr>
                    
                </table>
            </div>
            
            
      </div>
          <br/> <br /> <br /> <br />
    </div>
    <div class="container">
        <footer align="center">
            <p>&copy; Tads 2014</p>
        </footer>
    </div>



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
