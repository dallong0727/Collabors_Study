package quiz_4_4;

public class Employee extends Person{
	String department;
	Employee(String name, int age, String department){
		super(name,age);
		this.department = department;
	}
	
	String info() {
		return "이름 : "+name + ", 나이 : " +age+ ", 부서 : " +department;
	}
	
	
}
