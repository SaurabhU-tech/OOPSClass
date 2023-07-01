
public class ObjIntializeMethod {
	
	int age;
	String color;
	
	public void initdog(int a, String c) {
		age = a;
		color = c;
	}
	public void display() {
		System.out.println("Dog age is "+age);
		System.out.println("Dog color is "+color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjIntializeMethod dog = new ObjIntializeMethod(); 
		dog.display(); //default values
		dog.initdog(10, "white");
		//System.out.println("Dog age is "+dog.age);
		//System.out.println("Dog color is "+dog.color);
		dog.display();
	}

}
