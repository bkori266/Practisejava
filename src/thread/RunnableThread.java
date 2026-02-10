package thread;

class A implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) 
		{	System.out.println("Hi");
			try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		}//for loop
	}
	
}

class B implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) 
		{	System.out.println("Hello");
			try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
	
}

public class RunnableThread {

	public static void main(String[] args) {
		Runnable a=new A();
		Runnable b=new B();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		t1.start();
		t2.start();
		
		
		
	}	

}
