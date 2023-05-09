package youtube;


import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class regiterServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	out.println("<h2>Welcome to register servlet</h2>");
	
	String name = req.getParameter("user_name");
	String password = req.getParameter("user_password");
	String email = req.getParameter("user_email");
	String gender = req.getParameter("user_gender");
	String course = req.getParameter("user_course");
	String condxn = req.getParameter("condition");
	
	if(condxn !=null)
	{
		if(condxn.equals("checked"))
		{
			out.println("<h2> Name : " + name + "</h2>");
			out.println("<h2> Password : " + password + "</h2>");
			out.println("<h2> Email : " + email + "</h2>");
			out.println("<h2> Gender : " + gender + "</h2>");
			out.println("<h2> Course : " + course + "</h2>");
			
			//
			//jdbc
			//
			
			//saved to db
			//
			
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
			
			
			
		}
		else
		{
			out.println("<h2>You have not accepted terms and conditions.</h2>");
		}
	}
	else
	{
		out.println("<h2>You have not accepted terms and conditions.</h2>");
		
		// show form again if//Include output of index.html
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}
	
	
	}	
}
