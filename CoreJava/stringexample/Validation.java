package stringexample;

import java.util.Scanner;

public class Validation {
	static boolean validate(String uname, String pword){
		if(uname.equalsIgnoreCase("Java")&& pword.equals("eclipse123"))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(count<=3) {
		System.out.println("Enter username");
		String uname=sc.nextLine();
		System.out.println("Enter password");
		String pword=sc.nextLine();
		
		if(validate(uname.trim(),pword.trim())) {
			System.out.println("Welcome"+uname);
			break;
		}
		else
			
			System.out.println("Invalid user or password");
			count++;
			
		}
	}
}
