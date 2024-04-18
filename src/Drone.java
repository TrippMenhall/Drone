import java.awt.Color;

public class Drone{
	
	public Drone(Color color, int x, int y) {
		new Body(color, x, y);
		new Wing(color, x, y);
	}
	
}