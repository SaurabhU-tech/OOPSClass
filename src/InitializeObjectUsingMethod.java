
public class InitializeObjectUsingMethod {
	String name;
	int age;
	
	public void myDog(String n, int a) {
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeObjectUsingMethod obj = new InitializeObjectUsingMethod();
		obj.myDog("Rinky", 10);
		obj.display();
	}

}
