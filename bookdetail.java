import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;/**
 * Servlet implementation class detail
 */
@WebServlet("/detail")
public class bookdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookdetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3306/library";
		Connection conn = DriverManager.getConnection(URL, "root","library");
		PreparedStatement ps = conn.prepareStatement("select * from Book");
		ResultSet rs = ps.executeQuery();
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>Book Name</td>");
		out.println("<td>Book ID</td>");
		out.println("<td>Author Name</td>");
		out.println("<td>Price</td>");
		out.println("</tr>");
		while (rs.next()) {
		out.println("<tr>");
		out.println("<td>" +rs.getString("BookName") + "</td>");
		out.println("<td>" + rs.getInt("Bookid") +"</td>");
		out.println("<td>" + rs.getString("AuthorName") + "</td>");
		out.println("<td>" + rs.getInt("Price") +"</td>");
		out.println("</tr>");
		}
		out.println("</table>");
		ps.close();
		conn.close();
		} 
		catch (Exception e) {
		out.println(e);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
