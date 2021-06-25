import java.util.*;

class Recur2 {

	int sumOfDigits(int n) {

		System.out.println("Current last digit: " + (n % 10));

		if (n == 0) return 0;
		
		return (n % 10) + sumOfDigits(n / 10);

	} // end of sumOfDigits(int)

	public static void main(String args[]) {

		System.out.print("Enter a number: ");
		int n = (new Scanner(System.in)).nextInt();
	
		int result = (new Recur2()).sumOfDigits(n);

		System.out.println("Sum of digits of " + n + " is: " + result);
	} // end of main()

} // end of class
