package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;

public class WorkingWithList {
	
	public void play() {
		ArrayList<Integer> emp=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			emp.add(i);
		}
		
		Iterator<Integer> getAll=emp.iterator();
		while(getAll.hasNext()) {
			System.out.println(getAll.next());
		}
		
	}
	
	public static void main(String[] args) {
		WorkingWithList a=new WorkingWithList();
		a.play();
	}

}
