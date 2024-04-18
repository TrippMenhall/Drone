import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.*;

public class ClickableRectangle extends Rectangle {

    private Color _color;
    private char type;

    public ClickableRectangle(Color color, char type) {
        super(color);
        _color = color;
        this.type = type;
    }
  
    public void mouseClicked(MouseEvent e) {
        if(type == 'b') {
	        Body.body.setColor(_color);
    	}else if(type == 'w') {
	        Wing.topLeftWing.setColor(_color);
	        Wing.topRightWing.setColor(_color);
	        Wing.bottomLeftWing.setColor(_color);
	        Wing.bottomRightWing.setColor(_color);
    	}
    }
}