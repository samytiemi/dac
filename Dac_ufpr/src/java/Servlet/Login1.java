
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


   @WebServlet(name="Login1", urlPatterns="/Login1")

public class Login1 extends HttpServlet {
    java.sql.Connection cnx;
    
    //@Override

    protected void ProcessRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String  user = request.getParameter("login");
        String  pwd = request.getParameter("senha");
    //    out.println("recebendo dados de conexão.... Usuario: " + user + " Senha " + pwd );
        try {
            
            Class.forName("org.postgresql.Driver");
            
            
        } catch (ClassNotFoundException ex) {

        }

            try {
            
              
           //     System.out.println("Abrindo conexão com o MySQL...");
            
                cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DAC", "postgres", "padraoum");
                 
                Statement buscar = null;
                  ResultSet rs;
                  String sqlVerifica = "select login,senha from pessoa where login=" + user + "'";
                  buscar = cnx.createStatement();
                  rs  = buscar.executeQuery(sqlVerifica);
                  java.sql.ResultSetMetaData dados = rs.getMetaData();
                  rs.next();
               //   out.print("senha digitada é " + pwd);
                //  out.print(" Senha correta é " + rs.getObject(2));
                  String senhacerta = "" +  rs.getObject(2) + "";

                  if (pwd.equals(senhacerta))  request.getRequestDispatcher("/professor/index.jsp").forward(request, response);
                  else request.getRequestDispatcher("/index.jsp").forward(request, response);

                  


                //String sqlVerifica = "select nome,senha from login.usuarios where nome='" + user + "'";
                java.sql.PreparedStatement VerLogin = cnx.prepareStatement(sqlVerifica);
                ResultSetMetaData teste = VerLogin.getMetaData();

            } catch (SQLException ex1) {
                Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex1);
            }
        
            

               

       



    } 

    
}
