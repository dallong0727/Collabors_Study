package day15.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class quiz {
	/*
	 * 1. 스캐너를 통해서 파일명을 정확히 입력받습니다
	 * 2. upload폴더에 해당파일이 있다면, 해당파일을 uploadcopy폴더로 복사하세요
	 *    파일이 없다면 "파일명이 없습니다" 예외구문을 출력합니다
	 * 3. 복사도중에 에러가 발생하면 "파일 처리 중 예외발생" 구문을 출력
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileReader inputstream = null; 
		FileWriter outputstream= null;
		
		
		System.out.println("파일명 입력");
		String name = scan.nextLine();
		
		try {
			inputstream = new FileReader("src/day15/characterstream/upload");
			 
			
			
			if(name.equals(inputstream)) {
				outputstream = new FileWriter("src/day15/characterstream/uploadcopy");
				
			}else {
				System.out.println("파일명이 없습니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				inputstream.close();
				outputstream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	
}
