package quiz_1;

public class quiz3 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y += 10 - x++); //15 -2 =13    > x=3으로 
		System.out.println(x += 2); // 3+2 = 5
		System.out.println(!('A' <= c && c<='Z')); // 'A'와c는 같다 , c는 Z보다 작다 둘다 true 지만 !이 붙엇기 때문에 false < false=0
		//0
		System.out.println('C'-c);//67-65 = 2
		System.out.println(c+1);//66
		System.out.println(++c);//B
		System.out.println(c++);//B
		System.out.println(c);//C
		
	
		
		/*
		11. boolean b = 1;
		>오직 false나 true값으로 만 값을 가질수 있다. int형은 불가능 (따라서 에러 발생)
		
		12. short s1 = 10;
		short s2 = s1++;
		>10 (증가연산자가 뒤에 붙었기때문에 대입먼저 되고 증가가 이루어진다)
		
		13. 
		short s1 = 10;
		short s2 = 5;
		short s3 = s1 + s2;
		>10 + 5 = 15(s1 + s2한 값을 s3에 대입시켰다)
		
		14. 
		char ch1 = ‘z’; >122
		char ch2 = ‘A’; > 65
		byte b = 10; >10
		System.out.println(“result = ” +
		(ch1 + ch2 + b));
		122+ 65 + 10 = 197
		
		
		 * 
		 * 
		 * */
		
		
		
		
	}
}
