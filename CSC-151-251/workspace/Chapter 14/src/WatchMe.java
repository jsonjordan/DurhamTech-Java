import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


/*
 * Watch Me Applet
 * 
 * CSC 251
 * 
 * Jason Jordan
 */
public class WatchMe extends Applet implements MouseListener, MouseMotionListener  {
	
	  // vars
	  int leftMouseX = 130;
	  int leftMouseY = 155;
	  int rightMouseX = 305;
	  int rightMouseY = 155;
	  boolean mouseEntered;
	  int leftPupilX = 130;
	  int leftPupilY = 155;
	  int rightPupilX = 305;
	  int rightPupilY = 155;
	  
	  
	  // constants
	  int LEFT_X = 75;
	  int LEFT_Y = 100;
	  int RIGHT_X = 250;
	  int RIGHT_Y = 100;
	  int EYE_SIZE = 150;
	  int EYE_SIZE2 = 100;
	  
	  public void init(){
		  // set background
		  setBackground(Color.blue);
		  
		  // mouselistener
		  addMouseListener(this);
		  
		  // motionlistener
		  addMouseMotionListener(this);
		  
	  } // end init
	  
	  public void paint(Graphics g)
	  {
		  //draw left eye
		  g.setColor(Color.white);
		  g.fillOval(LEFT_X, LEFT_Y, EYE_SIZE, EYE_SIZE);
		  
		  // draw left pupil
		  setLeftEye();
		  g.setColor(Color.black);
		  g.fillOval(leftPupilX, leftPupilY, 40, 40);
		  
		  // draw right eye
		  g.setColor(Color.white);
		  g.fillOval(RIGHT_X, RIGHT_Y, EYE_SIZE, EYE_SIZE);
		  
		  // draw right pupil
		  setRightEye();
		  g.setColor(Color.black);
		  g.fillOval(rightPupilX, rightPupilY, 40, 40);
		  
		  // see if the mouse is in window, if not, set to look straight
		  if(!mouseEntered)
		  {
			  leftMouseX = 130;
		      leftMouseY = 155;
		      rightMouseX = 305;
		      rightMouseY = 155;
		      repaint();
		  } // end if		  
	  } // end paint

	  public void mousePressed(MouseEvent m)
	  {
	  }

	  public void mouseClicked(MouseEvent m)
	  {
	  }

	  public void mouseReleased(MouseEvent m)
	  {
	  }

	  public void mouseEntered (MouseEvent m){
		  mouseEntered = true;
		  repaint();
	  }

	  public void mouseExited (MouseEvent m){
		  leftMouseX = 130;
	      leftMouseY = 155;
	      rightMouseX = 305;
	      rightMouseY = 155;
		  repaint();
	  }
	  
	  public void mouseDragged (MouseEvent m){
		  leftMouseX = m.getX();
		  leftMouseY = m.getY();
		  rightMouseX = m.getX();
		  rightMouseY = m.getY();
		  repaint();
	  }
	  
	  public void mouseMoved (MouseEvent m){
		  leftMouseX = m.getX();
		  leftMouseY = m.getY();
		  rightMouseX = m.getX();
		  rightMouseY = m.getY();
		  repaint();
	  }
	  
	  public void setLeftEye() {
		     //Set X for the pupil
		     //Mouse is to the left of the eye
		     if(leftMouseX < LEFT_X) {
		          leftPupilX = LEFT_X + 25;
		     //Mouse is to the right of the eye
		     } else if(leftMouseX > LEFT_X + EYE_SIZE2) {
		          leftPupilX = LEFT_X + EYE_SIZE2;
		     //Mouse is in eye
		     } else {
		          leftPupilX = leftMouseX;
		     }

		     //Set Y for the pupil
		     //Mouse is above the eye
		     if(leftMouseY < LEFT_Y) {
		          leftPupilY = LEFT_Y + 25;
		     //Mouse is below the eye
		     } else if(leftMouseY > LEFT_Y + EYE_SIZE2) {
		          leftPupilY = LEFT_Y + EYE_SIZE2 -25;
		     //Mouse is in eye
		     } else {
		          leftPupilY = leftMouseY;
		     }
		} // end LeftEye
	  
	  public void setRightEye() {
		     //Set X for the pupil
		     //Mouse is to the left of the eye
		     if(rightMouseX < RIGHT_X) {
		          rightPupilX = RIGHT_X + 25;
		     //Mouse is to the right of the eye
		     } else if(rightMouseX > RIGHT_X + EYE_SIZE2) {
		          rightPupilX = RIGHT_X + EYE_SIZE2;
		     //Mouse is in eye
		     } else {
		          rightPupilX = rightMouseX;
		     }

		     //Set Y for the pupil
		     //Mouse is above the eye
		     if(rightMouseY < RIGHT_Y) {
		          rightPupilY = RIGHT_Y + 25;
		     //Mouse is below the eye
		     } else if(rightMouseY > RIGHT_Y + EYE_SIZE2) {
		          rightPupilY = RIGHT_Y + EYE_SIZE2 - 25;
		     //Mouse is in eye
		     } else {
		          rightPupilY = rightMouseY;
		     }
		} // end RightEye
} // end class
