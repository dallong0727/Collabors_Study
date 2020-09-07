package Day1;

public class practicepart1n2 {
	public static void main(String[] args) {

		//문제1
		int bottom = 5;
		int top = 7;
		
		int tri = (bottom * top) / 2;
		System.out.println(tri);  
		
		//문제2
		int sec = 250;
		float minute = sec /60f ;
		System.out.println(minute);
		
		//문제 3
		/*
		 * 3
		 * 	1. 18
		 * 		 y += 10 -> 15   15-2 -> 13  x++ -> x=3 
		 * 	연산은 제일 왼쪽부터 오른쪽으로 실행된다라고 생각하면됨
		 *  2. 4
		 *  	1번에서 x는 3으로 바뀌었으므로 3+2=5
		 *  
		 *  3. false
		 *  4. 2
		 *  5. 66  
		 *  6. 66  B
		 *  7. 66  B
		 *  8. 65  C
		 * */
		
		
		//문제 4
		
		/*
		 * 11. boolean형은 형변환이 안된다 그래서 int 값을 가질 수 없다  오직 false나 true만 값으로 가능하다
		 * 12. 11 
		 * 13. 15
		 * 14. zA10 
		 * 	char ch1 = ‘z’; >122
		      char ch2 = ‘A’; > 65
		      byte b = 10; >10
		      System.out.println(“result = ” +
		      (ch1 + ch2 + b));
		      122+ 65 + 10 = 197(+연산은 int형)
		 *	
		 */
	}
}












