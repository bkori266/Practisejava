package basics;

public class Main {
	private Arrays array;
	
	public Main() {
		array=new Arrays();
	}

	public static void main(String[] args) {
		Main main=new Main();
		main.start();
		
	}

	protected void start() {
		array.acceptArray();
		array.sort();
		array.displayArray();
		
		
	}
	


}
