package rentCar_;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RentcarEx.pageBean;


@WebServlet("/main")
public class _01_main extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		pageBean pb = new pageBean();
		pb.setBottom(request.getParameter("center"));
		if(pb.getBottom() == null) {
			pb.setBottom("03_center");
		}
		pb.setTop("02_top.jsp");

		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/01_main.jsp");
		dis.forward(request, response);
	}
	
}
