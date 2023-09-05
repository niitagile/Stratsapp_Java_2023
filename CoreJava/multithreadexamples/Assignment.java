package multithreadexamples;
//create 2 threads and start them . Set name of each thread and print all information about these 2 threads

class NewThreads extends Thread{
	@Override
	public void run() {
		System.out.println("I am Thread"+ getName());
	}
}

public class Assignment {

	public static void main(String[] args) {
		NewThreads t1=new NewThreads();
		t1.setName("First Thread");
		t1.setPriority(9);
		NewThreads t2=new NewThreads();
		t2.setName("Second Thread");
		t2.setPriority(6);
		
		t1.start();
		t2.start();
		System.out.println("Thread 1 info"+t1);
		System.out.println("Thread 2 info"+t2);

	}

}
