package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("name");
			String password=request.getParameter("pass");
			String correctpassword=null;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb1","root","1234");
			//out.println("Connection Established successfully");
			//Statement st=con.createStatement();
			//st.executeQuery("select password from table1 where name='"+name+"'");
			PreparedStatement pr=con.prepareStatement("Select password from table2 where name='"+name+"'");
			ResultSet rs=pr.executeQuery();
			if(rs.next()){
				 correctpassword = rs.getString(1);
			}
			if(correctpassword.equals(password)){
				RequestDispatcher rd=request.getRequestDispatcher("question1.html");
				rd.forward(request,response);	
				
			}
			else{
				out.println("<h1 style='color:red; text-align:center'>password is incorrect</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
				
			}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}


