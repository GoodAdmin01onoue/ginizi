package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JDBC4 {

	public static void main(String[] algs) throws SQLException{

		int newID[] = {11,12,5,13};
		//配列
		String newName [] = {"佐々木","斎藤","山口","松本"};
		String url = "jdbc:mysql://localhost/companydb";
		String id = "root";
		String pw = "password";
		Connection cnct = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {

			//ドライバのロードとインスタンス化
			Class.forName("com.mysql.jdbc.Driver");
		   cnct = DriverManager.getConnection(url,id,pw);
		   //自動コミットモードの解除
		   cnct.setAutoCommit(false);

		   //プリコンパイル
			String query = "INSERT INTO addrbk (ID,NAME) VALUES(?,?)";
		    st = cnct.prepareStatement(query);
		    //配列の数を回す
			for (int i=0;i<newID.length;i++) {

				//パラメータ1に新しいIDをセット
				st.setInt(1,newID[i]);
				//パラメータ2に新しいNameをセット
				st.setString(2,newName[i]);
				//INSERT文を更新追加
				st.executeUpdate();
			}
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(SQLException ex)	{
			ex.printStackTrace();
			//更新失敗でロールバック
			cnct.rollback();
			
		//必ず一度実行
		}finally {
		//データベースと接続切断
		 try {
			 if (st!=null) st.close();
			 if (cnct!=null) cnct.close();
		 }catch(Exception ex){ }

		}
	}



}


