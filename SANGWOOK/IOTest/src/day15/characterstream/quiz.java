package day15.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class quiz {
	/*
	 * 1. ��ĳ�ʸ� ���ؼ� ���ϸ��� ��Ȯ�� �Է¹޽��ϴ�
	 * 2. upload������ �ش������� �ִٸ�, �ش������� uploadcopy������ �����ϼ���
	 *    ������ ���ٸ� "���ϸ��� �����ϴ�" ���ܱ����� ����մϴ�
	 * 3. ���絵�߿� ������ �߻��ϸ� "���� ó�� �� ���ܹ߻�" ������ ���
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileReader inputstream = null; 
		FileWriter outputstream= null;
		
		
		System.out.println("���ϸ� �Է�");
		String name = scan.nextLine();
		
		try {
			inputstream = new FileReader("src/day15/characterstream/upload");
			 
			
			
			if(name.equals(inputstream)) {
				outputstream = new FileWriter("src/day15/characterstream/uploadcopy");
				
			}else {
				System.out.println("���ϸ��� �����ϴ�.");
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
