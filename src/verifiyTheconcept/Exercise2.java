package verifiyTheconcept;


//TODO: Create an interface called Machine with one method: String start()
interface Machine{
 String start1();
}

//TODO: Create an abstract class called Appliance that:
//- Implements Machine interface

abstract class Appliance implements Machine{
 String name;
 Appliance(String name){
     this.name=name;
 }
}


//TODO: Create a class Fan that:
//- Extends Appliance

class Fan extends Appliance{
 Fan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public String start1(){
     return name+" is running";
 }
 
}


//TODO: Create a class WashingMachine that:
//- Extends Appliance

class WashingMachine extends Appliance{
 WashingMachine(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public String start1(){
     return name+" is running";
 }
}


public class Exercise2 {
 public static void main(String[] args) {
     // TODO: Create objects of Fan and WashingMachine using interface references
     
     Machine m1=new Fan("Fan");
     Machine m2=new WashingMachine("WashingMachine");
     
     System.out.println(m1.start1());
     
     System.out.println(m2.start1());
     // TODO: Print the result of start() for each object
 }
}