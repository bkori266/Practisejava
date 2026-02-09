package verifiyTheconcept;

//TODO: Create an class called Employee

class Employee{
 private String name;
 private Double salary;
 
 public Employee(String name,Double salary){
     this.name=name;
     this.salary=salary;
 }
 
 
 
 
 public String getName() {
	return name;
}




public Double getSalary() {
	return salary;
}




public String getDetails(){
     return "Name: "+name+", Salary: "+salary;
     
 }

 
}


class Manager extends Employee{
 
 private String department;
 
 public Manager(String name,Double salary,String department){
     super(name,salary);
     this.department=department;
 }
 public String getDetails(){
     return "Name: "+getName()+", Salary: "+getSalary()+" ,Department: "+department;
 }
 
 
}


public class Exercise {
 public static void main(String[] args) {
     // TODO: Create Employee and Manager objects
     
     Employee employee=new Employee("Alice",50000.0);
     Manager manager =new Manager("Bob",80000.0,"IT");
     
     // TODO: Print their details using getDetails()
     
     System.out.println(employee.getDetails());
     System.out.println(manager.getDetails());
 }
}
