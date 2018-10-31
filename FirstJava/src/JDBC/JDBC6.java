package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JDBC6 {

	public  void dao (String name) throws SQLException {

		String url = "jdbc:mysql://localhost/lesson2021";
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
			String query = "INSERT INTO dao NAME VALUES(?)";
		    st = cnct.prepareStatement(query);


				//パラメータ1に新しいIDをセット
				st.setString(1,name);
				//INSERT文を更新追加
				st.executeUpdate();

				cnct.commit();

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


