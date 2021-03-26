package it.engineering.web.servlets.manufacturerservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.Manufacturer;
import it.engineering.web.repository.CityRepository;
import it.engineering.web.repository.ManufacturerRepository;

@WebServlet("/add-manufacturer")
public class AddManufacturerServlet extends HttpServlet {
	

	private static final long serialVersionUID = 3483462055337108466L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing request for adding a manufacturer...");
		ManufacturerRepository manufacturerRepository = (ManufacturerRepository) req.getServletContext().getAttribute("manufacturerRepository");
		
		Long pib = Long.parseLong(req.getParameter("pib"));
		Long id = Long.parseLong(req.getParameter("id"));
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String cityName = req.getParameter("cityName");
		
		//find
		
		
		
		// create a new manufacturer
		Manufacturer newManufacturer = new Manufacturer(); !!
		// add new city to the cityRepository
		manufacturerRepository.getManufacturers().add(newManufacturer);
		
		
		// update context attribute
		req.getServletContext().setAttribute("manufacturerRepository", manufacturerRepository);
		req.setAttribute("message-manufacturer-added", "Manufacturer successfuly added!");
		
		// redirect to confirmation page or main page
		req.getRequestDispatcher("/WEB-INF/pages/manufacturer.jsp").forward(req, resp);


	}
	

}
