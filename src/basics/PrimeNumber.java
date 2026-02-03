package basics;

public class PrimeNumber {
	
	public int number[]= {1,0,10,13,15,18,20,17,23,290,229};
	public static void main(String[] args) {
		PrimeNumber a=new PrimeNumber();
		a.start();
		
		
		
	}
	
	public  void start() {
		System.out.println("List of prime numbers");
		for(int n:number) {PrimeNumber.checkPrime(n);}
	}
	
	public static void checkPrime(int number) {
		
		boolean status=false;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				status=true;
			}
		}
		
		if(status==false)System.out.print(number+", ");
//		else System.out.println("No: "+number);
	}
	

}
