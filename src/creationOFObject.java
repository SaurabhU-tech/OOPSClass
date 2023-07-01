
public class creationOFObject {
	
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creationOFObject obj = new creationOFObject();
		obj.eat();
		obj.run();
	}
	
	public void eat() {
		System.out.println("eating");
	}
}
