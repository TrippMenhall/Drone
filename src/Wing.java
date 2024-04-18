import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;

public class Wing implements Mover{
	
	protected static Ellipse topLeftWing, topRightWing, bottomLeftWing, bottomRightWing;
	private int x, y, clickLocX, clickLocY;
	
	public Wing(Color color, int x, int y) {

		topLeftWing = new DraggableEllipse(color, this);
		topRightWing = new DraggableEllipse(color, this);
		bottomLeftWing = new DraggableEllipse(color, this);
		bottomRightWing = new DraggableEllipse(color, this);

		
		topLeftWing.setSize(30, 30);
		topRightWing.setSize(30, 30);
		bottomLeftWing.setSize(30, 30);
		bottomRightWing.setSize(30, 30);
		
		this.setLocation(x, y);
	}
	
	public void setLocation(int x, int y) {
	    
		this.x = x;
	    this.y = y;
	    topLeftWing.setLocation(x + 6, y - 30);
	    topRightWing.setLocation(x + 54, y - 30);
	    bottomLeftWing.setLocation(x + 6, y + 40);
	    bottomRightWing.setLocation(x + 54, y + 40);
		
	}
	
	public void move(int dx, int dy) {
		this.setLocation(dx+ x, dy+ y);
		Body.body.move(dx, dy);
	}

	public void mousePressed(MouseEvent e) {
		clickLocX = e.getX();
		clickLocY = e.getY();
	}

	public void mouseDragged(MouseEvent e) {
		move(e.getX() - clickLocX , e.getY()- clickLocY);
		clickLocX = e.getX();
		clickLocY = e.getY();
	}
}