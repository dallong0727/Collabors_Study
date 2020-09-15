package day15.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class quiz {
	/*
	 * 1. DateŬ������ �̿��ؼ� file��ο� ���糯¥(����:20200915).txt�̸����� ������ ���ϴ�
	 * 2. ������ �ƹ��ų� �ۼ��ϼ���
	 * 3. ������ ���������� ��ٸ� BufferedReader�� ���ؼ� ������ �о���̼���
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
