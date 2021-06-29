package _02_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import _02_login.dao.loginDAO;
import _02_login.dto.loginDTO;

/**
 * Servlet implementation class _08_applyAction
 */
@WebServlet("/applyAction")
public class _08_applyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		String id =(String)session.getAttribute("mid");
		String field = request.getParameter("field");
						//values를 안씀.... 기억
		String[] temp = request.getParameterValues("skill");
		String major = request.getParameter("major");
		
		
		String skill ="";
		for (int i = 0; i < temp.length; i++) {
			skill+=temp[i];
			if(i!=temp.length-1) {
				skill+=",";
			}
		}
							
		
		loginDTO ld = new loginDTO();
		ld.setId(id);
		ld.setField(field);
		ld.setSkill(skill);
		ld.setMajor(major);
		
		loginDAO.getInstance().apply(ld);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("text/08_applyAction.jsp");
		dis.forward(request, response);
	}
}
