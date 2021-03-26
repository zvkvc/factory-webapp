package it.engineering.web.servlets.cityservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.City;
import it.engineering.web.repository.CityRepository;


@WebServlet("/city/add-city")
public class AddCityServlet extends HttpServlet {

	private static final long serialVersionUID = 3457797189691372240L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing request for adding a city...");
		CityRepository cityRepository = (CityRepository) req.getServletContext().getAttribute("cityRepository");
		
		String cityName = req.getParameter("name");
		String postalCode = req.getParameter("postalCode");
		
		// create a new city
		City newCity = new City(cityName, postalCode);
		// add new city to the cityRepository
		cityRepository.getCities().add(newCity);
		// update context attribute
		req.getServletContext().setAttribute("cityRepository", cityRepository);
		
		// redirect to confirmation page or main page
		req.setAttribute("message-city-added", "City successfuly added!");
		req.getRequestDispatcher("/WEB-INF/pages/city.jsp").forward(req, resp);


	}
	
	
}
