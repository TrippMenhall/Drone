import java.awt.Color;
import java.awt.event.MouseEvent;

public class Body implements Mover{
	
	protected static DraggableRectangle body;
	private int x, y, clickLocX, clickLocY;

	public Body(Color color, int x, int y) {

		body = new DraggableRectangle(color, this);
		
		body.setSize(90, 40);
		
		this.setLocation(x, y);
	}
	
	public void setLocation(int x, int y) {
		
		this.x = x;
	    this.y = y;
	    body.setLocation(x, y);
	    
	}
	
	
	public void move(int dx, int dy) {
		this.setLocation(dx+ x, dy+ y);
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
	
	public int getX() {
        return x;
    }
    
	public int getY() {
        return y;
    }
}
