

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;
/**
 * Servlet implementation class Demo1
 */
@WebServlet("/Demo1")
public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Enumeration en=request.getParameterNames();
		while(en.hasMoreElements()) {
			Object obj=en.nextElement();
			String s=(String)obj;
			String value=request.getParameter(s);
			pw.println("<br>");
			pw.println("Parameter Name is "+s+" and Parameter Value is "+value+" ");
		String []values=request.getParameterValues("habits");
		pw.println("Selected Values...");
		for(int i=0;i<values.length;i++) {
			pw.println("<li>"+values[i]+"</li>");
		}
	}
	}
//		
//		pw.println("<html>");
//		pw.println("<head><title>Hello World</title></head>");
//		pw.println("<body>");
//		pw.println("<h1>Hello World</h1>");
//		pw.println("</body></html>");
//2222//		response.setContentType("text/html");
//		pw.println("<html>");
//		pw.println("<head><title>Request Object example</title></head>");
//		pw.println("<body bgcolor=\"yellow\">");
//		pw.println("<h1>"+"Request object Info:"+"</h1>"+"<br>");
//		pw.println("<b>Method:</b>"+request.getMethod()+"<br>");
//		pw.println("<b>Request URI:</b>"+request.getRequestURI()+"<br>");
//		pw.println("<b>Protocol:</b>"+request.getProtocol()+"<br>");
//		pw.println("<b>PathInfo:</b>"+request.getPathInfo()+"<br>"+"<b>Remote Address:</b>"+request.getRemoteAddr()+"<br>");
//		pw.println("</body></html>");
		//222//

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
