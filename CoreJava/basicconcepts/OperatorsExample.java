package basicconcepts;

import java.util.Scanner;

public class OperatorsExample {

	public static void main(String[] args) {
		// take a value from user and check whether number is odd or ever by using ternary operatory
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		String res = ((num%2)==0) ? "even" : "odd";
		System.out.println(res);
	}

	
	
}
/*Operators
Arithmetic Op--> +,- * / %
relational --> > < >= <= != ==
Assignment op =
logical op && || !
bitwise op & ! | ^ >> << >>>
inc/dec ++ --
ternary op ?:
	*  num%2==0? "even" : "odd"
	*/