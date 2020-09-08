package quiz_3;

import java.util.Scanner;

public class Person {
	String name ="혜진";
	int age = 21;
	
	public void info() {
		System.out.println("이름 : " + name +"  나이 :  " +age);
	}
	
	public double avgMethod(String name, double kor, double eng, double mat) {
		double avg = (kor+ eng + mat)/3;
		
		return Math.round(avg * 100)/100.0;
	}
	
	public void wwwString() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력해주세요 ( quit를 입력시 종료됩니다)");
			String s = sc.next();
			
			if(s.equals("quit")) {
				System.out.println("메서드가 종료됩니다.");
				return;
			}else if(s.substring(0,3).equals("www")) {
				System.out.println(s + "은 'www'로 시작합니다");
			}else {
				System.out.println(s + "은 'www'로 시작하지 않습니다.");
			}
		
		}
	}
}
