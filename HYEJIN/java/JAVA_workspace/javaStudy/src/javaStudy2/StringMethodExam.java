package javaStudy2;

public class StringMethodExam {
	public static void main(String[] args) {
		//String str = new String("hello");
		String str = "hello";
		System.out.println(str.length()); 	//ㅁㄴ
		System.out.println(str.concat("world"));
		System.out.println(str);
		str = str.concat(" world");
		
		System.out.println(str.substring(1, 3));
		
	}
}
