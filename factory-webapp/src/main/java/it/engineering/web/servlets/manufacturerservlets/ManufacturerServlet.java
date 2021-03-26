package it.engineering.web.servlets.manufacturerservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/manufacturer")
public class ManufacturerServlet extends HttpServlet {

	private static final long serialVersionUID = -6883104409487104186L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/pages/manufacturer.jsp").forward(req, resp);
	}
	
}
