package it.engineering.web.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import it.engineering.web.model.User;
import it.engineering.web.repository.CityRepository;
import it.engineering.web.repository.ManufacturerRepository;
import it.engineering.web.repository.UserRepository;

@WebListener("Configuration")
public class ContextListener implements ServletContextListener {
	
	
	private UserRepository userRepository;


	@Override
	public void contextInitialized(ServletContextEvent sce) {
		CityRepository cityRepository = new CityRepository();
		ManufacturerRepository manufacturerRepository = new ManufacturerRepository();
		
		
		User user1 = new User("Petar","Petrovic","pera123","petarp@gmail.com");
		User user2 = new User("Marko","Markovic","mare123","markom@gmail.com");
		
		// starting users for testing
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		this.userRepository = new UserRepository(users);
		
		
		//add repos to servlet context - this will emulate persistance for now
		sce.getServletContext().setAttribute("userRepository", userRepository);
		sce.getServletContext().setAttribute("cityRepository", cityRepository);
		sce.getServletContext().setAttribute("manufacturerRepository", manufacturerRepository);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
