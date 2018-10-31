package カプセル;

public class PersonMain {
	public static void main(String[] algs) {

	//personクラスをインスタンス化
	Person p = new Person();
	//今までは下記のとおり書いていたがエラーが起きてる。
	//どうやって使えるようにするか
	//p.age = 100;

	p.setAge(10);
	System.out.println(p.getAge());

	p.setName("tanaka");
	System.out.println(p.getName());
	}

}
