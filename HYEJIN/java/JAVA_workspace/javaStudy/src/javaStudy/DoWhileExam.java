package javaStudy;

import java.util.Scanner;

public class DoWhileExam {
	public static void main(String[] args) {
		int value = 0;
		Scanner scan  = new Scanner(System.in);
		
		
		do {
			//반복할 문장들
			value = scan.nextInt();
			System.out.println("입력 받은 값 : " +value);
		}while(value != 10);
		
		System.out.println("반복 종료.");
	}
}
