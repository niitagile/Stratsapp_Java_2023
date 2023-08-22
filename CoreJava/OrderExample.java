package ArrayExamples;

import java.util.Arrays;

public class OrderExample {

	public static void main(String[] args) {
		int arr[]= {4,5,16,3,0,9,19};
		
		int k=5;
		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(k+"th order value is::"+arr[k-1]);
	}

}
