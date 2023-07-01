
public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "Saurabh Babanrao Urkude";
		String strx = "Human ";
		String stry = "Being";
		int a = 10, b = 20;
		System.out.println(strx + stry);
		System.out.println(1 + strx + stry + 5);
		System.out.println(a + b + strx + stry);
		System.out.println(strx + stry + a + b);
		System.out.println(a + b);
		
		String str1 = "SELENIUM";
		String str2 = "selenium";
		String str3 = "SELENIUM";
		String str4 = "zabc";

		//String comparison using relational operators "=="
		System.out.println(str1==str2);  //false
		System.out.println(str1==str3);  //true

		//String comparison using equal() method
		System.out.println(str1.equals(str2));  //false
		System.out.println(str1.equals(str3));  //true

		//String comparison using compareTo() method
		System.out.println(str1.compareTo(str2));  //Negative value (<0)
		System.out.println(str1.compareTo(str3));  //Zero value
		System.out.println(str4.compareTo(str1));  //Positive value (>0)
		
		String str = "Welcome to Selenium Testing";
		System.out.println();
		System.out.println(str.substring(11)); //Selenium Testing
		System.out.println(str.substring(20)); //Testing
		System.out.println(str.substring(11,19)); //Selenium
		System.out.println(str.substring(3,7)); //come
		System.out.println();
		
		int size;
		size = str.length();
		System.out.println(size);
		System.out.println(str.length());

		System.out.println(str.contentEquals("Welcome to Selenium Testing"));
		System.out.println();
		System.out.println(str.indexOf("Test"));
		System.out.println(str.indexOf("S"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	}

}
