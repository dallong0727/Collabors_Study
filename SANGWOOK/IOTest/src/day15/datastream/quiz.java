package day15.datastream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class quiz {
	/*
	 * 1. DataOutputStream클래스를 이용해서 int, char, boolean, double형 데이터를 입력하세요
	 * 2. 내용은 아무거나 작성하세요
	 * 3. 파일을 정상적으로 썼다면 DataInputStream클래스를 통해서 데이터를 읽어들이세요
	 */
	public static void main(String[] args) {
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data")));
			out.writeInt(1000);
			out.writeChars("1");
			out.writeBoolean(true);
			out.writeDouble(7.16);
			
			in = new DataInputStream(new BufferedInputStream(new FileInputStream("data")));
			System.out.println(in.readInt());
			System.out.println(in.readChar());
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				out.close();
				in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
