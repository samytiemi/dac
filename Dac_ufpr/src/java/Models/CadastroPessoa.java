package Models;


import Classes.Pessoa;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CadastroPessoa", urlPatterns = {"/CadastroPessoa"})
public class CadastroPessoa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
       
            Pessoa professor = new Pessoa();
            
            professor.setNome(request.getParameter("nome"));
            String data =request.getParameter("datanasc");  
            SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
            Date dtnasc= sdf.parse(data);
            professor.setDatanasc(dtnasc);
            professor.setCpf("cpf");
            data =request.getParameter("dataadmissao");  
            Date dtadmissao= sdf.parse(data);
            professor.setDataadmissao(dtadmissao);
            professor.setCep("cep");
            professor.setEndereco("endereco");
            professor.setNumendereco(Integer.parseInt("numendereco"));
            professor.setLogin("email");
            professor.setSenha("senha"); 
            professor.setCoordenador(false);
    }
}

