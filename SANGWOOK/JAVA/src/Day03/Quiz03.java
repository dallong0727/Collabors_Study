package Day03;

public class Quiz03 {

	
	//����1
	public void method1() {
		System.out.println("�ȳ�");
	}

	
	public String method2(String x){
		
		return x;
	}
	
	public void method3(int x, int y, int z){
		System.out.println(x+y+x);
		
	}
	
	
	public String method4(int x) {
		if(x%3==0) {
			System.out.println("Ȧ��");
		}else if(x%2==0){
			System.out.println("¦��");
		}
		return null;
	}
	
	public void method5(String x , int y) {
		
		for(int i = 1; i<= y; i++) {
			
			System.out.println(x);
			
		}
	}
	
	public void maxNum(int a, int b ) {
		if(a==b) {
			System.out.println("������");
			return;
		}
		if(a > b) {
			System.out.println("a �� ū��");
		}else {
			System.out.println("b�� ū�� ");
		}
	}
	
	public void abs (int a) {
		System.out.println(Math.abs(a));
	}

	
	public int method6(int b) {
		for(int i= 0; i <=b; i++) {
			b++;
		}
		return b;
	}
	
	int[] a= {1,2,3,4};
	
	public int method7(int[] a) {
		System.out.println(a.length);
		return 0;
		
	}
	
	public String[] method8 (String c, String d) {
		String[] arr = {c, d};
		
		return arr;	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}