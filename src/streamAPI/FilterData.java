/**
 * 
 */
package streamAPI;

import java.util.Arrays;
import java.util.List;

import basics.Prime;

/**
 * @author bmanikch
 *
 */
public class FilterData {
	
	Prime prime;
	public FilterData() {
		prime=new Prime();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilterData a=new FilterData();
		a.filterdata();

	}

	private void filterdata() {
		List<Integer> studentData= Arrays.asList(1,3,4,5,6,7,8,12,33,56,78,90,67);
		long start=System.currentTimeMillis();
					 int a=studentData.stream()
								.filter(n->prime.checkPrime(n))
								.mapToInt(n->n)
								.sum();
		long end=System.currentTimeMillis();
		
		long start1=System.currentTimeMillis();
					 int b=studentData.parallelStream()
								.filter(n->prime.checkPrime(n))
								.mapToInt(n->n)
								.sum();
		long end1=System.currentTimeMillis();
		
		System.out.println("a "+ (start-end));
		System.out.println("a "+ (start1-end1));
								
		
		

	}

}
