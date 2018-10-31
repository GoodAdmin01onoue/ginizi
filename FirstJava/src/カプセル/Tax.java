package カプセル;

public class Tax {
	public static final double rate =0.08;

	public static int caclc (int price) {
		return(int)(price*rate);
	}
	public static int calc(double price) {
		return(int)(((int) price) * rate);
	}
	public static int calc (String price) {
		return(int)(Integer.parseInt(price)*rate);
	}
}
