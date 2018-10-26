package first;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("Name","G.Paltrow");
		map.put("Age",30);
		map.put("Gender","Femele");

		System.out.println(map.get("Gender"));

	}

}
