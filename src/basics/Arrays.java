package basics;

import java.util.Scanner;

public class Arrays {
	public Scanner sc;
	public int numbers[];
	public Arrays() {
		sc=new Scanner(System.in);
	}
	
	public void acceptArray() {
		System.out.println("\nENter the size");
		numbers= new int[sc.nextInt()];
		System.out.print("\n Enter all the numbers:\n");
		while(!sc.hasNextInt()) {System.out.print("Plz enter valid input"); sc.next();}
		for(int i=0;i<numbers.length;i++) {
			while(!sc.hasNextInt()) {System.out.print("Plz enter valid input"); sc.next();}
			numbers[i]=sc.nextInt();
			System.out.println("Thanks got "+numbers[i]);
		}
		
		sc.close();
	}
	
	public void displayArray() {
		System.out.println("\nYour array List data");
		for(int a:numbers) {
			System.out.print(a+" ");
		}
	}
	
	
	public void sort() {
		int temp;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
					} 
				}	
		}
	}

}
