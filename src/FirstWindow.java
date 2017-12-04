import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame{

	public FirstWindow() {
		super("I'm cool, this is Faolan!");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		
		JButton b1 = new JButton("button 1");
		b1.setBackground(Color.RED);
		p1.add(b1);
		
		JButton b2 = new JButton("button 1");
		b2.setBackground(Color.YELLOW);
		p1.add(b2);
		
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.DARK_GRAY);
		
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.GREEN);
		
		
		JPanel p5 = new JPanel();
		p5.setBackground(Color.MAGENTA);
		
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15 ,15);
		
		
		
		
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.EAST);
		add(p5, BorderLayout.WEST);
		
		setVisible(true);
	}//end of constructor
	
	
	
}//end of class
