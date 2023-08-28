package LambdaExamples;
@FunctionalInterface
interface interface1{
	void greet();
}
//class Greeting implements interface1{
//
//	@Override
//	public void greet() {
//		System.out.println("hello All");
//		
//	}
//	
//}
public class Demo2 {

	public static void main(String[] args) {
		interface1 obj=()-> System.out.println("hello All");
			
				obj.greet();

	}

}
