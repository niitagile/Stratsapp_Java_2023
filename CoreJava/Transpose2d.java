package ArrayExamples;

public class Transpose2d {

	public static void main(String[] args) {
	 int arr[][]= {{1,2},{3,4}};
	int arr2[][]= new int [2][2];
	 for (int i =0;i<arr.length;i++)
	 {
		 for(int j = 0;j<arr[i].length;j++)
		 {
			  arr2[i][j] = arr[j][i];
		 }
	 }
	 
	 for (int i =0;i<arr2.length;i++)
	 {
		 for(int j = 0;j<arr2.length;j++)
		 {
			 System.out.print(arr2[i][j]+" ");
		 }
		 System.out.println();
		 
	 }
	 
	}

}