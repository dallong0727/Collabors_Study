package quiz5;

public class Account {
	private static long balace;
	
	public static void deposit(int money){
		Account.balace = money;
	}//입금기능
	
	public static void withDrwa(int money)throws MyException {
		
		if(money > Account.balace) {
			throw new MyException("잔액이 부족합니다.");
		}else {
			Account.balace -= money;
		}
		
	}//출금기능 > 잔액이 출금기능보다 작다면 예외를 발생시키는 코드를 작성하세요.
	
	public static void getBalace() {
		System.out.println("잔액은 " + Account.balace +"원 입니다.");
	}//잔액확인
	

}
