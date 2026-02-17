package verifiyTheconcept;

public class StaticMethodAndVariable {
	static int number;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	static void checkAccessNumber() {
		System.out.println(+number);
	}
	void  checkAccessName() {
		System.out.println(name+" "+number);
	}
	
	
	
	
}
