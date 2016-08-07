package com.wangmy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 4485789388603888943L;

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String uname = req.getParameter("uname");
//		String upwd = req.getParameter("upwd");
//		System.out.println("用户名是：" + uname);
//		System.out.println("密码是： " + upwd);
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("========== doGet ==========");
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		System.out.println("用户名是：" + uname);
		System.out.println("密码是： " + upwd);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("========== doPost ==========");
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		System.out.println("用户名是：" + uname);
		System.out.println("密码是： " + upwd);
		
		String forward = null;
		
		if (uname.equals("wangmy") && upwd.equals("password")) {
			forward = "/17/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			
			// 请求重定向
			// resp.sendRedirect(req.getContextPath() + "/17/success.jsp");
		}else{
			forward = "/17/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			// 请求重定向
			// resp.sendRedirect(req.getContextPath() + "/17/error.jsp");
		}
	}

}
