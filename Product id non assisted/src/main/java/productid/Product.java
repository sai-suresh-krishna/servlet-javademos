package productid;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Product")
public class Product extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "jdbc:mysql://localhost/products";
		String username = "root";
		String password = "Lakshmisai@2001";

		response.setContentType("text/html");

		int Id = Integer.parseInt(request.getParameter("ID"));

		PrintWriter out = response.getWriter();

		String querys = "select * from productdetails where ID=?";
		out.print("<h1>Displaying the product Details...</h1>");
		out.print("<table border='1'><tr><th>product id</th><th>product name</th><th>product category</th><th> product price</th></tr>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbCon = DriverManager.getConnection(url, username, password);
			PreparedStatement st = dbCon.prepareStatement(querys);

			st.setInt(1, Id);

			ResultSet result = st.executeQuery();

			while (result.next()) {

				out.print("<tr><td>");
				out.println(result.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(3));
				out.print("</td>");
				out.print("<td>");
				
				out.print(result.getFloat(4));
				out.print("</td>");
				out.print("</tr>");

			}

		} catch (Exception e) {

			System.out.println("Some Issue : " + e.getMessage());

		}

	}

}