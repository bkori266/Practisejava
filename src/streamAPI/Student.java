package streamAPI;

public class Student {

	
	private String name;
	private String rollNo;
	private String course;
	private Integer fees;
	
	
	
	public Student(String name, String rollNo, String course, Integer fees) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", course=" + course + ", fees=" + fees + "]";
	}






	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	
}
