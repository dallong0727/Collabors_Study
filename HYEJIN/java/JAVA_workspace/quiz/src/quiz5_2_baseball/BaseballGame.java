package quiz5_2_baseball;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		String random="";

		
		while(true) {
			if(random.length() ==3 ) break;
			String randomNum = Integer.toString((int)(Math.random()*10));

			if(!(random.contains(randomNum))) {
				random += randomNum;
			}

		}



		System.out.println(random);
		
		int count = 0;
		while(count <10) {
			

			int strike = 0;
			int ball = 0;

			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요(3자리) : ");
			String userNum = sc.next();
			count++;


			for(int randomIndex=0; randomIndex<random.length(); randomIndex++) {

				for(int i = 0; i<userNum.length(); i++) {

					if(userNum.charAt(i) == random.charAt(randomIndex)) {
						++ball;
					}
				}

				if(userNum.charAt(randomIndex) == random.charAt(randomIndex)) {
					++strike;

				}
			}

			ball -= strike;
			System.out.println("strike : " + strike + ", ball : " + ball);
			if(count == 10) {
				System.out.println("기회가 모두 소진되었습니다");
			}else {
				System.out.println("기회가 " + (10-count)+"번 남았습니다!");
			}
			
			if(strike == 3) {
				System.out.println(userNum + " 정답입니다!");
				break;
			}
		}
		
	}

}

