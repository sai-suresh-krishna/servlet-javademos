package Validationofuserlogin;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		if (username.equalsIgnoreCase("Sai suresh krishna") && password.equals("13062001")) {
			rd = request.getRequestDispatcher("Validationofuserlogin");
			rd.forward(request, response);
		} else {
			rd=request.getRequestDispatcher("login.html");
			PrintWriter out = response.getWriter();
			rd.include(request, response);
			out.println(("<center> <span style = 'color: red'> Invalid Credentials! </span></center>"));
		}
		
	}
}

