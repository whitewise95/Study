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

import RentcarEx.carreserveBean;
import RentcarEx.pageBean;
import RentcarEx.rentcarBean;
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class _11_carReserveView
 */
@WebServlet("/carReserveView")
public class _11_carReserveView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pageBean pb = new pageBean();
		carreserveBean cb = new carreserveBean();
		pb.setBottom("04_bottom.jsp");
		pb.setTop("02_top.jsp");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
	
		ArrayList<carreserveBean> cbList = rentcarDAO.getInstance().carReserceView(id);
		request.setAttribute("pb", pb);

		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/14_carReserveView.jsp");
		dis.forward(request, response);
	}

}
