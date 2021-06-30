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
 * Servlet implementation class _11_updateAction
 */
@WebServlet("/updateAction")
public class _11_updateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loginDTO ldto = new loginDTO();
		request.setCharacterEncoding("utf-8");
		ldto.setId(request.getParameter("id"));
		ldto.setPw(request.getParameter("pw"));
		ldto.setEmail(request.getParameter("email"));
		ldto.setName(request.getParameter("name"));
		ldto.setTel(request.getParameter("tel"));
		String temp[] =request.getParameterValues("field");
		String field ="";
		for (int i = 0; i < temp.length; i++) {
			field += temp[i];
		}
		ldto.setField(field);
		String tempSkill[] =request.getParameterValues("skill");
		String skill ="";
		for (int i = 0; i < tempSkill.length; i++) {
			skill += tempSkill[i];
			if(i!= tempSkill.length-1) {
				skill += ",";
			}
		}
		ldto.setSkill(skill);
		String tempMajor[] =request.getParameterValues("major");
		String major ="";
		for (int i = 0; i < tempMajor.length; i++) {
			major += tempMajor[i];
			if(i!= tempMajor.length-1) {
				major += ",";
			}
		}
		
		ldto.setMajor(major);
		
		loginDAO.getInstance().update(ldto);
		RequestDispatcher dis = request.getRequestDispatcher("text/11_updateAction.jsp");
		dis.forward(request, response);
	}

}
