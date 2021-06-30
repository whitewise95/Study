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

		loginDTO dtdb = loginDAO.getInstance().oenIdView(id);
		
		
		if(dtdb.getField() != null) {
			String[] skills = dtdb.getSkill().split(",");
			for(String skill : skills) {
				if (skill.equals("HTML")) 		request.setAttribute("HTML", true);
				if (skill.equals("CSS")) 		request.setAttribute("CSS", true);
				if (skill.equals("JavaScript")) request.setAttribute("JavaScript", true);
				if (skill.equals("Java")) 		request.setAttribute("Java", true);
				if (skill.equals("JSP")) 		request.setAttribute("JSP", true);
				if (skill.equals("Spring")) 	request.setAttribute("Spring", true);
			}
			request.setAttribute("dtdb", dtdb);
			request.setAttribute("isFirstApply", false);
		}
		//else 를 안써가지고 ....
		else {
			request.setAttribute("isFirstApply", true);
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("text/10_update.jsp");
		dis.forward(request, response);
	}

}

