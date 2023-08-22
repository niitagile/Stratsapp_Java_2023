package arrayandmethods;

public class MethodItro {

	public static void main(String[] args) {
		
		int ans=addition(34,89);//calling statement
		System.out.println("Sum="+ans);
		display();
	}
	
static public int addition(int num1,int num2){
	return num1+num2;
}

static public int subtraction(int num1, int num2){
	return num1-num2;
}

static public void display() {
	System.out.println("Hello All!!!");
}
}
