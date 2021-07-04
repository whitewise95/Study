package rentCar_;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RentcarEx.pageBean;
import RentcarEx.rentcarBean;
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class _08_rentCarInfo
 */
@WebServlet("/rentCarInfo")
public class _08_rentCarInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pageBean pb = new pageBean();
		pb.setBottom("04_bottom.jsp");
		pb.setTop("02_top.jsp");
		int no = Integer.parseInt(request.getParameter("num"));
		rentcarBean rb=rentcarDAO.getInstance().rentCarInfo(no);
		String temp = "";
		if(rb.getCategory() == 1) temp = "소형";
		if(rb.getCategory() == 2) temp = "중형";
		if(rb.getCategory() == 3) temp = "대형";
		
		
		
		request.setAttribute("rb", rb);
		request.setAttribute("pb", pb);
		request.setAttribute("temp", temp);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/11_carReserveInfo.jsp");
		dis.forward(request, response);
	}

}
