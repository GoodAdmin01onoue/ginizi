package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");


		String id =req.getParameter("id");
		String pass = req.getParameter("pass");


	   if (id == "" || id == "" || id == null || pass=="" || pass== "" || pass == null) {

		req.setAttribute("message","名前またはパスワードを入力してください");

		}else if()
		req.setAttribute("message","名前またはパスワードが一致しません");

	}else if()

		}








	}


	}
}


