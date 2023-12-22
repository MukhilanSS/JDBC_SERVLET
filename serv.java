import java.io.*;

import java.util.*;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.net.*;



/**

 * Servlet implementation class formserv

 */

@WebServlet("/formserv")

public class serv extends HttpServlet {

	private static final long serialVersionUID = 1L;

       

    /**

     * @see HttpServlet#HttpServlet()

     */

    public serv() {

        super();

        // TODO Auto-generated constructor stub

    }



	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
		Enumeration en=request.getParameterNames();
	    while(en.hasMoreElements()) {
	    	Object obj=en.nextElement();
	    	String param=(String)obj;
	    	String value=request.getParameter(param);
	    	out.println("<br>");
	    	out.println(param+" : "+value);
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