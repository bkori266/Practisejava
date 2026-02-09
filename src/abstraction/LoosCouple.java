package abstraction;

class Test{
	public void print() {}
}
interface Computer{
	void code();
}

class Laptope implements Computer{
	
	public void code() {
		System.out.println("Coding in laptope");
	}
	
}

class Desktop implements Computer{
	public void code() {
		System.out.println("Coding in desktop");
	}
}


class Employee{
	public void status(Computer a) {
		a.code();
		System.out.println("Completed");

	}
}

public class LoosCouple {

	public static void main(String[] args) {
		Employee employee =new Employee();
		Computer desktop =new Desktop();
		employee.status(desktop);

	}

}
