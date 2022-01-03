import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] number = {45, 72, 3, 32, 25, 6};
		System.out.println("ORIGINAL : "+ Arrays.toString(number));

		for (int j = 1; j < number.length; j++) {
			int key = number[j];
			int i = j - 1;
			while ((i >= 0) && number[i] > key) {
				System.out.println(number[i] + " vs "+ key + "(key)");
				number[i+1] = number[i];
				number[i] = key;
				System.out.println("SWITCHED into " + Arrays.toString(number));
				i--;
			}
			System.out.println("next ~>\n");
		}
		System.out.println("-----------------------");
		System.out.println("RESULT : "+ Arrays.toString(number));		
	}
}
