package first;

public class PersonTest {
	public static void main(String[] algs) {

        //インスタンス化
		Person p = new Person();
        //
       try {
    	   //PersonクラスのAgeに引数を渡す
    	   p.setAge(-1);
       }
       catch(Exception e) {
    	System.out.println("例外が発生しました");

    	e.printStackTrace();
       }


	}

}
