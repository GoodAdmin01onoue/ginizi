package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProDetServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String num = req.getParameter("num");
		String proName = req.getParameter("proName");
		String proPrice = req.getParameter("proPrice");


		String cart = req.getParameter("cart");
		String back = req.getParameter("back");

		//cart押された場合
		if(cart != null) {
			HttpSession session =req.getSession(true);
			session.setAttribute("proNameCart", proName);
			session.setAttribute("proPriceCart", proPrice);
			session.setAttribute("proNumCart", num);

			req.getRequestDispatcher("cart.jsp").forward(req, resp);

		//back押された場合
		}else if(back != null) {
			req.getRequestDispatcher("itemList.jsp").forward(req, resp);
		}
	}

}
