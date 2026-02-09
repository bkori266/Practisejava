package streamAPI;

@FunctionalInterface
interface Animal{
	void walk();
}



public class FunctionalsInterface {
	
	public static void main(String[] args) {
		Animal animal=()-> System.out.println("Dog is  walking");
		
		animal.walk();
	}
	

}
