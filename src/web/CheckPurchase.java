package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CheckPurchase")
public class CheckPurchase extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = session.getSessionContext(false);


		String yes=	request.getParameter("yes");
		String no = request.getParameter("no");
		String url = "jdbc:mysql://localhost/ginizishop";
		String id = "root";
		String pw = "password";

		ArrayList<String> proCd=(ArrayList<String>)request.getAttribute("cdlist");
		ArrayList<String> num=(ArrayList<String>)request.getAttribute("numlist");

		Connection cnct = null;
		PreparedStatement ps = null;
		ResultSet rs = null;



		if(yes!=null) {

			try {
			Class.forName("com.mysql.jdbc.Driver");
			cnct = DriverManager.getConnection(url,id,pw);
			String query ="update pro_cd=? set stock_no=stock_no-?";
			ps=cnct.prepareStatement(query);

			ps.setString(1, proCd);
			ps.setString(2, num);

			}catch(ClassNotFoundException ex) {
				ex.printStackTrace();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}


			RequestDispatcher rd = request.getRequestDispatcher("./Result.jsp");
			 rd.forward(request, response);

		}
		if(no!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("./signIn.jsp");
			 rd.forward(request, response);
		}
	}


	}

