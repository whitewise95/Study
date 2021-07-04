package rentCar_;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RentcarEx.memberBean;
import RentcarEx.pageBean;
import RentcarEx.rentcarBean;
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class _02_join
 */
@WebServlet("/join")
public class _02_join extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		rentcarBean rb =new rentcarBean();
		pageBean pb = new pageBean();
		ArrayList<rentcarBean> rbList = rentcarDAO.getInstance().allRentCar();
		int max = rbList.size();
	
		pb.setBottom("04_bottom.jsp");
		pb.setTop("02_top.jsp");

		request.setAttribute("pb", pb);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/05_memberJoin.jsp");
		dis.forward(request, response);
	}

}
