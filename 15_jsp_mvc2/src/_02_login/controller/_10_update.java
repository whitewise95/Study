package _02_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import _02_login.dao.loginDAO;
import _02_login.dto.loginDTO;

/**
 * Servlet implementation class _10_update
 */
@WebServlet("/update")
public class _10_update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id =(String)session.getAttribute("mid");
		loginDTO dtdb = new loginDTO();
		dtdb = loginDAO.getInstance().oenIdView(id);
		;
		
		if(dtdb.getField()!= null) {
			String[] skills = dtdb.getSkill().split(",");
			for(String skill : skills) {
				if (skill.equals("html")) 		request.setAttribute("html", true);
				if (skill.equals("css")) 		request.setAttribute("css", true);
				if (skill.equals("javascript")) request.setAttribute("javascript", true);
				if (skill.equals("java")) 		request.setAttribute("java", true);
				if (skill.equals("jsp")) 		request.setAttribute("jsp", true);
				if (skill.equals("spring")) 	request.setAttribute("spring", true);
			}
			request.setAttribute("dtdb", dtdb);
			request.setAttribute("isUpdate", true);
		}
		request.setAttribute("isUpdate", false);
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("text/10_update.jsp");
		dis.forward(request, response);
	}

}

