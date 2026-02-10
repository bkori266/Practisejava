package exception;

public class DivideByZeroCheck {
	private int[] ans= {1,2,3,5,0};
	public static void main(String[] args) {
		
		
		try {
			new DivideByZeroCheck().check();
		} catch (BipinException e) {
			e.printStackTrace();
			
		}
		System.out.println("ENd of main");
		

	}

	private  void check() throws BipinException {
		for (int i : ans) {
			switch (i)
			{ case 0:
				throw new BipinException(i+" is Invalid ");
			default:
					System.out.println("Ok");
				
			
			}
		}
		System.out.println("End of check method");
		
		
	}
	 
	

}
