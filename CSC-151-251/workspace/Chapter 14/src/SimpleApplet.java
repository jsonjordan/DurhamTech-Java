import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.Label;

/*
 * Simple Applet
 */
public class SimpleApplet extends Applet{
	
	public void init(){		// much like a constructor
		// create a label
		Label lab = new Label("My First Applet");
		// set a layout
		setLayout(new FlowLayout());
		// add our label
		add(lab);
		
	}
	
	
	
	
	
	
	

} // end class
