
public class AbstractCar extends AbtractionExampleVehicle {
	public void Start() {
		System.out.println("start with keys");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCar obj = new AbstractCar();
		obj.Start();
		obj.sub();

}
}
