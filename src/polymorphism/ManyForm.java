package polymorphism;

public class ManyForm {
	public static void main(String[] args) {
		CompanyX a=new CompanyX();
		a.joining();
	}
}

class CompanyX{
	protected void joining() {
		System.out.println("Welcome to CompanyX");
	}	
}

class CompanyY extends CompanyX{
	protected void joining() {
		System.out.println("Welcome to CompanyY");
	}
	
}

