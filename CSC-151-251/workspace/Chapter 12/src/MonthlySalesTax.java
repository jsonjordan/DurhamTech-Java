/*
 * CSC 251
 * 
 * Jason Jordan
 * 
 * Monthly Sales Tax GUI
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;

public class MonthlySalesTax extends JFrame {
	private JTextField txtTotalSales;
	
	//vars - constants for rate factor
		private final double COUNTY_TAX = 0.02;
		private final double STATE_TAX = 0.04;
	
	// constructor
	public MonthlySalesTax() {
		
		setupFrame();
	}
	
	private void setupFrame(){
		setTitle("Monthly Sales Tax");
		getContentPane().setLayout(null);
		
		JLabel lblTotalSales = new JLabel("Total Sales for the Month");
		lblTotalSales.setBounds(33, 23, 259, 14);
		getContentPane().add(lblTotalSales);
		
		txtTotalSales = new JTextField();
		txtTotalSales.setBounds(322, 20, 86, 20);
		getContentPane().add(txtTotalSales);
		txtTotalSales.setColumns(10);
		
		JButton btnCalculateTax = new JButton("Calculate Tax");
		btnCalculateTax.setBounds(161, 48, 130, 23);
		getContentPane().add(btnCalculateTax);
		
		JLabel lblCountySalesTax = new JLabel("County Sales Tax:");
		lblCountySalesTax.setBounds(33, 120, 259, 14);
		getContentPane().add(lblCountySalesTax);
		
		JLabel lblStateSalesTax = new JLabel("State Sales Tax:");
		lblStateSalesTax.setBounds(33, 159, 259, 14);
		getContentPane().add(lblStateSalesTax);
		
		JLabel lblTotalSalesTax = new JLabel("Total Sales Tax:");
		lblTotalSalesTax.setBounds(33, 201, 259, 14);
		getContentPane().add(lblTotalSalesTax);
		
		JLabel lblCounty = new JLabel("County");
		lblCounty.setBounds(322, 120, 86, 14);
		getContentPane().add(lblCounty);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(322, 159, 86, 14);
		getContentPane().add(lblState);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(322, 201, 86, 14);
		getContentPane().add(lblTotal);
		
		// listener event for the calculate button
		btnCalculateTax.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String totalSales = txtTotalSales.getText();
				double countyTax = 0.00;
				double stateTax = 0.00;
				double totalTax = 0.00;
				
				countyTax = Double.parseDouble(totalSales) * COUNTY_TAX;
				stateTax = Double.parseDouble(totalSales) * STATE_TAX;
				totalTax = countyTax + stateTax;
				
				// display two decimal places
				NumberFormat formatter = new DecimalFormat("#0.00");
				
				// display tax information
				lblCounty.setText("$" + formatter.format(countyTax));
				lblState.setText("$" + formatter.format(stateTax));
				lblTotal.setText("$" + formatter.format(totalTax));
				
			} // end actionPerformed
			
			
		});
	} // setupFrame
	
} // end class
