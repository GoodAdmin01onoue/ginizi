package インスタンス化;

public class MoneyCalc {
	static double rate = 117.94;
	public static double dollarToYen(int dollar) {
		return dollar*rate;
	}
    public static double yenToDollar(int yen) {
    	return yen/rate;
    }
}
