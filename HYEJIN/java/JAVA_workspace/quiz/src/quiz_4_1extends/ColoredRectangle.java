package quiz_4_1extends;

public class ColoredRectangle extends Rectangle{
	String color;
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x,y,width,height);
		this.color = color;
	}
}
