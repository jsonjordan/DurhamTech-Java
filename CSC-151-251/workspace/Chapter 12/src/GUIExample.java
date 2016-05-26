import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GUIExample extends JFrame {
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;
	
	
	// constructor 
	public GUIExample() {
		setupFrame();
	} // end constructor
	
	private void setupFrame() {
		setTitle("Add Two Numbers");
		getContentPane().setLayout(null);
		
		JLabel lblEnterFirstNumber = new JLabel("Enter First Number");
		lblEnterFirstNumber.setBounds(65, 39, 105, 14);
		getContentPane().add(lblEnterFirstNumber);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setBounds(215, 36, 86, 20);
		getContentPane().add(txtFirstNumber);
		txtFirstNumber.setColumns(10);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter Second Number");
		lblEnterSecondNumber.setBounds(65, 86, 120, 14);
		getContentPane().add(lblEnterSecondNumber);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setBounds(215, 83, 86, 20);
		getContentPane().add(txtSecondNumber);
		txtSecondNumber.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(148, 140, 89, 23);
		getContentPane().add(btnCalculate);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(148, 207, 153, 14);
		getContentPane().add(lblAnswer);
		
		// listener event to check for button clicks
		btnCalculate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// get numbers from text fields
				String firstNum = txtFirstNumber.getText();
				String secondNum = txtSecondNumber.getText();
				
				// calculate answer
				int answer = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
				
				// display answer
				lblAnswer.setText("The answer is " + answer);
			}
			
		});
		
		
	} // end setupFrame
	
	
	
	
	
	
	
	
	
	
	
} // end class
