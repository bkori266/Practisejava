package streamAPI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourTypesofFunctionalInterface {
	
	public static void main(String[] args) {
		
		//Supplier will only return the value 
		Supplier<Integer> supplier=()->Math.max(2, 3);
		int ans=supplier.get();
		System.out.println(ans);
		
		//Function
		Function<Integer, String> start=(t)->"Hello "+ t;
			start.apply(10);
			
		// Predicate will only return true or faluse based on your input
		Predicate<Integer> a=(t)->t>10;
		a.test(20);
		
		Consumer<Integer> z=(t)->System.out.println(t);
		z.accept(10);		
	}

}
