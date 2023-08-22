package ArrayExamples;
public class SquareMatrixTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int l=a.length,i,j;
		for(i=0;i<l;i++)
		{
			for(j=0;j<l;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}