package basics;

public class MinMax {
	static int number[]= {1,4,3,8,0,2};
	MinMax(){
		System.out.println("Constructor calling");
	}
	public static void main(String[] args) {
		

	}
	
	static {
		int min=number[0],max=number[0];
		for(int num:number)
		{	if(num>max) {max=num;}
			else if(min>num) {min=num;}
			
		}
		
		System.out.println("Min: "+min+" Max: "+max);
	}

}
