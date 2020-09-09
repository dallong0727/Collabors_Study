package quiz_4_2Interface;

public class OldCar implements OperateCar{

	@Override
	public void start() {
		System.out.println("OldCar의 start메서드");
		
	}

	@Override
	public void stop() {
		System.out.println("OldCar의 stop메서드");
		
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("OldCar의 setSpeed메서드");
		
	}

}
