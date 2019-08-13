package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validate
 */
@WebServlet("/validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//int mark=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
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
		//int option1=Integer.parseInt(request.getParameter("a"));
		String Q1=request.getParameter("Q1");
		String Q2=request.getParameter("Q2");
		String Q3=request.getParameter("Q3");
		String Q4=request.getParameter("Q4");
		String Q5=request.getParameter("Q5");
		String Q6=request.getParameter("Q6");
		String Q7=request.getParameter("Q7");
		String Q8=request.getParameter("Q8");
		String Q9=request.getParameter("Q9");
		String Q10=request.getParameter("Q10");
		int mark=0;
		if("Computer Science Engineering".equals(Q1)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("sundar pichai".equals(Q2)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("Android P".equals(Q3)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("gandhi".equals(Q4)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("Object Oriented".equals(Q5)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("Hyper Text Markup Language".equals(Q6)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("linus torvalls".equals(Q7)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("i phone".equals(Q8)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("centrifugal force".equals(Q9)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		if("util".equals(Q10)){
			mark=mark+1;
		}
		else{
			mark=mark;
		}
		out.println("<h1>you scored:</h1>"+mark+"<h1>out of 10</h1>");
		if(mark>8){
			out.println("<h1 style='color:red'>Congratulations</h1>");
		}
		
		}catch(Exception e){
			
		}
			
	}

}
