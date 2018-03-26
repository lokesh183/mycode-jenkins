

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCode {
	public static void main(String[] args) {
		int[] freq = { 2, 30, 15, 10, 8, 25, 80 };
		int temp = 0, temp2 = 0;
		Object[] arr = {};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < freq.length; i++) {
			int currfreq = freq[i];
			for (int j = 0; j < freq.length; j++) {
				System.out.print(freq[j] - currfreq+"   ");
				list.add(freq[j] - currfreq);
			}

			arr = list.toArray();

			// System.out.println(arr[0]);
			Arrays.sort(arr);
			// System.out.println(arr[0]);
			
		}
	/*	Integer t = (Integer) arr[0];
		Integer t2 = (Integer) arr[1];*/
System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
/*
		if (t > temp) {
			temp = t;
		}
		if (t2 > temp2) {
			temp2 = t2;
		}
*/
		// System.out.println(t+" "+t2);

		// System.out.println(temp+" "+temp2);
	}
}
