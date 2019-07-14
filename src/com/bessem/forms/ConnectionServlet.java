package com.bessem.forms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bessem.metier.ConnectionForm;


@WebServlet("/ConnectionServlet")
public class ConnectionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    
    public ConnectionServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConnectionForm form = new ConnectionForm();
		String resultat = form.verifIdentifiants(request);
		
		request.setAttribute("resultat", resultat);
		request.setAttribute("form", form);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(request, response);
	}

}
