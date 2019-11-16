package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Reshma
 * @implNote  perform user Registration
 * @Date - 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec ->action method to register customer with database
	 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("name");
		
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String pass=request.getParameter("pass");
		
		RegisterBO regbo=new RegisterBO();
				
		regbo.setName(name);//Encapsulation part
				
				regbo.setEmail(email);
				regbo.setMobile(mobile);
				regbo.setPass(pass);
				
				ConnectionManager con=new ConnectionManager();
				try {
					RegisterDAO.Save(con.getConnection(), regbo);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.sendRedirect("login.jsp");
	}

}
