package verifiyTheconcept;


//TODO: Define PrinterTask class that implements Runnable

class PrinterTask implements Runnable {
 public void run(){
	 String name=Thread.currentThread().getName();

	 for (int i = 1; i <= 5; i++) { System.out.println(name + ": Running task " + i);}
 }
}

public class Exercise4 {
 public static void main(String[] args) throws InterruptedException {
     // TODO: Create a single PrinterTask object
     Runnable print=new PrinterTask();
     

     // TODO: Create two threads using the same task
     // Name them "Worker-1" and "Worker-2"
     Thread t1=new Thread(print,"Worker-1");
     Thread t2=new Thread(print,"Worker-2");
     
     

     // TODO: Start both threads
     t1.start();
     t2.start();
     

     // TODO: Use join() to wait for both threads to finish
     t1.join();
     t2.join();
 }
}
