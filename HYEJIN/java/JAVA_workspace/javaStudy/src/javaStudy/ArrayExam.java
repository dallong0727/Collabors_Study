package javaStudy;

public class ArrayExam {
	public static void main(String[] args) {
		int[] array1 =  new int[100]; // int형의 100개의 정수값을 저장할 수 있는int형 배열 array1이 생성
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4}; 
		//4개 짜리 int형 배열을 생성했고 각각 1,2,3,4이 들어가있따.
		
		int[] array3 = {1,2,3,4}; // 위와 똑같은 뜻으로 사용.
		System.out.println(array3[3]);
		int value = array3[0];
		System.out.println(value);
	}
}
