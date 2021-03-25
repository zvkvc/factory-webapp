package it.engineering.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener  implements ServletContextListener {
	
	 public ContextListener() {
	    	System.out.println("====== Constructor: ContextListener =====");
	    }

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
