package day15.datastream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class quiz {
	/*
	 * 1. DataOutputStreamŬ������ �̿��ؼ� int, char, boolean, double�� �����͸� �Է��ϼ���
	 * 2. ������ �ƹ��ų� �ۼ��ϼ���
	 * 3. ������ ���������� ��ٸ� DataInputStreamŬ������ ���ؼ� �����͸� �о���̼���
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
