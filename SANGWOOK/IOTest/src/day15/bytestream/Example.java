package day15.bytestream;

//¿¹½Ã1
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("src/day15/bytestream/input.txt");
			out = new FileOutputStream("src/day15/bytestream/output.txt");
			byte[] arr = new byte[512];	
			int c;
			while((c = in.read()) != -1) {
				out.write(arr, 0, c);
			}
		} finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}
