package executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
 class Conversion implements Callable<String>{
	 String sen;
	 
	public Conversion(String sen) {
		
		this.sen = sen;
	}

	@Override
	public String call() throws Exception {
		String ans="";
		for(int i=sen.length()-1;i>=0;i--) {
			ans+=sen.charAt(i);
		}
		return ans;
	}
	 
 }
 class Calculation implements Callable<String>{
	 String sen;

	public Calculation(String sen) {
	
	this.sen = sen;
}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return sen.toUpperCase();
	}
	 
 }

public class ExecutorExample2 {
	public static void main(String[] args) {

		  ExecutorService es = Executors.newFixedThreadPool(2);
		  Future<String> f1 = es.submit(new Conversion("Computer"));
		  String result1=null;
		  try {
			result1 = f1.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Future<String> f2 = es.submit(new Calculation(result1));

		  try {
		   
		    System.out.println("Result of two: " + f2.get());
		  } catch (ExecutionException | InterruptedException ex) {
		    System.out.println("Exception: " + ex);
		  }

		}

}
