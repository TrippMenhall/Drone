import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;

public class DraggableEllipse extends Ellipse implements Mover {

	private Mover co;
	private int x, y;
	
	public DraggableEllipse(Color color, Mover co) {
		super(color);
		this.co = co;
	}
	
	public void move(int dx, int dy) {
		co.move(dx, dy);
	}

	public void mousePressed(MouseEvent e) {
		co.mousePressed(e);
	}

	public void mouseDragged(MouseEvent e) {
		co.mouseDragged(e);	
	}
	
	public int getX() {
        return x;
    }

	public int getY() {
        return y;
    }

}
