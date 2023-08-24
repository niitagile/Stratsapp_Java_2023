package inheritence;
class Parent{
	static public void display() {
		System.out.println("Display method");
	}
}
class Child extends Parent{
	
	public void display1() {
		Parent.display();
		System.out.println("Child method");
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		Child child =new Child();
		//child.display();
		child.display1();

	}

}
