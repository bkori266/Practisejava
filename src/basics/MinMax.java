package basics;

public class MinMax {
	static int number[]= {1,4,3,8,50,0,2,12};
	MinMax(){
		System.out.println("\nConstructor calling");
	}
	public static void main(String[] args) {
		MinMax a=new MinMax();

	}
	

/**
 * Finding MinMax  method
 */
	static {
		int min=number[0],max=number[0];
		for(int num:number)
		{	if(num>max) {max=num;}
			else if(min>num) {min=num;}
		}
		System.out.println("Min: "+min+" Max: "+max);
	}

/**
 * Printing A-Z
 */
	static {
		
		for(char alphabet='a';alphabet<='z';alphabet++) {System.out.print(alphabet+" ");}
		
		
	}

}
