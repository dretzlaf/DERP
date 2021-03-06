package edu.ycp.cs320.derp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/userHome.jsp").forward(req, resp);
	}
/*	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String user = (String) req.getSession().getAttribute("user");
		if (user == null) {
			System.out.println("   User: <" + user + "> not logged in or session timed out");
			
			// user is not logged in, or the session expired
			resp.sendRedirect(req.getContextPath() + "/login");
			return;
		}
			
			// now we have the user's User object,
			// proceed to handle request...
			
			req.getRequestDispatcher("/_view/poll.jsp").forward(req, resp);	
	}*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("/_view/userHome.jsp").forward(req, resp);
	}
}
