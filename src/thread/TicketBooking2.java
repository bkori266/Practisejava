package thread;

import java.util.ArrayList;
import java.util.List;

class RailwayTicket{
	String name;
	private ArrayList<String> seat;
	
	public RailwayTicket(){
		seat=new ArrayList<String>();
		seat.add("1-LB");
//		seat.add("2-MB");
//		seat.add("3-UB");
//		seat.add("4-SLB");
//		seat.add("5-SUB");	
	}
	
	public synchronized void book() {
		if(!seat.isEmpty()) {
			name=Thread.currentThread().getName();
			System.out.println(name+" seat number: "+seat.get(0));
			seat.remove(0);
		}
		else {
			name=Thread.currentThread().getName();
			System.out.println(name+": No seat avaialable ");
		}
	}
}



public class TicketBooking2 {
		
	public static void main(String[] args) {
		
		RailwayTicket railway=new RailwayTicket();
		Runnable booking=()->  railway.book();			
	
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
