package _08_el_jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _04_bean.ProductBean;

/**
 * Servlet implementation class JstlEx03
 */
@WebServlet("/JstlEx04")
public class JstlEx04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("nData", 1234567.123);
		request.setAttribute("now", new Date());
		
		
	
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter08_el_jstl/jstlEx04.jsp");
		dis.forward(request, response);    //dis가 틀리면 dis.이 안됨
		
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
