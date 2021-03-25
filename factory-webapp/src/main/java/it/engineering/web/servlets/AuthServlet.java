package it.engineering.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.model.User;
import it.engineering.web.repository.UserRepository;

@WebServlet("/login")
public class AuthServlet extends HttpServlet {

	private static final long serialVersionUID = -6380863367534791621L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// user repository "bean"
		UserRepository userRepo = (UserRepository) getServletContext().getAttribute("userRepository");

		System.out.println("==== userRepo: " + userRepo.getUsers());

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		boolean userFound = false;

		for (User user : userRepo.getUsers()) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				userFound = true;

				HttpSession session = req.getSession(true);
				session.setAttribute("user", user);
				break;
			}

			// user not found
		}

		if (userFound) {
			req.getRequestDispatcher("/main.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}

	}

}
