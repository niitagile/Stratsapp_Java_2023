//class Student{
//	private int rollno;
//	private String name;
//	
//	
//	
//	public Student(int rollno,String name) {
//		this(name);
//		this.rollno = rollno;
//		
//	}
//
//
//	
//	public Student(String name) {
//		
//		this.name = name;
//	}
//
//
//	public void display() {
//		
//		System.out.println("rollno="+rollno);
//		System.out.println("name="+name);
//	}
//}
public class ConstructorExample2 {

	public static void main(String[] args) {
		Student student=new Student(1,"Mohit");
		student.display();
	

	}

}
