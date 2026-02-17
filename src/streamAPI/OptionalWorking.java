package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalWorking {

	public static void main(String[] args) {
		
				
		List<Student> students=new ArrayList<>();
		
		students.add(new Student("Bipin", "1", "IT", 10_000));
		students.add(new Student("Vijay", "2", "ITI", 20_000));
		students.add(new Student("Nitin", "3", "IT", 30_000));
		students.add(new Student("Soniya", "4", "BMS", 40_000));
	
		
	List<Student> stu=students.stream()
				.filter(a->a.getFees()>20000)
				.map(a->a)
				.collect(Collectors.toList());
	
	for (Student student : stu) {
		System.out.println(student.getName()+": "+student.getCourse());
	}
	
	}

	
	
}
