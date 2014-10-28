
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title></title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="jumbotron.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="assets/js/ie-emulation-modes-warning.js"></script>

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
            <form class="navbar-form navbar-right" role="form" action="coordenador/index.jsp">
              <div class="form-group">
                <input type="text" placeholder="Email" class="form-control">
              </div>
              <div class="form-group">
                <input type="password" placeholder="Senha" class="form-control">
              </div>
             <button type="submit" class="btn btn-primary">Entrar</button>
            </form>
          </div><!--/.navbar-collapse -->
        </div>
      </div>

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <div class="container">
          <h1>Bem vindo! Novo na universidade?</h1>
          <p>Cadastre-se<br />
          Preencha o formul�rio abaixo:</p>
          
          <form role="form" class="row" action="ProcessaCadastro" method="POST">
            <div class="col-md-6">
            <div class="form-group">
              <label for="nome">Nome</label>
              <input type="email" class="form-control" id="nome">
            </div>
            <div class="form-group">
                <label for="data_nasc">Data de nascimento</label>
              <input type="date" class="form-control" id="data_nasc">
            </div>
            <div class="form-group">
                <label for="cpf">CPF</label>
              <input type="text" class="form-control" id="cpf">
            </div>
            <div class="form-group">
               <label for="data_admissao">Data de admiss�o</label>
               <input type="date" class="form-control" id="data_admissao">
            </div>
            <div class="form-group">
                <label for="cep">CEP</label>
              <input type="text" class="form-control" id="cep">
            </div>
              <div class="form-group">
                <label for="endereco">Endere�o</label>
              <input type="text" class="form-control" id="endereco">
            </div>
                <div class="form-group">
                <label for="num_endereco">N�mero</label>
              <input type="text" class="form-control" id="num_endereco">
            </div>
              
            <div class="form-group">
                <label for="email">E-mail</label>
                <input type="email" class="form-control" id="email">
            </div>
            <div class="form-group">
              <label for="senha">Senha</label>
              <input type="password" class="form-control" id="senha">
            </div>
            <button type="submit" class="btn btn-default">Cadastrar</button>
            </div>
          </form>  
      </div>
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