package thread;

class Person{
	int ticketCount;
	
	// Scychorinized will make the method only access by 1 thread at a time
	public  synchronized void increment() {
		ticketCount++;
	}
}
	
public class ThreadSafe {

	public static void main(String[] args) throws InterruptedException {
		Person person =new Person();
		
		Runnable a=()-> {for(int i=1;i<=10000;i++) {person.increment();}};
		
		Runnable b=()-> {for(int i=1;i<=10000;i++) {person.increment();}};
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
			t1.start();
			t2.start();
		
		//All thread will run and then coint with main path
		// Since main don't have any task todo as thread are working 
		t1.join(); t2.join();
		System.out.println(person.ticketCount);
		
		
	}

}
