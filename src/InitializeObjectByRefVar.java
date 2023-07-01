
public class InitializeObjectByRefVar {
	String name;
	String color;
	boolean hasTail;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeObjectByRefVar myDog = new InitializeObjectByRefVar();
		myDog.name = "Buzo";
		myDog.color = "Brown";
		myDog.hasTail = true;
		System.out.println("Name: "+myDog.name+" Colour: "+myDog.color+" hasTail: "+myDog.hasTail);
	}

}
