package Day2;

import java.util.Scanner;

public class quiz2 {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//���� 1
		for (int i =1; i <= 52; i++) {
			if((52%i)==0) {
				System.out.println(i);
			}
		}
		
	System.out.println("////////////////////////////////////////////");

		
		//���� 2
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
//			    System.out.println("�� ���� �հ�");
//		   } else if(total <40) {
//			   System.out.println("����");
//		   }
//		   
//		   if(avg >= 60) {
//			   System.out.println("�հ�");
//		   } else if(avg <60) {
//			   System.out.println("���հ�");
//		   }
		   
		   
		   
		   if(avg < 60 ) {
			  System.out.println("���հ�");
		   } else if(avg >= 60 && math >= 40 &&  eng >= 40 &&  sci >= 40) {
			  System.out.println();
		   } else if (avg >= 60 && math < 40 ||  eng < 40 ||  sci < 40 ) {
			   System.out.println();
		   }
		   		   
//		
	System.out.println("////////////////////////////////////////////");
		
		//���� 3 
		   System.out.println("���� ����");
		   int start = sc.nextInt();
		   
		   System.out.println("�� ����");
		   int end = sc.nextInt();
		   int total1 =0; 
		   while(start <= end ) {
			   total1 =  total1 + start;
			   start++;
		   }
		   
		   System.out.println(total1);
		
				
		
		   //���� 4
//		   int[][] number = { {3,4,5} , {2} , {1,3} };
		   
//		   �� number[1].length
		   		// [1] = ������ ù��° {2}�Դϴ�.
		   
//		   �� number.length
		   		// ���� �迭  = {3,4,5} , {2} , {1,3}
		   
//		   �� number[2][0]
		   		// �ι��� {2} ��  0��° = 2  
//		   �� number[1][1]
		   		// 1��° �迭 {3,4,5} ��  1��° = 4 
	}
		

}
