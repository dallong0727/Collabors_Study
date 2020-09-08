package javaStudy2;

public class CarExam {

	public static void main(String[] args) {
//		Car c1 = new Car();
//		Car c2 = new Car();
		
		FiledCar fc = new FiledCar();
		FiledCar fc2 = new FiledCar();
		
		fc.name = "소방차";
		fc.number = 1234;
		
		fc2.name = "구급차";
		fc2.number = 1111;
		
		System.out.println(fc.name);
		System.out.println(fc.number);
		
		System.out.println(fc2.name);
		System.out.println(fc2.number);
	}

}
