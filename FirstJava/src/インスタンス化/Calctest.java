package インスタンス化;

public class Calctest {
	public static void main(String[] algs) {
		int dollar = 150;
		int yen = 25800;
		System.out.println(dollar+"ドルは"+
		MoneyCalc.dollarToYen(dollar)+"円です");
		System.out.println(yen+"円は"+
		MoneyCalc.yenToDollar(yen)+"ドルです");

	}

}
