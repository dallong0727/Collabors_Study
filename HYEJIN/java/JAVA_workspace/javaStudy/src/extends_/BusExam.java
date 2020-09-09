package extends_;
//오버라이딩 ( 직역하면 올라타다 라는 뜻)
public class BusExam {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		

		
		
		
		
		
		
		//클래스 형 변환
		
		Car2 c = new Bus();
		c.run();
		//부모 타입으로 자식을 ㅏㄱ리킬 수 있다. 
		//이경우 부모가 가지도 있는 내용만 사용가능
		//c.ppangppang();
		
		Bus bus2 = (Bus)c;
		bus2.run();
		bus2.ppangppang();
		
		System.out.println("asasa-------");
		
		Car2 bus3 = new Bus();
		bus3.run();
	}
}
