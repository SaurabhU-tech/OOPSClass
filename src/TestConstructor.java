
public class TestConstructor {
	
	public TestConstructor() {
		System.out.println("Saurabh is Inteligent boy...");
	}
	String emp_name;
	int emp_id;
	TestConstructor(String emp_name, int emp_id)
	{
		   this.emp_name = emp_name;
		   this.emp_id = emp_id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor obj = new TestConstructor();
		TestConstructor e1 = new TestConstructor("Satish", 101);
		TestConstructor e2 = new TestConstructor("Gangwani", 102);
		System.out.println("Employee 1 : " +e1.emp_name+" " +e1.emp_id);
		System.out.println("Employee 2 : " +e2.emp_name+" " +e2.emp_id);
	}

}
