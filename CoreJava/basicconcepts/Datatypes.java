package basicconcepts;

public class Datatypes {
public static void main(String[] args) {
	//Explicit type casting
	byte num1=78;
	byte num2=9;
	byte ans=(byte)(num1+num2);
	System.out.println("totatl="+ans);
	//implict Conversion
	int num3=89;
	int sum=num1+num3;//byte+int==>int +int
	System.out.println("total2="+ans);
	
	float num4=96.5f;
	int sum1=(int)(num3+num4);
	float sum2=num3+num4;
	System.out.println(sum1);
	System.out.println(sum2);
	
	int num=23;
	System.out.println((char)num);
	char ch=(char)num;
	System.out.println(ch);
	
}
}
/*
8 primitive Datatypes
-Integer

byte 0 to 255, -128 to 127 (1 byte)
	byte num=9;
short			(2 byte)
	short num=7889;
int (4 byte)
	int num=678;
long (8 byte)
	long num= 65236433754638L;

-decimal 
float (4 byte)
		float num=6.7f;
		
double (8 byte)
	double num=8.9;
a single character
char (2 byte)
char result='p';
*/