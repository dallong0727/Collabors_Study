package day15.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class quiz {
	/*
	 * �̹��� ������ ���� �����̴�. �� ���Ͽ� �����Ͱ� ������ �������� ����Ǿ� �ִ�.
	 * �ϳ��� �̹��� ������ �ٸ� �̹��� ���Ϸ� �����ϴ� ���α׷��� �ۼ��Ͽ� ����.
	 * ���� ���� �̸� a.jpg
	 * ���� ���� �̸� b.jpg
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
