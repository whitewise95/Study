package _08_el_jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _04_bean.ProductBean;

/**
 * Servlet implementation class JstlEx03
 */
@WebServlet("/JstlEx03")
public class JstlEx03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] datas = {"데이터1","데이터2","데이터3","데이터4","데이터5"};
		request.setAttribute("datas", datas);   //오타 오류!
		
		ArrayList<ProductBean> productList = new ArrayList<ProductBean>();
		
		for (int i = 1; i <= 10; i++) {
			ProductBean product = new ProductBean();
			
			product.setPdCd("p00"+i);
			product.setPdNm("기계식키보드"+i);
			product.setDeptCd("dept"+i);
			product.setDeptNm("생산부서"+i);
			product.setMgrNm("관리자"+i);
			
			productList.add(product);
			
		}
		request.setAttribute("productList", productList);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter08_el_jstl/jstlEx03.jsp");
		dis.forward(request, response);    //dis가 틀리면 dis.이 안됨
		
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
