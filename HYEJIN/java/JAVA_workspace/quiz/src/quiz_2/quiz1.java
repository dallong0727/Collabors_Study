package quiz_2;

import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력받아서 1 ~ 정수까지 약수를 구하는 프로그램을 작성하세요.
			약수는 나누어서 떨어지는 수를 말합니다. (예 9의 약수는 1, 3, 9)
			실행방법 : 52
			결과출력 : 1 2 4 13 26 52

		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요 : ");
//		int num = sc.nextInt();
//		for(int i = 1; i<= num; i++) {
//			if(num % i == 0) {
//				System.out.print(i +" ");
//			}
//		}
		
		
		/*
		 * 2. 3과목의 점수를 입력받아서 합격이지 불합격인지 출력하는 프로그램을 작성하세요.
			단, 3개의 과목이 전부 40이상이어야 하고 평균이 60이어야 "합격"을 출력하고
			평균이 60이 넘지만 1개의 과목이라도 40 미만이면 "과락으로 불합격"을 출력하며
			평균이 60미만이면 "불합격"을 출력한다.
			실행예시 1 :
			실행방법 : 75 80 100
			결과 = 합격
			실행예시 2 :
			실행방법 : 95 80 38
			결과 = 과락으로 불합격
			실행예시 3 :
			실행방법 : 32 40 22
			결과 = 불합격

		 */
		
		
//		System.out.println("수학 점수를 입력해주세요 : ");
//		int math = sc.nextInt();
//		System.out.println("영어 점수를 입력해주세요 : ");
//		int eng = sc.nextInt();
//		System.out.println("국어 점수를 입력해주세요 : ");
//		int kor = sc.nextInt();
//		
//		int avg  = (math + eng + kor ) /3;
//		if(avg < 60) {
//			System.out.println("불합격 입니다.");
//		}else if(avg >= 60 && (math < 40 || eng < 40 || kor < 40)) {
//			System.out.println("과락으로 불합격");
//		}else {
//			System.out.println("합격입니다");
//		}
		
		
		

		/*
		 * 3번
		 * 3. 시작 값과 끝 값을 입력하여 시작부터 끝 값까지 출력하고 합을 구하는 프로그램을 작성하세요
			실행예시 1 :
			실행방법 : 2 20
			2 3 4 5 6 7 8 ... 18 19 20
			합 = 209
			실행예시 2 :
			실행방법 : 20 2
			2 3 4 5 6 7 8 ... 18 19 20
			합 = 209
			*/
		
		System.out.println("시작값을 입력해주세요 : ");
		int s = sc.nextInt();
		System.out.println("끝 값을 입력해주세요 : ");
		int e = sc.nextInt();
		
		int total = 0;
		for(int i = s; i<=e; i++) {
			System.out.print(i +"  ");
			total += i;
		}
		System.out.println();
		System.out.println("합 : " + total);
		
		
		//4번 
		/*4. 아래와 같이 배열을 선언하였다. 다음 코드의 결과 값을 예측해 보세요.
			int[][] number = { {3,4,5} , {2} , {1,3} };
			① number[1].length 
			② number.length
			③ number[2][0] 
			④ number[1][1]
            답
            1> 1
            2> 3
            3> 1
            4> 에러 > number[1]은 2차원배열 인덱스가 0 까지 밖에 존재하지 않는다.
		 * */
		
		
		
	
		/*
		 * 5. 아래의 코드를 보고 결과를 예측해 보세요. (결과와 이유 모두 기재할 것)
			①int index = 1;
			boolean[] test = new boolean[3];
			boolean foo = test[index];
			System.out.println("foo = " + foo);
			
			>false (생성만 하고 값을 지정해주지 않았기 때문에 기본값으로 false가 들어감.)
			
			②int i=1;
			int j=i++;
			>j = 1  i = 2;
			
			if((i>++j)&(i++==j)) { 
			i=2 > j =2 & i = 2 == j =2
			이후 i는 ++로 인해 3이됨.
			
			i+=j;
			}
			System.out.println("i=" + i + ", j=" + j);
			> i = 3 , j = 2;  (&은 첫번째 조건이 flase여도 두번쨰 조건을 실행해본다,) i++가 실행되므로 i=3
			
			
			③int i=1;
			int j=i++;
			>j = 1 대입    > 이후 i = 2
			if((i>++j)&&(i++==j)) { 
			i=2 > j=2  && i =2 == j =2
			
			첫번째 조건에서 만족하지 못했기 떄문에 두번째는 실행조차하지않음.(i++문이 실행되지 않는다는 뜻)
			( i가 ++j보다 크고, i++가 j와 같을 때 실행)조건문 실행안됨.
			
			
			i+=j;
			}
			System.out.println("i=" + i + ", j=" + j);
			>i = 2, j = 2
			
			
			④int i=1;
			int j=i++;
			//i = 1 , j = 1
			
			if((i>j++)|(i++==j)) {
			//i = 2 > j =1 (이후 증가됨 ) true
			//i = 2(이후 증가됨) == j = 2 true
			//조건문 실행됨. 현재 i =3 , j = 2
			
			i+=j; //i = 5 , j = 2
			}
			System.out.println("i=" + i + ", j=" + j);
			//결과  i = 5, j = 2
			
			
			int i=1;
			int j=i++; //j = 1 , i = 1 ( 대입 후 2)
			
			if((i>j++)||(i++==j)) {
			// i = 2 > j =1(비교 후 2 )true  
			
			
			i+=j;
			//i = 4 , j = 2
			}
			System.out.println("i=" + i + ", j=" + j);
			//결과 //i = 4 , j = 2 // ||는 앞의 비교가 true라면 우측 비교를 실행하지 않기떄문에 
			
		 * 
		 * 
		 * */
		
		
		
	}
}
