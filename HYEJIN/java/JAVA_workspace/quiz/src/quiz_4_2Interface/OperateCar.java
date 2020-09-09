package quiz_4_2Interface;

public interface OperateCar {
	public void start();
	public void stop();
	public void setSpeed(int speed);
	
	default public void fly() {
		System.out.println("인터페이스의 디폴트 메서드");
	}
}
