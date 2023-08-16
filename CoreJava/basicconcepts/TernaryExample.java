package basicconcepts;

import java.util.Scanner;

public class TernaryExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num1=scanner.nextInt();
		System.out.println("enter the number");
		int num2=scanner.nextInt();
		System.out.println("enter the number");
		int num3=scanner.nextInt();
		int res =num1>num2 && num1>num3?num1 :
				num2>num1 && num2>num3? num2:num3;
		System.out.println(res);

	}

}
