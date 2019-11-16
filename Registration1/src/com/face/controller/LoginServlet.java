package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.util.ConnectionManager;


/**
 * @author Reshma
 * @implNote  perform user Login
 * @Date - 14-11-2019
 * @category controller class
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");

		
		LoginBO logbo=new LoginBO();
		
		logbo.setUname(uname);
		logbo.setPwd(pwd);
		
		
		ConnectionManager con =new ConnectionManager();
		
		try {
			boolean log=LoginDAO.Save(con.getConnection(),logbo);
			if(log==true)
			{
				List<String> dataList=new ArrayList<String>();
				dataList.add(logbo.getName());
				System.out.println("servlet name="+logbo.getName());
				dataList.add(logbo.getEmail());
				dataList.add(logbo.getMobile());
				request.setAttribute("data", dataList);
				RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
				if(dispatcher!=null)
				{
				dispatcher.forward(request, response);

				}
				//response.sendRedirect("http://localhost:8095/Application/home.jsp");

				}
				else
				{
				response.sendRedirect("C:\\Application\\WebContent\\register.jsp");
				}
						//response.setAttribute("data",dataList);
				//response.sendRedirect("home.jsp");
			//}
		//	else
		//	{
		//		response.sendRedirect("error.jsp");
			//}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
