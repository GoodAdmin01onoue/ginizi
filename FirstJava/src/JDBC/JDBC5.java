package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC5 {
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
         	//DBMSへ接続
         	 cnct = DriverManager.getConnection(url,id,pw);
 			  st  = cnct.createStatement();
 			  //SELECT文で表示する条件を指定
 			  String query = "SELECT DEPT FROM addrbk WHERE ID=1";

            //DEPTを表示
         	rs = st.executeQuery(query);
         	while(rs.next()) {
         	 String DEPT = rs.getString("DEPT")	;
         	 System.out.println(DEPT);
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
         	  cnct.setAutoCommit(false);
         	  st = cnct.createStatement();
         	  st.excecuteupdat
         	  
           } catch(Exception ex) { }

           }

         }
    	 
     }

