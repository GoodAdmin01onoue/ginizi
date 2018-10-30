package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String proCd =request.getParameter("proCd");

		Connection cn = null;
		ResultSet rs = null;
		Statement st =null;
		PreparedStatement ps = null;
		String url="jdbc:mysql://localhost/companydb";
		String user="root";
		String pw = "password";


try {
		//データーベースをつなげている
		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection(url,user,pw);

		String query = "select proName,proName from user where"+proCd;
		rs=st.executeQuery(query);

		while(rs.next()) {

		}

}catch(SQLException ex)
{
	ex.printStackTrace();
}catch(ClassNotFoundException ex) {
	ex.printStackTrace();
}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
