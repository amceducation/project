public class staticmembers {
	static int age  = 35;
	static String name = "Tom";
	
	public static void work()
	{
		System.out.println("Developing web applications");
	}
	public static void main(String[] args) {
		System.out.println(age); //Classname.variablename|Employee.age
		System.out.println(name);//Classname.variablename|Employee.name
		work();//Classname.Methodname|Employee.work
	}

}
