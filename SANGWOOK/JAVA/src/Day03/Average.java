package Day03;

public class Average {
	String name;
	int kor;
	int eng;
	int mat;
	int avg;
	int tot;
	
	public int tot(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		
		tot = kor+eng+mat;
		return tot;
	}
	
	public int average(int tot) {
		
		this.avg =  tot /3;
		
		System.out.println(Math.round(avg*100)/100.0);
		
		return avg;
	}
	
}
