package CollectionsExample;

import java.util.HashMap;
import java.util.Scanner;

class Assignement{
	public static void main(String[] args) {

		HashMap<String,String> h=new HashMap<String, String>();
		h.put("JVM", "Java virtual Machine");
		h.put("JDK", "Java Development kit");
		h.put("JRE", "java runtime Environment");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the wor to search");
		String w=sc.next();
		String meaning= h.get(w);
		if(meaning!=null)
		{
			System.out.println("meaning for word is"+meaning);
		}
		else
		{
			System.out.println("not found");
		}
	}

}
