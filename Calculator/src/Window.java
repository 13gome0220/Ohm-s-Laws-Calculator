/*	Ohm Laws Calculator 2.0
 * 	By Gilbert Gomez
 * 		6/6/2015
 * 	This was his first GUI Program.
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Window {
	// Setting up the Frame and Components
	private JFrame title;
	private JTextField box1;
	private JTextField box2;
	private JLabel boxLabel2;
	private JButton resistanceButton;
	private JButton ampsButton;
	private JButton powerButton;
	private JButton helpButton;
	private JButton aboutButton;

	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					// Making the Frame(Window) visible.
					Window window = new Window();
					window.title.setVisible(true);
				}
				// just incase I get a Stack Trace error upon launch.
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public Window() 
	{
		// Initializing the Window of the program.
		initialize();
	}

	
	private void initialize() 
	{
		// 	Initializing the components of the Window.
		
		//	Creating the Frame.
		title = new JFrame();
		title.setTitle("Ohm Laws Calculator");
		title.setBounds(100, 100, 450, 300);
		title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creating a Text Field Box.
		box1 = new JTextField();
		box1.setBounds(76, 87, 86, 20);
		box1.setColumns(10);
		
		// Creating another Text Field Box.
		box2 = new JTextField();
		box2.setBounds(260, 87, 86, 20);
		box2.setColumns(10);
		
		// Making a button to calculate Voltage.
		JButton voltageButton = new JButton("Calculate Voltage");
		voltageButton.setBounds(134, 142, 177, 23);
		
		// What happens when the user press the Voltage button.
		voltageButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				//	Voltage Formulation
				double I = Double.parseDouble(box1.getText());
				double R = Double.parseDouble(box2.getText());
				JOptionPane.showMessageDialog(title, "Volts: " + (I*R));
			}
		});
		// The Frame will not have a specific layout.
		title.getContentPane().setLayout(null);
		// Adding the Voltage button to the Frame.
		title.getContentPane().add(voltageButton);
		// Adding the first Text Field to the Frame.
		title.getContentPane().add(box1);
		// Adding the second Text Field to the Frame.
		title.getContentPane().add(box2);
		
		// Creating the first Label for the Text Field.
		JLabel boxLabel = new JLabel("Volts,Ohms,Amps,Watts");
		boxLabel.setBounds(57, 26, 145, 50);
		
		// Adding the Label to the Frame.
		title.getContentPane().add(boxLabel);
		
		// Creating the second Label for the second Text Field.
		boxLabel2 = new JLabel("Volts,Ohms,Amps,Watts");
		boxLabel2.setBounds(254, 26, 145, 50);
		// Adding the second Label to the Frame.
		title.getContentPane().add(boxLabel2);
		
		// Creating a button for calculating Resistance.
		resistanceButton = new JButton("Calculate Resistance");
		
		// What happens when the user presses the Resistance button.
		resistanceButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				//	Resistance Formulation
				double E = Double.parseDouble(box1.getText());
				double I = Double.parseDouble(box2.getText());
				JOptionPane.showMessageDialog(title, "Ohms: " + (E/I));
			}
		});
		
		// Positioning the Resistance button on the Frame.
		resistanceButton.setBounds(134, 176, 177, 23);
		
		// Adding the Resistance button the frame.
		title.getContentPane().add(resistanceButton);
		
		// Creating the button for calculating Amps (Current).
		ampsButton = new JButton("Calculate Current");
		ampsButton.setToolTipText("");
		
		// What happens when the user presses the Amp Button.
		ampsButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//	Amp Formulation
				double P = Double.parseDouble(box1.getText());
				double E = Double.parseDouble(box2.getText());
				JOptionPane.showMessageDialog(title, "Amps: " + (P/E));
			}
		});
		
		// Positioning the Amp Button on the frame.
		ampsButton.setBounds(134, 210, 177, 23);
		
		// Adding the Amp Button on the frame.
		title.getContentPane().add(ampsButton);
		
		// Creating a button for calculating Watts (Power).
		powerButton = new JButton("Calculate Power");
		
		// What happens when the user presses the Power Button.
		powerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//	Power Formulation
				double E = Double.parseDouble(box1.getText());
				double I = Double.parseDouble(box2.getText());
				JOptionPane.showMessageDialog(title, "Watts: " + (E*I));
			}
		});
		
		// Positioning the Power Button on the frame.
		powerButton.setBounds(134, 239, 177, 23);
		
		// Adding the Power Button on the frame.
		title.getContentPane().add(powerButton);
		
		// Creating a Help button.
		helpButton = new JButton("Help");
		
		// What happens when a user presses the Help button.
		helpButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(title, "For Voltage(Volts) you need the amount of Amps and Ohms. \n"
						+ "For Resistance(Ohm) you need the amount of Volts and Amps. \n"
						+ "For Current(Amps) you need the amount of Watts and Volts. \n"
						+ "For Power(Wattage) you need the amount of Volts and Amps.");	
			}
		});
		
		// Positioning the Help button on the frame.
		helpButton.setBounds(172, 11, 89, 23);
		
		// Adding the Help button on the frame.
		title.getContentPane().add(helpButton);
		
		
		aboutButton = new JButton("About");
		
		aboutButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(title, "Gilbert Gomez developed this calculator on June 6th 2015. \n"
						+ "Made to help Calculate electricity.");
			}
		});
		aboutButton.setBounds(0, 239, 89, 23);
		title.getContentPane().add(aboutButton);
		
	}
}
