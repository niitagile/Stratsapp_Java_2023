package arrayandmethods;
class Test{
	 public int addition(int num1,int num2){
		return num1+num2;
	}

	public int subtraction(int num1, int num2){
		return num1-num2;
	}

	 public void display() {
		System.out.println("Hello All!!!");
	}
}


public class MethodItro2 {

	public static void main(String[] args) {
		Test obj=new Test();
		int ans=obj.addition(34,89);//calling statement
		System.out.println("Sum="+ans);
		obj.display();
	}
	

}
