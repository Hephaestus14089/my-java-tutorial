import java.util.*;

class Recur3 {

	String[] arr;

	Recur3() {

		arr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
	} // end of constructor

	void displayDigits(int n) {
		
		if (n == 0) return;

		// System.out.println(arr[n % 10]);

		displayDigits(n / 10);

		System.out.println(arr[n % 10]);

	} // end of displayDigits(int)

	public static void main(String args[]) {
	
		Recur3 ob = new Recur3(); // instance of Recur3 created and constructor invoked

		Scanner sc = new Scanner(System.in); // instance of Scanner class created
		
		System.out.print("Enter a number: ");

		ob.displayDigits(sc.nextInt());

	} // end of main()

} // end of class
