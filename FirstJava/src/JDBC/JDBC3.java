package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3 {

	public static void main(String[] args) {

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
			  String query = "SELECT NAME,TEL FROM addrbk";
          //NAMEとTELを表示
        	rs = st.executeQuery(query);
        	while(rs.next()) {
        		String NAME = rs.getString("NAME")	;
           	 System.out.println(NAME);
           	 String TEL =rs.getString("TEL");
           	 System.out.println(TEL);

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


