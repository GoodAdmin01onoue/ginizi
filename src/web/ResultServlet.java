package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html;charset=UTF-8");

	  String msg = (String)req.getParameter("a");
	  String msg1 = (String)req.getParameter("b");


    //セッション継続
	if(msg !=null) {
		 HttpSession session = req.getSession(false);

		    if(session== null)
		    	return;

    //セッション終了
	}else if(msg1 !=null){
		HttpSession session = req.getSession(false);
		if (session != null) {
		session.invalidate();

   //Result.jspを呼び出す
	RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/Result.jsp");
    dispatcher.forward(req, resp);

	}
   }
}
}