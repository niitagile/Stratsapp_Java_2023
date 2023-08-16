package basicconcepts;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		byte var1=scan.nextByte();
		short var2=scan.nextShort();
		int var3=scan.nextInt();
		long var4=scan.nextLong();
		float var5=scan.nextFloat();
		double var6=scan.nextDouble();
		boolean var7=scan.nextBoolean();
		char var8=scan.next().charAt(0);
		
		String var9=scan.next();
		scan.nextLine();
		String var10=scan.nextLine();
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);

	}

}
