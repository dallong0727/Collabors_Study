package Day1;

public class quiz1 {

	   public static void main(String[] args) {
	      int x = 2;
	      int y = 5;
	      
	      char c = 'A'; // 'A'�� �����ڵ�� 65
	      System.out.println(y += 10 - x++); //15 -2 =13    > x=3���� 
	      System.out.println(x += 2); // 3+2 = 5
	      System.out.println(!('A' <= c && c<='Z')); // 'A'��c�� ���� , c�� Z���� �۴� �Ѵ� true ���� !�� �پ��� ������ false < false=0
	      //false
	      System.out.println('C'-c);//67-65 = 2
	      System.out.println(c+1);// 66 
	      //>66�� ������ ����  : ���� �ٸ� Ÿ���� �������� ������ ������ ��� �� ������ �� "ū" ������ Ÿ���� 
	      //               ���� �ʿ� ���� ����ȯ�� �����. 
	      
	      //�⺻���� Ÿ�Ժ�ȯ
	      //byte < short,char < int <long < float < double
	      
	      // char �� int������ �������� 
	      //���� c(���� ����� char�� ����) + 1(int) ��� ������ ����� �� char���� int������ '����ȯ'�ȴ�.
	      //����c = 'A' < 'A'�� �ƽ�Ű �ڵ� ���� 65�̹Ƿ� +1�� �Ǹ� 66.
	      
	      System.out.println(++c);// B
	      //�������ִ� 'A'�� char���̱� ������  ++1�̵Ǹ� �ƽ�Ű �ڵ�� 66 char������ ǥ���ϸ� B�� ���´�.
	      System.out.println(c++);//B
	      System.out.println(c);//C
	      
	   
	      
	      /*
	      11. boolean b = 1;
	      >���� false�� true������ �� ���� ������ �ִ�. int���� �Ұ��� (���� ���� �߻�)
	      
	      12. short s1 = 10;
	      short s2 = s1++;
	      >10 (���������ڰ� �ڿ� �پ��⶧���� ���Ը��� �ǰ� ������ �̷������)
	      
	      13. 
	      short s1 = 10;
	      short s2 = 5;
	      short s3 = s1 + s2;
	      >10 + 5 = 15(s1 + s2�� ���� s3�� ���Խ��״�)
	      
	      14. 
	      char ch1 = ��z��; >122
	      char ch2 = ��A��; > 65
	      byte b = 10; >10
	      System.out.println(��result = �� +
	      (ch1 + ch2 + b));
	      122+ 65 + 10 = 197
	      
	      
	       * 
	       * 
	       * */
	      
	      
	      
	      
	   }
	}

