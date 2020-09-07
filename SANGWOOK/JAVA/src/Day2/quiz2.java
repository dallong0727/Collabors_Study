package Day2;

import java.util.Scanner;

public class quiz2 {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//문제 1
		for (int i =1; i <= 52; i++) {
			if((52%i)==0) {
				System.out.println(i);
			}
		}
		
	System.out.println("////////////////////////////////////////////");

		
		//문제 2
		//2-1
		System.out.println("1");
	       int math = sc.nextInt();
	       System.out.println("2");
	       int eng = sc.nextInt();
	       System.out.println("3");
	       int sci = sc.nextInt();
		   
	       
	       
	       
	       int total = math+  eng +  sci;
		   int avg = (math + eng + sci)/3;
		  
		   
//		   if(total > 40 ) {
//			    System.out.println("각 과목 합격");
//		   } else if(total <40) {
//			   System.out.println("과락");
//		   }
//		   
//		   if(avg >= 60) {
//			   System.out.println("합격");
//		   } else if(avg <60) {
//			   System.out.println("불합격");
//		   }
		   
		   
		   
		   if(avg < 60 ) {
			  System.out.println("불합격");
		   } else if(avg >= 60 && math >= 40 &&  eng >= 40 &&  sci >= 40) {
			  System.out.println();
		   } else if (avg >= 60 && math < 40 ||  eng < 40 ||  sci < 40 ) {
			   System.out.println();
		   }
		   		   
//		
	System.out.println("////////////////////////////////////////////");
		
		//문제 3 
		   System.out.println("시작 점수");
		   int start = sc.nextInt();
		   
		   System.out.println("끝 점수");
		   int end = sc.nextInt();
		   int total1 =0; 
		   while(start <= end ) {
			   total1 =  total1 + start;
			   start++;
		   }
		   
		   System.out.println(total1);
		
				
		
		   //문제 4
//		   int[][] number = { {3,4,5} , {2} , {1,3} };
		   
//		   ① number[1].length
		   		// [1] = 세개중 첫번째 {2}입니다.
		   
//		   ② number.length
		   		// 전제 배열  = {3,4,5} , {2} , {1,3}
		   
//		   ③ number[2][0]
		   		// 두번재 {2} 의  0번째 = 2  
//		   ④ number[1][1]
		   		// 1번째 배열 {3,4,5} 의  1번째 = 4 
	}
		

}
