import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *  Temperature Conversion Applet
 */
public class TempConverter extends Applet{

	private Panel fPanel;
	private Panel cPanel;
	private Panel butPanel;
	
	private TextField fahrText;
	private TextField celText;
	
	public void init(){
		// create fPanel
		fPanel = new Panel();
		
		// create fahrenheit label
		Label fahrLab = new Label("Enter fahrenheit:   ");
		
		// create text field
		fahrText = new TextField(10);
		
		// add object
		fPanel.add(fahrLab);
		fPanel.add(fahrText);
		add(fPanel);
		////////////////////////////////////////////////////////////////////
		
		// create cPanel
		cPanel = new Panel();

		// create cel label
		Label celLab = new Label("Celsius:   ");

		// create text field
		celText = new TextField(10);
		celText.setEditable(false);

		// add object
		cPanel.add(celLab);
		cPanel.add(celText);
		add(cPanel);
		////////////////////////////////////////////////////////////////////
		
		// create butPanel
		butPanel = new Panel();
		// create button
		Button convButton = new Button("Convert");
		
		// add action listener
		convButton.addActionListener(new ButtonListener());
		
		// add objects
		butPanel.add(convButton);
		add(butPanel);
		
		
		
	} // end init
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			double fTemp, cTemp;
			fTemp = Double.parseDouble(fahrText.getText());
			cTemp = (5.0/9.0) * (fTemp - 32);
			
			//display answer
			celText.setText(String.format("%.1f", cTemp));
			
			
			
		} // end ButtonListener
		
		
	} // end ButtonListener class
	
	
} // end class
