package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class CartServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");

		String cont = req.getParameter("cont");
		String buy = req.getParameter("buy");

		if(cont != null) {
			req.getRequestDispatcher("itemList.jsp").forward(req, resp);
		}else if(buy != null) {
			req.getRequestDispatcher("purCheck.jsp").forward(req, resp);
		}
	}

}
