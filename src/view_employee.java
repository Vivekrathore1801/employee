import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class view_employee implements ActionListener{
    JFrame frame;
    JTextField t;
    JLabel l1,l2;
    JButton b1,b2;

    view_employee(){
        frame=new JFrame("View");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        l1=new JLabel(" ");
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("view.jpg"));
        l1.setIcon(img);

        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,40);
        l2.setForeground(Color.BLACK);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        frame.add(l1);


        t=new JTextField("");
        t.setFont(new Font("serif",Font.BOLD,17));
        t.setBounds(240,60,220,30);
        l1.add(t);

        b1=new JButton("Search");
        b1.setBounds(240,150,100,30);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);

        frame.setSize(500,270);
        frame.setLocation(450,250);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            frame.setVisible(false);
           new details_page();
        }
        if(ae.getSource()==b1){
            frame.setVisible(false);
            new print_data(t.getText()); 
        }

    }

    public static void main(String[]ar){
        new view_employee();
    }
}