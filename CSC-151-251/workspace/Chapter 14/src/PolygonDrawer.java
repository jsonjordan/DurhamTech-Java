import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Polygon Drawer Applet
 * 
 * CSC 251
 * 
 * Jason Jordan
 */

public class PolygonDrawer extends Applet implements MouseListener {
	
	// vars
	int numberOfClicks;
	int[] xCoordinates;
	int[] yCoordinates;
	
	
	public void init()
	    {
	       numberOfClicks = 0;
	       xCoordinates = new int [6];
	       yCoordinates = new int [6];
	 
	      setBackground(Color.white);
	      addMouseListener(this);
	    } // end init

	public void paint(Graphics g)
	    {
	        g.setColor(Color.blue);
	        
	        // if clicked 6 times, run fill polygon
	        if(numberOfClicks == 6) 
	        {
	        g.fillPolygon(xCoordinates,yCoordinates,6);
	        } // end if

	    } // end paint
	
	public void mousePressed(MouseEvent m)
	        {
				// reset numberOfClicks so you can draw another polygon
	            if(numberOfClicks == 6)
	            {
	               numberOfClicks = 0;
	            } // end if
	            
	            xCoordinates[numberOfClicks] = m.getX();
	            yCoordinates[numberOfClicks] = m.getY();
	            
	            numberOfClicks++;
	            
	            // repaint once you have clicked 6 times
	            if(numberOfClicks == 6)
	            {
	               repaint();
	            } // end if
	 
	        } // end mousePressed
	
	  public void mouseClicked(MouseEvent m)
	  {
	  }

	  public void mouseReleased(MouseEvent m)
	  {
	  }
	  
	  public void mouseEntered(MouseEvent m)
	  {
	  }

	  public void mouseExited(MouseEvent m)
	  {
	  }
	  
	  public void mouseDragged(MouseEvent m)
	  {
	  }

	  public void mouseMoved(MouseEvent m)
	  {
	  }

} // end class
