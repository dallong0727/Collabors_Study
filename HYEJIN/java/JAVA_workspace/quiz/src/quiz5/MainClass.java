package quiz5;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money;
		

		
		
		b : while(true) {
			
			System.out.println("메뉴 1.입금     2.출금     3.잔액확인   4.종료");
			int menu =sc.nextInt(); 
			
			switch(menu){
			
			case 1:
				System.out.println("입금할 금액을 입력해주세요.");
				money = sc.nextInt();
				Account.deposit(money);
				break;
			case 2:
				System.out.println("출금할 금액을 입력해주세요");
				money = sc.nextInt();
				try {
					Account.withDrwa(money);
					
				}catch(MyException e) {
					System.out.println("잔액이 부족합니다. 메뉴로 돌아갑니다.");
					//e.printStackTrace();
				}
				break;
			case 3:
				Account.getBalace();
				break;
			case 4:
				break b;
			}
		}
		
	}
}
