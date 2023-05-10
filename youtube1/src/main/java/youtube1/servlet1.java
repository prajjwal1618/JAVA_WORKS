package youtube1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	String name = req.getParameter("name");
	
	out.println("<h1>Hello " + name +  " Welcome to My website</h1>");
	out.println("<h1><a href=" + "servlet2" + ">Go to servlet 2</a></h1>");
	
	// Create a cookie :
	
	Cookie c = new Cookie("user_name",name);
	res.addCookie(c);

	}
}