
public class ObjectCreationUsingNewKeyword {
	
	public void run() {
		System.out.println("Dog running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCreationUsingNewKeyword Tomy = new ObjectCreationUsingNewKeyword();
		Tomy.bark();
		Tomy.run();
		Tomy.bark();
	}
	
	public void bark() {
		System.out.println("Dog barking...");
	}
}
