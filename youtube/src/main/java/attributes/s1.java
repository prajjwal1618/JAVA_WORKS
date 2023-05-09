package attributes;

//import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1+num2;
		
		// Set attributes : 
		request.setAttribute("addition", sum);
		
		// forward request using request dispatcher...
		
		RequestDispatcher rd = request.getRequestDispatcher("s2");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
