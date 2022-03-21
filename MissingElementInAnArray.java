package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 5, 8 };

		Arrays.sort(arr);
		int j = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != j) {
				System.out.println(j);
				break;
			} else
				j++;
		}
	}
}
