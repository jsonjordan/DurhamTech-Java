/*
 * Theater Revenue 
 * 
 * CSC 251
 * 
 * Jason Jordan
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;

public class TheaterRevenus extends JFrame {
	private JTextField txtPriceAdult;
	private JTextField txtNumAdult;
	private JTextField txtPriceChild;
	private JTextField txtNumChild;
	
	//vars - constant for net percentage
	private final double NET_PERCENTAGE = 0.20;
	
	// constructor
	public TheaterRevenus() {
		SetupFrame();
	} // end constructor
	
	private void SetupFrame() {
		setTitle("Theater Revenue");
		getContentPane().setLayout(null);
		
		JLabel lblPricePerAdult = new JLabel("Price per adult ticket:");
		lblPricePerAdult.setBounds(10, 11, 172, 14);
		getContentPane().add(lblPricePerAdult);
		
		JLabel lblNumberOfAdult = new JLabel("Number of adult tickets sold:");
		lblNumberOfAdult.setBounds(10, 36, 172, 14);
		getContentPane().add(lblNumberOfAdult);
		
		JLabel lblPricePerChild = new JLabel("Price per child ticket:");
		lblPricePerChild.setBounds(10, 61, 172, 14);
		getContentPane().add(lblPricePerChild);
		
		JLabel lblNumberOfChild = new JLabel("Number of child tickets sold:");
		lblNumberOfChild.setBounds(10, 86, 172, 14);
		getContentPane().add(lblNumberOfChild);
		
		txtPriceAdult = new JTextField();
		txtPriceAdult.setBounds(263, 8, 86, 20);
		getContentPane().add(txtPriceAdult);
		txtPriceAdult.setColumns(10);
		
		txtNumAdult = new JTextField();
		txtNumAdult.setBounds(263, 33, 86, 20);
		getContentPane().add(txtNumAdult);
		txtNumAdult.setColumns(10);
		
		txtPriceChild = new JTextField();
		txtPriceChild.setBounds(263, 58, 86, 20);
		getContentPane().add(txtPriceChild);
		txtPriceChild.setColumns(10);
		
		txtNumChild = new JTextField();
		txtNumChild.setBounds(263, 83, 86, 20);
		getContentPane().add(txtNumChild);
		txtNumChild.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(152, 111, 89, 23);
		getContentPane().add(btnCalculate);
		
		JLabel lblGrossRevenueFor = new JLabel("Gross revenue for adult tickets sold:");
		lblGrossRevenueFor.setBounds(10, 154, 231, 14);
		getContentPane().add(lblGrossRevenueFor);
		
		JLabel lblNetRevenueFor = new JLabel("Net revenue for adult tickets sold:");
		lblNetRevenueFor.setBounds(10, 179, 231, 14);
		getContentPane().add(lblNetRevenueFor);
		
		JLabel lblGrossRevenueFor_1 = new JLabel("Gross revenue for child tickets sold:");
		lblGrossRevenueFor_1.setBounds(10, 204, 231, 14);
		getContentPane().add(lblGrossRevenueFor_1);
		
		JLabel lblNetRevenueFor_1 = new JLabel("Net revenue for child tickets sold:");
		lblNetRevenueFor_1.setBounds(10, 229, 231, 14);
		getContentPane().add(lblNetRevenueFor_1);
		
		JLabel lblTotalGrossRevenue = new JLabel("Total gross revenue:");
		lblTotalGrossRevenue.setBounds(10, 254, 231, 14);
		getContentPane().add(lblTotalGrossRevenue);
		
		JLabel lblTotalNetRevenue = new JLabel("Total net revenue:");
		lblTotalNetRevenue.setBounds(10, 279, 231, 14);
		getContentPane().add(lblTotalNetRevenue);
		
		JLabel lblGrossAdult = new JLabel("Gross Adult");
		lblGrossAdult.setBounds(263, 154, 150, 14);
		getContentPane().add(lblGrossAdult);
		
		JLabel lblNetAdult = new JLabel("Net Adult");
		lblNetAdult.setBounds(263, 179, 150, 14);
		getContentPane().add(lblNetAdult);
		
		JLabel lblGrossChild = new JLabel("Gross Child");
		lblGrossChild.setBounds(263, 204, 150, 14);
		getContentPane().add(lblGrossChild);
		
		JLabel lblNetChild = new JLabel("Net Child");
		lblNetChild.setBounds(263, 229, 46, 14);
		getContentPane().add(lblNetChild);
		
		JLabel lblTotalGross = new JLabel("Total Gross");
		lblTotalGross.setBounds(263, 254, 150, 14);
		getContentPane().add(lblTotalGross);
		
		JLabel lblTotalNet = new JLabel("Total Net");
		lblTotalNet.setBounds(263, 279, 150, 14);
		getContentPane().add(lblTotalNet);
		
		// listener event for the calculate button
		btnCalculate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String priceAdult = txtPriceAdult.getText();
				String numAdult = txtNumAdult.getText();
				String priceChild = txtPriceChild.getText();
				String numChild = txtNumChild.getText();
				
				double grossAdult = 0.00;
				double netAdult = 0.00;
				double grossChild = 0.00;
				double netChild = 0.00;
				double totalGross = 0.00;
				double totalNet = 0.00;
				
				// to display two decimal places
				NumberFormat formatter = new DecimalFormat("#0.00");
				
				// Gross revenue for Adults
				grossAdult = Double.parseDouble(priceAdult) * Double.parseDouble(numAdult);
				lblGrossAdult.setText("$" + formatter.format(grossAdult));
				
				// Net revenue for Adults
				netAdult = grossAdult * NET_PERCENTAGE;
				lblNetAdult.setText("$" + formatter.format(netAdult));
				
				// Gross revenue for Child
				grossChild = Double.parseDouble(priceChild) * Double.parseDouble(numChild);
				lblGrossChild.setText("$" + formatter.format(grossChild));
				
				// Net revenue for Child
				netChild = grossChild * NET_PERCENTAGE;
				lblNetChild.setText("$" + formatter.format(netChild));
				
				// Total gross revenue
				totalGross = grossAdult + grossChild;
				lblTotalGross.setText("$" + formatter.format(totalGross));
				
				// Total net revenue
				totalNet = netAdult + netChild;
				lblTotalNet.setText("$" + formatter.format(totalNet));
				
			} // end actionPerformed
			
		});
	} // end SetupFrame
} // end class
