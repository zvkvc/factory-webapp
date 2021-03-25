package it.engineering.web.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import it.engineering.web.model.User;
import it.engineering.web.repository.UserRepository;

@WebListener("Configuration")
public class ContextListener implements ServletContextListener {

	public ContextListener() {
		System.out.println("====== Constructor: ContextListener =====");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		User user1 = new User("Petar","Petrovic","pera123","petarp@gmail.com");
		User user2 = new User("Marko","Markovic","mare123","markom@gmail.com");
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		UserRepository userRepository = new UserRepository(users);
		
		
		sce.getServletContext().setAttribute("userRepository", userRepository);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
