package abstraction;

@FunctionalInterface
interface College {
	public void start();
}

public class Facalty{
	
	public static void main(String[] args) {
		College a=()->System.out.println("Hello");		
		a.start();
	}
}
