package basicconcepts;

public class BitwiseOperator {

	public static void main(String[] args) {
		int num1=8; // 0000 1000
		int num2=9;// 0000  1001
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(~num2); 
		System.out.println(num1^num2);
		System.out.println(num1>>1);
		System.out.println(num2<<1);
		System.out.println(num1>>>1);

	}

}
