package inheritence;
class Student{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static String course="Btech";
	
	 void display() {
		System.out.println("name="+name);
		System.out.println("course="+course);
	}
	static void displayinfo() {
			//System.out.println("name="+name);//static method can use only static method
			System.out.println("course="+course);
		}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName("Manisha");
		student.course="Mtech";
		student.display();
		Student student1=new Student();
		student1.setName("kanika");
		student1.display();

	}

}
