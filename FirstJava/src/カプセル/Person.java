package カプセル;

public class Person {
	private String name;
	private int age;


	public void setAge(int newAge) {
		if (newAge>=0) {
			age = newAge;
		}else {
			System.out.println("不正な値です");
		}

		}

	public int getAge() {
		return age;
	}

	public void setName(String newName) {
		if ((newName!=null)&&(!newName.equals(""))){

			name = newName;
		}

		}
   public String getName() {
	   return name;
   }
}
