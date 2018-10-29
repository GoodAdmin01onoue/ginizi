package first;

public class Person {

	public int age;
	public Person() {
		age = 0;
	}
    //メソッドで例外が発生する可能性のある例外クラスを列挙
	//if(Age<0)が例外
	public void setAge(int Age) throws Exception{
		if(Age<0) {
		//例外にスロー
		throw new Exception("指定された年齢が不正です");


		}
		//ageにAgeを代入
		age = Age;




		}

}



