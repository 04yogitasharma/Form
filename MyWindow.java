import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyWindow  extends JFrame{
	
	private JLabel heading;
	Font font=new Font("",Font.BOLD,30);
	
	private JPanel mainPanel;
	private JLabel nameLabel,passwordLabel;
	private JTextField nameField;
	private JPasswordField passwordField;
	private JButton button1,button2;
	
	public MyWindow() {
			
		System.out.println("this is constructor.....");
		setTitle("My first form");
		setSize(600,400);
		setLocation(300,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.createGUI();
		
		
		setVisible(true);
		
	}
	
	public void createGUI() {
		this.setLayout(new BorderLayout());
		
		heading=new JLabel("My first form");
		heading.setFont(font);
		heading.setHorizontalAlignment(JLabel.CENTER);
		this.add(heading,BorderLayout.NORTH);
		
		
		
		mainPanel=new JPanel();
		mainPanel.setLayout(new GridLayout(3,2));
		
		
		nameLabel=new JLabel("Enter name");
		nameLabel.setFont(font);
		
		passwordLabel=new JLabel("Enter password :");
		passwordLabel.setFont(font);
		
		nameField =new JTextField();
		nameField.setFont(font);
		
		passwordField=new JPasswordField();
		passwordField.setFont(font);
		
		
		button1=new JButton("Submit");
		button1.setFont(font);
		
		button2=new JButton("Reset");
		button2.setFont(font);
		
		
		mainPanel.add(nameLabel);
		mainPanel.add(nameField);
		
		mainPanel.add(passwordLabel);
		mainPanel.add(passwordField);
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		
		this.add(mainPanel,BorderLayout.CENTER);
		
	}
}
