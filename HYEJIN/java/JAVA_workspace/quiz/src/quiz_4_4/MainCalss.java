package quiz_4_4;

public class MainCalss {
	public static void main(String[] args) {
		Person s1 = new Student("홍길동",20,"123");
		Person t1 = new Teacher("이승철",50,"음악");
		Person e1 = new Employee("최강창민",20,"회계");
		printlnfo(e1);
		
	}
	
	public static void printlnfo(Person p) {
		if(p instanceof Student) {
			System.out.println(p.info());
		}else if(p instanceof Teacher) {
			System.out.println(p.info());
		}else if(p instanceof Employee) {
			System.out.println(p.info());
		}
	}
	
	
	
}
