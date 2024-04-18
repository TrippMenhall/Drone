import java.awt.Color;

public class Swatch{

	private ClickableRectangle rectangle;
	
	public Swatch(int x, int y, Color color, char type) {
		
		rectangle = new ClickableRectangle(color, type);
		rectangle.setColor(color);
		rectangle.setSize(100, 50);
		rectangle.setLocation(x, y);
		rectangle.setFrameColor(java.awt.Color.white);
		rectangle.setFrameThickness(3);
		
	}
	
}
