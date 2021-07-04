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
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class loginAction
 */
@WebServlet("/loginAction")
public class _06_loginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		memberBean mb = new memberBean();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean isLogin =false;
		mb = rentcarDAO.getInstance().loginMember(id,pw);
		
		if(mb.getId()!=null) {
			session.setAttribute("id",id );
			isLogin = true;
		}
		
		request.setAttribute("isLogin", isLogin);
		
		RequestDispatcher dis = request.getRequestDispatcher("rentcar02/08_memberLoginPro.jsp");
		dis.forward(request, response);
	}

}
