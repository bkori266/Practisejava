package assignment;

public class IncreasingOrderNumber {

	public static void main(String[] args) {
		System.out.println(new IncreasingOrderNumber().increaingOrder(1349));

	}

	private boolean  increaingOrder(long number) {
		
		long p,q;boolean status=true;
		
		p=number%10;
		
		number=number/10;
		
		while(number>0) {
			
			q=number%10;
			
			number=number/10;
			
			
			if(p>=q) { p=q;}
			else {status=false;break;}
			
			
		}
		return status;
	}

}
