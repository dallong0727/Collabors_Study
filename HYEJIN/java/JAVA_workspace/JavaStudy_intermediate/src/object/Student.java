package object;

//오버라이딩 하는 법 
//메뉴중 Source > Gernerate hashCode() and equals()선택  > 속성중 무엇이 같아야 true를 나오게 할지 선택.


public class Student {


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthYear != other.birthYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	String name;
	String number;
	int birthYear;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		if(s1.name.equals(s2.name)) {
			System.out.println("s1과 s2는 같다.");
		}else {
			System.out.println("s1 != s2");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s2.toString());
		
		
	}
	
}
