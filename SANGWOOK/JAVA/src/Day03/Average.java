package Day03;

public class Average {
	String name;
	int kor;
	int eng;
	int mat;
	int avg;
	int tot;
	
	public int tot(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		
		tot = kor+eng+mat;
		return tot;
	}
	
	public int average(int tot) {
		
		this.avg =  tot /3;
		
		System.out.println(Math.round(avg*100)/100.0);
		
		return avg;
	}
	
	
//	3번
//	public class quiz05 {
//	   public static void ExamEx05(String name ,int kor, int eng, int mat) {
//	      int tot = kor + eng + mat;
//	      int num = tot / 3;
//	      double avg = Math.round(num * 100) / 100.0; //소수점 3번째자리에서 반올림
//	      System.out.println("\t*** " + name + " ***");
//	      System.out.println("국어   영어   수학   총점   평균");
//	      System.out.println(kor+ "\t" + eng + "\t" + mat + "\t"  + tot + "\t" + avg);
//	   }
//	   public static void main(String[] args) {
//	      ExamEx05("홍길동",100, 80, 30);
//	   }
//	}
//	4번
//	public class StringTest {
//	   public static void main(String[] args) {
//	      String str;
//	      Scanner sc = new Scanner(System.in);
//	      while(true) {
//	         System.out.print("문자열을 입력하세요>");
//	         str = sc.next();
//	         if(str.equals("quit") == true) {
//	            break;
//	         }
//	         if(str.substring(0,3).equals("www")) {
//	            System.out.println(str + " 은  'www'로 시작합니다.");
//	         } else {
//	            System.out.println(str + " 은  'www'로 시작하지 않습니다.");
//	         }
//	      }
//	   }
//	
	
	
}
