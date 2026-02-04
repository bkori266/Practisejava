package abstraction;


abstract class Car{
	
	protected abstract void drive();
	public void playMusic() {
		System.out.println("Playing music");
	}
}

public class WaganR extends Car {
		
	WaganR(){
		System.out.println("w-COnstructor");
	}

	public void drive() {
		System.out.println("Driving WaganR");
		
	}
	
	
	public static void main(String[] args) {	
		WaganR a=new WaganR();
		a.drive();			
	}
}
