package it.engineering.web.servlets.cityservlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.City;
import it.engineering.web.repository.CityRepository;

/**
 * Servlet implementation class ShowCitiesServlet
 */
@WebServlet("/show-cities")
public class ShowCitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// retrieve list of cities from CityRepository in ServletContext
    	CityRepository cityRepo = (CityRepository) req.getServletContext().getAttribute("cityRepository");
    	List<City> cities = cityRepo.getCities();

    	
    	req.setAttribute("listAllCities", cities);
    	req.getRequestDispatcher("/WEB-INF/pages/show-cities.jsp").forward(req, resp);
    }
		
		


}
