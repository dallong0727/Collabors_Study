package day15.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class quiz {
	/*
	 * 1. Date클래스를 이용해서 file경로에 현재날짜(예시:20200915).txt이름으로 파일을 씁니다
	 * 2. 내용은 아무거나 작성하세요
	 * 3. 파일을 정상적으로 썼다면 BufferedReader를 통해서 파일을 읽어들이세요
	 */
	public static void main(String[] args) {
		Date date = new Date();
		BufferedReader inputStream = null; 
		PrintWriter outputStream = null; 
		
		 String date1 = date.toString();
				 
		try {
			inputStream = new BufferedReader(new FileReader("src/day15/bufferedstream/input.txt"));
			outputStream = new PrintWriter(new FileWriter("src/day15/bufferedstream/output.txt"));
			
			System.out.println(date1);
			String i;
			while((i = inputStream.readLine()) != null) {
				outputStream.println(i);
			}
			 
		} catch (Exception e) {
		
		}finally {
			try {
				if(inputStream != null) {
					inputStream.close();
				}
				if(outputStream != null) {
					outputStream.close();
				}
			} catch (Exception e2) {
				
			}
		}
		
	}
	
}
