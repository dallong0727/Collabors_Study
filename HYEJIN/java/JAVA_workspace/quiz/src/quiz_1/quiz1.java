package quiz_1;

import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 값을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("높이의 값을 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("삼각형의 넓이 :" +(num1* num2 / 2 ));
	}
}
