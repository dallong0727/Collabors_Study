package quiz_1;

import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int second = sc.nextInt();
		
		System.out.println(second +"초는"+ second/60 +"분" +second%60+"초 입니다");
		
	}
}
