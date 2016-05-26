import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
 * Example of recording mouse event in an applet
 */
public class MouseExamples extends Applet implements MouseListener, MouseMotionListener{

	int x = 0, y = 20;
	String msg = "Hello";
	
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.BLACK);
		setForeground(Color.RED);
		
		
		
		
		
	} // end init
	
	public void paint( Graphics g ){
		g.drawString(msg, x, y);
	}
	
	public void mouseEntered(MouseEvent m){
		setBackground(Color.MAGENTA);
		showStatus("Mouse Entered");
		repaint();
	}
	
	public void mouseExited(MouseEvent m){
		setBackground(Color.BLACK);
		showStatus("Mouse Exited");
		repaint();
	}
	
	public void mousePressed(MouseEvent m){
		setBackground(Color.green);
		showStatus("Mouse was pressed");
		repaint();
	}
	
	public void mouseReleased(MouseEvent m){
		setBackground(Color.MAGENTA);
		showStatus("Mouse was released");
		repaint();
	}
	
	public void mouseMoved(MouseEvent m){
		x = m.getX();
		y = m.getY();
		msg = "Mouse is moving";
		setBackground(Color.white);
		showStatus("Mouse moved");
		repaint();
	}
	
	public void mouseDragged(MouseEvent m){
		msg = "Mouse is dragged";
		setBackground(Color.yellow);
		showStatus("Mouse moved " + m.getX() + " " + m.getY());
		repaint();
	}
	
	public void mouseClicked(MouseEvent m){
		msg = "Mouse is clicked";
		setBackground(Color.pink);
		showStatus("Mouse clicked");
		repaint();
	}
	
} // end class
