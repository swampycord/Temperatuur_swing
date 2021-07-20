import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FarToCelsius {

	private static JTextField field;

	public FarToCelsius() {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		JLabel label = new JLabel("Fahrenheit");
		label.setBounds(100,30,100,25);
		panel.add(label);
		
		field = new JTextField();
		field.setBounds(200,30,100,25);
		panel.add(field);
		
		JLabel F = new JLabel("°F");
	    F.setBounds(300,30,100,25);
	    panel.add(F);
	    
	    JButton button = new JButton("Convert");
	    button.setBounds(200,75,100,25);
	    panel.add(button);
	    
	    JLabel inCelsius = new JLabel("Celsius =");
	    inCelsius.setBounds(100, 115, 100, 25);
	    panel.add(inCelsius);
	    
	    JLabel result = new JLabel("");
	    result.setBounds(200, 115, 230, 25);
	    panel.add(result);
	    
	    JLabel formule1 = new JLabel("");
	    formule1.setBounds(200, 138, 230, 25);
	    panel.add(formule1);
		
		panel.setLayout(null);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					String fieldInFahrenheitString = field.getText();
					double fahrenheitInDouble = Double.parseDouble(fieldInFahrenheitString);
					
					double formule = (fahrenheitInDouble-32)*5/9;
					
					result.setText("" +Math.round(formule*10000.00)/10000.00+ "°C");
					formule1.setText("[ ( " +Math.round(fahrenheitInDouble)+ " - 32 ) x 5/9 ]");
					}
					
		});
		
		JButton back = new JButton("Back");
		back.setBounds(370, 370, 100, 25);
		panel.add(back);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new Menu();
			}
		});
		
		
		
	}

	
	
	
}
