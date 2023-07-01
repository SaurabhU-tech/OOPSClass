
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		int a[];
		a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0] + a[1] + a[2]);
		
		//methode 2
		int b[] = new int[3];
		b[0] = 40;
		b[1] = 50;
		b[2] = 60;
		System.out.println(b[0] + b[1] + b[2]);
		
		//Method 3
		int c[] = {10, 20, 30, 40, 50, 60};
		System.out.println(c[0] + c[5] + c[2]);
		System.out.println(c.length);
	}

}
