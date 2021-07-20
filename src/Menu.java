import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {

	
	public Menu(){
		MenuFrame();
	}
	
	public static void MenuFrame() {
		JPanel panel = new JPanel();
		JFrame menu = new JFrame("Menu");
		menu.setSize(500,500);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.add(panel);
		
		JButton fahrenheitToCelsius = new JButton("Klik hier voor het omzetten van Fahrenheit naar Celsius");
		fahrenheitToCelsius.setBounds(30,30,400,25);
		panel.add(fahrenheitToCelsius);
		
		JButton celsiusToFahrenheit = new JButton("Klik hier voor het omzetten van Celsius naar Fahrenheit");
		celsiusToFahrenheit.setBounds(30,80,400,25);
		panel.add(celsiusToFahrenheit);
		
		fahrenheitToCelsius.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menu.dispose();
				new FarToCelsius();
			}
		});
		
		celsiusToFahrenheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menu.dispose();
				new CelToFahrenheit();
			}
		});
		
		panel.setLayout(null);
		menu.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuFrame();
	}

}
