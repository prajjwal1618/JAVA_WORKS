package youtube1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	// getting all cookies from servlet 1 
	Cookie  [] ck = req.getCookies();
	boolean f = false;
	String names = "name";
	
	if(ck == null)
	{
		System.out.println("<h1> Welcome new user ... please go to home and register yourself.");
		return;
	}
	else
	{
		for(Cookie c : ck)
		{
			String tname = c.getName();
			if(tname.equals("user_name"))
			{
				f = true;
				names = c.getValue();
			}
		}
	}
	
	if(f)
	{
		out.println("<h1>Hello " + names +  " Welcome back to My website</h1>");
		out.println("<h1>thanks man<h1>");
	}
	else
	{
		System.out.println("<h1> Welcome new user ... please go to home and register yourself.");
	}
	
	}
}
