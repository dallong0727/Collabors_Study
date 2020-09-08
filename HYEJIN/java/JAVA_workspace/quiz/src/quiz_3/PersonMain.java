package quiz_3;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.info();
		double avg  = p.avgMethod("혜진", 50.6, 30.5, 90.99);
		System.out.println(avg);
		
		String s = "wwwasdasd";
		
		p.wwwString();
}
	
}
