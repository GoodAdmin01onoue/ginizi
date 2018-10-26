package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String ID,PASS;

		String id = req.getParameter("id");
		String pass = req.getParameter("pass");

		//DBMSへの接続
		String url = "jdbc:mysql://localhost/lesson2018";
		String idd = "root";
		String pw = "password";

		//定義
		Connection cnct = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnct = DriverManager.getConnection(url,id,pw);
			st = cnct.createStatement();

			//sql文
			String query ="select * from user";
			rs = st.executeQuery(query);

			while(rs.next()) {
				ID = rs.getString("user_id");
				PASS = rs.getString("login_pw");

			}


		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				if(st != null)st.close();
				if(cnct != null)cnct.close();
				if(rs != null)rs.close();
			}catch(Exception ex) {}
		}


	}
}


