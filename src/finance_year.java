import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;
public class finance_year implements  ActionListener {
	JFrame frame;   
	JTextField t;
    JLabel l1,l2;
    JButton b1,b2;
	finance_year(){    
 
	    frame=new JFrame("Financial_year");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        l1=new JLabel(" ");
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("f_year.jpg"));
        l1.setIcon(img);
        
        l2=new JLabel("Financial Year");
        l2.setVisible(true);
        l2.setBounds(40,60,250,40);
        l2.setForeground(Color.BLACK);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        frame.add(l1);
	    String[] year = {"2020-21", "2021-22", "2022-23", "2023-24", "None"};
       
	    JComboBox<String> cb=new JComboBox<>(year); 
	    t=new JTextField("");
	    cb.setBounds(240,60,220,30);    
//	    frame.add(cb);
	    l1.add(cb);
	    frame.setLayout(null);    
	    frame.setSize(400,500);    
	    frame.setVisible(true);    
	    
	    b1=new JButton("Search");
        b1.setBounds(240,150,100,30);
        b1.addActionListener(this);
        l1.add(b1);
//        frame.add(b1);
        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);
//        frame.add(b2);
	    
	     frame.setSize(500,270);
	        frame.setLocation(450,250);
	        frame.setVisible(true);
	}   
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b2) {
			frame.setVisible(false);
			new view_employee();
		}
		if(e.getSource()==b1) {
			frame.setVisible(false);
			new print_data(t.getText());
		}
		
	}   
	public static void main(String[] args) {    
	   new finance_year();         
	}
	}   
