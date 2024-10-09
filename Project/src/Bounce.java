import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class Bounce {
    public static void main(String[] args) {
        JFrame frame = new BounceFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
class Ball{
    public void move(Rectangle2D bounds){
        x+=dx;
        y+=dy;
        if(x<bounds.getMinX()){
            x=bounds.getMinX();
            dx=-dx;
        }
        if(x+XSIZE>=bounds.getMaxX()){
            x=bounds.getMaxX()-XSIZE;
            dx=-dx;
        }
        if(y<bounds.getMinY()){
            y=bounds.getMinY();
            dy=-dy;
        }
        if(y+YSIZE>=bounds.getMaxY()){
            y=bounds.getMaxX()-YSIZE;
            dy=-dy;
        }
    }
}
public Ellipse2D getShape(){
    return new Ellipse2D.Double(x,y,XSIZE,YSIZE) ;{
        
    }
}