class Student{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return this.rollno;
	
	
}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		Student student =new Student();
		student.setRollno(90);
		System.out.println("rollno="+student.getRollno());
		student.setName("Manish");
		System.out.println("name="+student.getName());

	}

}
