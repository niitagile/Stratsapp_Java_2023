package ArrayExamples;



public class EvenArrayElements {
	public static void main(String[] args) {
		int arr[] = new int[] { 12, 32, 45, 56, 73, 85, 9, 63, 28, 80 };
		int[] even = findEvenElements(arr);
		for (int i = 0; i < even.length; i++) {
			if (even[i] > 0) {
				System.out.println(even[i]);
			}
		}

	}

	public static int[] findEvenElements(int arr[]) {
		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				arr1[i] = arr[i];
			}
		}
		return arr1;
	}

}