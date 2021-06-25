import java.util.*;

class Recur1 {

	void recur_loop(int index, int limit) {
	
		if (index > limit) return;

		System.out.println("Current index: " + index);

		recur_loop(index + 1, limit);

	} // end of recur_loop(int, limit)

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		Recur1 ob = new Recur1();

		System.out.print("Enter starting index: ");
		int start_index = sc.nextInt();

		System.out.print("Enter ending index: ");
		int end_index = sc.nextInt();

		ob.recur_loop(start_index, end_index); // for (int i = start_index; i <= end_index; i++)

	} // end of main()

} // end of class
