package _09_sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinAction
 */
@WebServlet("/JoinAction")
public class JoinAction extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);	
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw =request.getParameter("pw");
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		String[] hobbies = request.getParameterValues("hobby");
		String hobby = "";
		
		for (int i = 0; i < hobbies.length; i++) {
			hobby += hobbies[i];
			if(i!=hobbies.length-1) {
				hobby += ",";
			}
		}
		
		MemberDTO mdto = new MemberDTO(id,pw,name,email,hobby); 
		// request객체에 mdto 클래스를 저장하여 view로 데이터 전송 
		request.setAttribute("mdto", mdto);
		
		//view페이지로 이동
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/02_joinAction.jsp");
		dis.forward(request, response);
		
		
	}
	
	
}
