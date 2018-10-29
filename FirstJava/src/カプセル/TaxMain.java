package カプセル;

public class TaxMain {
	public static void main(String[] algs) {
		int x = 100;

		//入れたものに対しての消費税
		System.out.print(Tax.calc(100));
		System.out.println(Tax.calc(100.999));
		System.out.println(Tax.calc("20000"));

		System.out.println(x+"円の消費税は"+Tax.calc(x)+"円です");
	}
}
