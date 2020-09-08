package javaStudy2;

public class MethodOverloadExam {
	public static void main(String[] args) {
		MyClass2  m = new MyClass2();
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(4, 5,6));
		System.out.println(m.plus("혜진","입니다"));
	}
}
