package com.bessem.forms;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bessem.dao.DaoFactory;
import com.bessem.dao.UserDao;


@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//private UserDao userDao;
       
    
    public AddUserServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		//DaoFactory daoFactory = DaoFactory.getInstance();
		//userDao = daoFactory.getUserDao();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("users", userDao.getAllUser());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/adduser.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/adduser.jsp").forward(request, response);
	}

}
