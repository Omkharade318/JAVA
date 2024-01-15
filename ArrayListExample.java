// working of ArrayList
import java.util.*;

class ArrayListExample {
	public static void main(String[] args)
	{
		int n = 5;

		// Declaring the ArrayList with initial size n
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

		// Declaring the ArrayList
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);

		for (int i = 1; i <= n; i++) {
			arr1.add(i);
			arr2.add(i);
		}
        
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
	}
}
