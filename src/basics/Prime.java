package basics;

public class Prime {

	public static void main(String[] args) {
		
		
	}

	
	public  boolean checkPrime(int number) {
		
		boolean status=true;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				status=false;	
			}
		}
		
//		if(status==false)System.out.print(number+", ");
//		else System.out.println("No: "+number);
//		System.out.println(status==true?"No- "+number:"Yes- "+number);
		return status;
		
		
	}
}
