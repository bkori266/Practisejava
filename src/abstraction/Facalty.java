package abstraction;


interface College {
	public void start();
}

interface College2{
	public void start();
}

class C implements College,College2{

	@Override
	public void start() {
		System.out.println("Hello");
		
	}
	
}

public class Facalty {
	
	public static void main(String[] args) {
		College a=new C();
		a.start();
	}
}
