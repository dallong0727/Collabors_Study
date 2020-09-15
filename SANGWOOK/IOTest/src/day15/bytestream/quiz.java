package day15.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class quiz {
	/*
	 * 이미지 파일은 이진 파일이다. 즉 파일에 데이터가 이진수 형식으로 저장되어 있다.
	 * 하나의 이미지 파일을 다른 이미지 파일로 복사하는 프로그램을 작성하여 보자.
	 * 원본 파일 이름 a.jpg
	 * 복사 파일 이름 b.jpg
	 */
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream ot = null; 
		
		try {
			in = new FileInputStream("src/day15/bystream/a.jpg");
			ot = new FileOutputStream("src/day15/bystream/b.jpg");
			
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				in.close();
				ot.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
