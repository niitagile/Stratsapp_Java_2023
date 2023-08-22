package ArrayExamples;
public class TransposrMatrix {

	static void display(int[][] arr) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		
	}
	

	static void transpose(int[][] arr) {
		int n=arr.length;
		int ans[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans[i][j]=arr[j][i];
			}
		System.out.println();
		}
		
		display(ans);
	}
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr.length);
			display(arr);
			transpose(arr);
	}

}

//multiplication of 2 matrix