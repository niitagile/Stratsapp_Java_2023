package inerfaceexamples;
abstract class Microwave{
	private int temp;
	private int time;
	abstract void setTemp();
	abstract void setTime();
	void power(){
		System.out.println("on/off");
	}
}
class Cake extends Microwave{
	
	void setTemp(){}

	@Override
	void setTime() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Microwave obj=new Microwave();
		
	}

}
