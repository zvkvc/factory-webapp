package it.engineering.web.servlets.cityservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// maps to city.jsp
@WebServlet(urlPatterns = {"/city"})
public class CityServlet extends HttpServlet {

	private static final long serialVersionUID = -3225294208665957656L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/pages/city.jsp").forward(req, resp);
		
	}
	
	

}
