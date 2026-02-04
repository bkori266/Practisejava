package polymorphism;

public class ManyForm {
	public static void main(String[] args) {
		CompanyX a=new CompanyX();
		a.joining();
	}
}
/**
You are working for X comapany
*/
class CompanyX{
	protected void joining() {
		System.out.println("Welcome to CompanyX");
	}	
}

/**
You are working for Y comapany
*/
class CompanyY extends CompanyX{
	protected void joining() {
		System.out.println("Welcome to CompanyY");
	}
	
}

