package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ItemListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		String word = req.getParameter("word");
		String cat = req.getParameter("cat");

		List<ItemBean> items = new ArrayList();

		ItemBean item = new ItemBean();



	}

}
