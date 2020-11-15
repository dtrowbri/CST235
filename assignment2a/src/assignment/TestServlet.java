/*
 * Author: Donald Trowbridge
 * Date: 11/12/2020
 * Class: CST235-O500
 * Statement: This work is my own.
 */

package assignment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Generating doGet response.");
		
		response.getWriter().append("Served with: ").append(request.getContextPath());
		
		/*
		 * Checks for null parameters and adds blanks instead of nulls
		 */
		String greeting = "Hello";
		if(request.getParameter("firstname") != null) {
			greeting += " " + request.getParameter("firstname");
		}
		
		if(request.getParameter("lastname") != null) {
			greeting += " " + request.getParameter("lastname");
		}
		
		/*
		 * Adds greeting to page response
		 */
		response.getWriter().println("<br />" + greeting);
		
		/*
		 * Sets firstname and lastname in the response 
		 */
		request.setAttribute("firstname", request.getParameter("firstname"));
		request.setAttribute("lastname", request.getParameter("lastname"));
		
		/*
		 * Forwards the request to the JSP page
		 */
		request.getRequestDispatcher("TestResponse.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * If either parameter is blank, redirect to error page
		 */
		if(request.getParameter("firstname").length() == 0 || request.getParameter("lastname").length() == 0) {
			request.getRequestDispatcher("TestError.jsp").forward(request, response);
		}
		
		doGet(request, response);
	}
	
	
	/**
	 * 
	 */
	@Override
	public void init() {
		System.out.println("Initiated Servlet: /TestServlet.");
	}
	
	/**
	 * 
	 */
	@Override
	public void destroy() {
		System.out.println("Destroying Servlet: /TestServlet");
	}
	
}
