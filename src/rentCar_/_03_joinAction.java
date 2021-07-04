package rentCar_;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RentcarEx.memberBean;
import RentcarEx.pageBean;
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class join
 */
@WebServlet("/joinAction")
public class _03_joinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		memberBean mb = new memberBean();
		mb.setId(request.getParameter("id"));
		mb.setPw(request.getParameter("pw"));
		mb.setEmail(request.getParameter("email"));
		mb.setTel(request.getParameter("tel"));
		mb.setHobby(request.getParameter("hobby"));
		mb.setJob(request.getParameter("job"));
		mb.setAge(request.getParameter("age"));
		mb.setInfo(request.getParameter("info"));
		
		boolean isJoin = rentcarDAO.getInstance().JoinMember(mb);
		
		request.setAttribute("isJoin", isJoin);
		
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/07_memberJoinPro.jsp");
		dis.forward(request, response);
	}
	
}
