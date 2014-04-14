package Tut38;
import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;

public class bb extends JFrame {

	bb(){
		
		setTitle("kiuu");
		setBounds(0, 0, 200, 400);
		setVisible(true);
		
		Container cont = getContentPane();
		FlowLayout FL = new FlowLayout();
		
		cont.setLayout(FL);
		
		JLabel tex= new JLabel("holi");
		JButton b= new JButton("soy un botonsito");
		cont.add(tex);
		cont.add(b);
		
	}
	

	
}
