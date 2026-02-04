package abstraction;

abstract class Onboard{
	
	public abstract void welcome();
	public void welcomeKit(){
		System.out.println("Welcome to company");
	}
	
}

public class Anonymous {

	public static void main(String[] args) {
		Onboard a=new Onboard() {
			
			public void welcome(){
				System.out.println("Welcome to ABC company");
			}
			
			public void welcomeKit(){
				System.out.println("Welcome Kit");
			}
			
		};
		
		
		
	a.welcome();
	a.welcomeKit();
		
	

	}

}
