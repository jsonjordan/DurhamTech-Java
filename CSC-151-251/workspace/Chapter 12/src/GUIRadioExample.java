import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class GUIRadioExample extends JFrame {
	private JTextField txtDollars;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	//vars - constants for rate factor
	private final double EURO_FACTOR = 1.09;
	private final double YEN_FACTOR = 0.0083;
	
	// constructor
	public GUIRadioExample() {
		setupFrame();
	} // end constructor
	
	private void setupFrame(){
		setTitle("Currency Converter");
		getContentPane().setLayout(null);
		
		JLabel lblEnterDollars = new JLabel("Enter Dollars");
		lblEnterDollars.setBounds(28, 30, 126, 14);
		getContentPane().add(lblEnterDollars);
		
		txtDollars = new JTextField();
		txtDollars.setBounds(263, 27, 86, 20);
		getContentPane().add(txtDollars);
		txtDollars.setColumns(10);
		
		JRadioButton rdbtnEuro = new JRadioButton("Euro");
		rdbtnEuro.setSelected(true);
		buttonGroup.add(rdbtnEuro);
		rdbtnEuro.setBounds(45, 65, 109, 23);
		getContentPane().add(rdbtnEuro);
		
		JRadioButton rdbtnYen = new JRadioButton("Yen");
		buttonGroup.add(rdbtnYen);
		rdbtnYen.setBounds(177, 65, 109, 23);
		getContentPane().add(rdbtnYen);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(177, 131, 89, 23);
		getContentPane().add(btnConvert);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(177, 202, 203, 14);
		getContentPane().add(lblAnswer);
		
		// listener event for the convert button
		btnConvert.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String dollars = txtDollars.getText();
				double answer = 0.00;
				
				if (rdbtnEuro.isSelected()){
					answer = Double.parseDouble(dollars) / EURO_FACTOR;
				} // end if
				else {
					answer = Double.parseDouble(dollars) / YEN_FACTOR;
				} // end else
				
				// display two decimal places
				NumberFormat formatter = new DecimalFormat("#0.00");
				
				// display answer
				lblAnswer.setText("Answer is " + formatter.format(answer));
				// or
				JOptionPane.showMessageDialog(null, "Answer is " + formatter.format(answer));
			} // end actionPerformed
			
			
		});
		
	}// end setupFrame
	
	
}// end class
