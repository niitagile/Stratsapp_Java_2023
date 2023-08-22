import java.util.Scanner;

class Student{
	private int rollno;
	private String name;
	
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		
	}
	public void display() {
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
	}
}
public class StudentDrive {

	public static void main(String[] args) {
//	Student student=new Student();
//	student.getData();
//	Student student2=new Student();
//	student2.getData();
//	Student student3=new Student();
//	student3.getData();
//	student.display();
//	student2.display();
//	student3.display();
		
		Student array[]=new Student[3];
//		array[0]=new Student();
//		array[1]=new Student();
//		array[2]=new Student();
	
	for(int i=0;i<array.length;i++) {
		array[i]=new Student();
		array[i].getData();
	}
	
	for(Student obj : array) {
		obj.display();
	}
	
	}

}
