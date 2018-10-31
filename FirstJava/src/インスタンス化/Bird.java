package インスタンス化;

public class Bird extends Animal{

	public static int wing = 2;
	public void fly() {
	int wing = 3;
	System.out.println(wing+"枚の羽根で飛びます");
	}

	public void sleep() {
	System.out.println("木の上で");
	super.sleep();
	}

	}

