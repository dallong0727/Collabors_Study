package exception;

public class ExceptionExam {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			
		
		int k = i/j;
		System.out.println(k);
		}catch(Exception e) {
			System.out.println("에러업니다.ㄴ" + e.toString());
		}finally {
			System.out.println("반드시 실행됨.");
		}
		
		System.out.println("main end!");
	}
}
