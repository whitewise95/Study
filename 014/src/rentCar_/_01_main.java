package rentCar_;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RentcarEx.memberBean;
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
		
		
	//${}를 사용하면 incloud가 안되어 헤메었다
		
		request.setCharacterEncoding("utf-8");
		pageBean pb = new pageBean();
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		pb.setCenter(request.getParameter("center"));
		if(pb.getCenter() == null) {
			pb.setCenter("03_center.jsp");
		}
	
		pb.setTop("02_top.jsp");
		pb.setBottom("04_bottom.jsp");
		
		request.setAttribute("pb", pb);
		session.setAttribute("id", id);


		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/01_main.jsp");
		dis.forward(request, response);
	}
	
}
