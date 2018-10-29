package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] algs) {

		String url="jdbc:mysql://localhost/lesson2021";
		String id ="root";
		String pw ="password";
		Connection cnct = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//ドライバのロードとインスタンス化
			Class.forName("com.mysql.jdbc.Driver");
			 cnct = DriverManager.getConnection(url,id,pw);
			  st  = cnct.createStatement();
			 rs= st.executeQuery("SELECT * from item1");
			while(rs.next()) {
				String name = rs.getString("氏名");
				String tel = rs.getString("電話番号");
				System.out.println("氏名:"+ name + "\t電話番号:"+ tel);
			 }
			} catch (ClassNotFoundException ex) {
			  ex.printStackTrace();
			} catch(SQLException ex) {
			  ex.printStackTrace();
			} finally {
			  try {
				if (rs!=null) rs.close();
				if (st!=null) st.close();
				if (cnct!=null)cnct.close();
			  }catch (Exception ex) { }
		 }

     }
}


