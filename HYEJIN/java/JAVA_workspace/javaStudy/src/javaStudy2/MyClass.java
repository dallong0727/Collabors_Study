package javaStudy2;

public class MyClass {
//	public 리턴타입 메소드명 (매개변수(파라미터)들) { 구현}
	
	public void mathod1() {
		System.out.println("m1이 실행됨!!");
	}
	
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행!!");
	}
	
	public int method3() {
		System.out.println("m3 실행");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + "와 "+ y + "를 이용한 m4실행!");
	}
	
	public int method5(int x) {
		System.out.println("등어온값이" + x +"인 m5 실행");
		return x;
	}
}
