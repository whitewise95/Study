package rentCar_;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RentcarEx.carreserveBean;
import RentcarEx.pageBean;
import RentcarEx.rentcarBean;
import RentcarEx.rentcarDAO;

/**
 * Servlet implementation class _10_carOptionAction
 */
@WebServlet("/carOptionAction")
public class _10_carOptionAction extends HttpServlet {
		private static final long serialVersionUID = 1L;
		 

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			reqPro(request, response);

		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			reqPro(request, response);
		}

		protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			pageBean pb = new pageBean();
			carreserveBean cb = new carreserveBean();
			
			
			int no = Integer.parseInt(request.getParameter("no"));
			rentcarBean rb=rentcarDAO.getInstance().rentCarInfo(no);
			
			HttpSession session = request.getSession();
			String id = (String)session.getAttribute("id");
		
			
			
			pb.setBottom("04_bottom.jsp");
			pb.setTop("02_top.jsp");
			cb.setNo(Integer.parseInt(request.getParameter("no")));
			cb.setDday(Integer.parseInt(request.getParameter("dday")));
			cb.setRday(request.getParameter("rday"));
			cb.setQty(Integer.parseInt(request.getParameter("qty")));
			cb.setUseIn(Integer.parseInt(request.getParameter("useIn")));
			cb.setUseWifi(Integer.parseInt(request.getParameter("useWifi")));
			cb.setUseSeat(Integer.parseInt(request.getParameter("useSeat")));
			cb.setUseNavi(Integer.parseInt(request.getParameter("useNavi")));
			cb.setId(id);
			
			
			int seq = rentcarDAO.getInstance().rcaRreserve(cb);
			
			int carPrice = rb.getPrice() * cb.getQty();
			int optionPrice = (cb.getUseWifi()*cb.getDday()*10000)+(cb.getUseIn()*cb.getDday()*10000)+(cb.getUseSeat()*cb.getDday()*10000);
			int total = carPrice+optionPrice;
			
			
			
			
		
			
			request.setAttribute("rb", rb);
			request.setAttribute("pb", pb);
			request.setAttribute("carPrice", carPrice);
			request.setAttribute("optionPrice", optionPrice);
			request.setAttribute("total", total);
			
			RequestDispatcher dis = request.getRequestDispatcher("rentcar02/13_carReserveResult.jsp");
			dis.forward(request, response);
		}

}
