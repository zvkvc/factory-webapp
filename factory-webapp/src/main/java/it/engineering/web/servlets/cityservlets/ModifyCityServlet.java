package it.engineering.web.servlets.cityservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.City;
import it.engineering.web.repository.CityRepository;

@WebServlet("/modify-city")
public class ModifyCityServlet extends HttpServlet {

	private static final long serialVersionUID = 8636873011504814897L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing request for modifying a city name...");
		CityRepository cityRepository = (CityRepository) req.getServletContext().getAttribute("cityRepository");
		
		String oldName = req.getParameter("oldName");
		String newName = req.getParameter("newName");
		
		System.out.println("Old name: "+oldName+", New name: "+newName);
		
		// find old city based on oldName and rename it
		for(City city: cityRepository.getCities()) {
			System.out.println("Current city: "+city.getName());
			if (city.getName().equals(oldName)) {
				city.setName(newName);
				break;
			}
		}
		
		// update context attribute
		req.getServletContext().setAttribute("cityRepository", cityRepository);
		
		// redirect to confirmation page or main page
		req.getRequestDispatcher("/WEB-INF/pages/city.jsp").forward(req, resp);

	}	
}
