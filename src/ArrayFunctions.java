
public class ArrayFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1, 2, 3, 4, 5, 6};
		char [] b = {'A','@','C','1'};
		String [] c = {"saurabh", "shubham", "bharat", "nikhil"};
		double [] d = {1.98, 4.89, 69.76, 8.678};
		boolean [] e = {true, false, false};
		
		for(String leng:c) {
			System.out.println(leng); //advace for loop
		}
		
		System.out.println();
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]); //normal for loop
		}
		
		System.out.println();
		
		System.out.println(a[4]);  //5
		System.out.println(b[3]);  // 1
		System.out.println(c.length);  //4	
		System.out.println(d[1]);  //4.89
		System.out.println(e.length);  //3

		
	}

}
