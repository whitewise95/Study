package rentCar_;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RentcarEx.CarViewBean;
import RentcarEx.carreserveBean;
import RentcarEx.pageBean;
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class _12_del
 */
@WebServlet("/del")
public class _12_del extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String rday = request.getParameter("rday");
	
		rentcarDAO.getInstance().carReserceDel(id,rday);
		

		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/15_carReserveDel.jsp");
		dis.forward(request, response);
	}
}
