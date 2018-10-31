package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
	public static void main(String[] algs) {

		String url = "jdbc:mysql://localhost/companydb";
		String id  ="root";
        String pw ="password";
        Connection cnct = null;
        Statement st = null;
        ResultSet rs = null;
        try {
        	//ドライバのロードとインスタンス化
        	Class.forName("com.mysql.jdbc.Driver");
        	 cnct = DriverManager.getConnection(url,id,pw);
			  st  = cnct.createStatement();
			  //SELECT文で表示する条件を指定
			  String query = "SELECT NAME,AGE FROM addrbk WHERE ID=2 AND 4";
           //NAMEとAGEを表示
        	rs = st.executeQuery(query);
        	while(rs.next()) {
        	 String NAME = rs.getString("NAME")	;
        	 System.out.println(NAME);
        	 String AGE =rs.getString("AGE");
        	 System.out.println(AGE);

        	}
        }catch(ClassNotFoundException ex) {
         ex.printStackTrace();
        }catch(SQLException ex) {
         ex.printStackTrace();
        } finally {
          try {
        	  if(rs !=null) rs.close();
        	  if(st !=null) st.close();
        	  if(cnct!=null) cnct.close();
          } catch(Exception ex) { }

          }

        }
	}

