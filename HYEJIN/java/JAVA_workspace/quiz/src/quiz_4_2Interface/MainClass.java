package quiz_4_2Interface;

public class MainClass {
	public static void main(String[] args) {
		OperateCar op = new OldCar();
		op.fly();
		op.start();
		op.stop();
		op.setSpeed(10);
	}
}
