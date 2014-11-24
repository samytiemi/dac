package Servlet;

import DAO.PessoaDAO;
import Classes.Pessoa;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CadastroPessoa", urlPatterns = {"/CadastroPessoa"})
public class CadastroPessoa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, SQLException {
       
            Pessoa professor = new Pessoa(); 
          
            professor.setNome(request.getParameter("nome"));
            professor.setCpf(request.getParameter("cpf"));
            professor.setDatanasc(request.getParameter("datanasc"));
            professor.setDataadmissao(request.getParameter("dataadmissao"));
            professor.setCep(request.getParameter("cep"));
            professor.setEndereco(request.getParameter("endereco"));
            professor.setNumendereco(request.getParameter("numendereco"));
            professor.setLogin(request.getParameter("email"));
            professor.setSenha(request.getParameter("senha"));
           
            PessoaDAO pessoaDao = new PessoaDAO();
            pessoaDao.inserirPessoa(professor);
            
            request.setAttribute("mensagem","Cadastro efetuado com sucesso!");
            RequestDispatcher rd;
            rd = getServletContext().getRequestDispatcher("/sucesso.jsp");
            rd.forward(request,response);
            
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



