package abstraction;

class Student{
	private int id;
	private String name;
	
	void info() 
	{System.out.println("Basic info of student");}
	
	
	class Home{
		
		void home() {System.out.println("Going to home");}
		}
	}

public class InnerClass {

	public static void main(String[] args) {
		Student a=new Student(); 
		a.info();
		Student.Home studentHome=a.new Home();
		studentHome.home();
	}

}
