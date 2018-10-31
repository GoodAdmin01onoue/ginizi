package first;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] algs) {

	ArrayList list = new ArrayList();
	list.add("Java");
	list.add(150);
	list.add(true);

	System.out.println(list.size());
	System.out.println(list.get(2));

	}
}
