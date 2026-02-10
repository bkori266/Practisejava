package thread;

class Movie{
	int ticketCount=3;String name;
	public synchronized void book() {
		if(ticketCount>0) {
			name=Thread.currentThread().getName();
			System.out.println(name+" seat number: "+ticketCount);
			ticketCount--;
		}
		else {
			name=Thread.currentThread().getName();
			System.out.println(name+" no more seat available");
		}
	}
	
}

public class TicketBooking {
		
	public static void main(String[] args) {
		Movie KGF=new Movie();
		Runnable booking=()-> {
				KGF.book();			
		};
		Thread person1=new Thread(booking,"Bipin");
		Thread person2=new Thread(booking,"Vijay");	
		Thread person3=new Thread(booking,"Nitin");
		Thread person4=new Thread(booking,"Soniya");
		
		person1.start();
		
		person2.start();		
		person3.start();
		
		person4.start();
	}

}
