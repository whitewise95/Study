package _09_sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyPage
 */
@WebServlet("/MyPage")
public class MyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
		
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//세션값 가져오기
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		//세션을 이용하여 관련정보를 가져오는 비즈니스 로직
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/05_myPage.jsp");
		dis.forward(request, response);
		
	}
}
