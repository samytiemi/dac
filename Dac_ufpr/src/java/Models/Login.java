
package Models;

import DAO.ConnectionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;
    
    public Login(){
        
    }
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	String userName=request.getParameter("login");
	String userPass=request.getParameter("senha");
	//String userRePass=request.getParameter("userRePassWord");
	
	try {
		String queryString = "SELECT nome FROM pessoa WHERE login=?";
		connection = ConnectionFactory.getInstance().getConnection();
		ptmt = connection.prepareStatement(queryString);
		ptmt.setString(1,userPass);
		resultSet = ptmt.executeQuery();
		//Creating Servlet Context object
		if(resultSet.next() && userName.equalsIgnoreCase(resultSet.getString("nome"))){
			HttpSession session=request.getSession(true);
			session.setAttribute("nome", resultSet.getString(1));
			
			ServletContext context=getServletContext();	
			RequestDispatcher dispatcher=context.getRequestDispatcher("/professor/index");
			dispatcher.forward(request, response);
			//or you can write whole thing in one line as ........
			
			//getServletContext().getRequestDispatcher("/success").forward(request, response);
			
		}
                else{
			request.setAttribute("wrongUser",userName);
			
			ServletContext context=getServletContext();	
			RequestDispatcher dispatcher=context.getRequestDispatcher("/fail");
			dispatcher.forward(request, response);
			
			//or you can write whole thing in one line as ........
			//getServletContext().getRequestDispatcher("/fail").forward(request, response);
		}
		
            } 
            catch (SQLException e) {
		e.printStackTrace();
            } 
            catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
    }
