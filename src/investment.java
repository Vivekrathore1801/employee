
import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;


public class investment implements ActionListener{
    JFrame frame;
    JLabel box,title,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23,label24;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24;
    JButton b1,b2;

    
    investment(){
        frame = new JFrame("Add Employee");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        box = new JLabel();
        box.setBounds(0,0,1280,750);
        box.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("add.jpg"));
        box.setIcon(img);

        title = new JLabel("New Employee Details");
        title.setBounds(480,30,500,50);
        title.setFont(new Font("serif",Font.ITALIC,25));
        title.setForeground(Color.black);
        box.add(title);
        frame.add(box);

 
        label1 = new JLabel("Option");
        label1.setBounds(50,150,100,30);
        label1.setFont(new Font("serif",Font.BOLD,20));
        box.add(label1);

//        t1=new JTextField();
        String[] options = {"A","B"};
        JComboBox<String> cb1 = new JComboBox<>(options);
        cb1.setFont(new Font("serif",Font.BOLD,15));
        cb1.setBounds(200,150,150,30);
        box.add(cb1);
        frame.setLayout(null);    
	    frame.setSize(400,500);    
	    frame.setVisible(true);

        label2 = new JLabel("Rent_Receipt");
        label2.setBounds(400,150,200,30);
        label2.setFont(new Font("serif",Font.BOLD,20));
        box.add(label2);

        t2=new JTextField();
        t2.setFont(new Font("serif",Font.BOLD,15));
        t2.setBounds(600,150,150,30);
        box.add(t2);
        
   	 label3 = new JLabel("Owner Name");
     label3.setBounds(50,200,120,30);
     label3.setFont(new Font("serif",Font.BOLD,20));
     box.add(label3);

     t3=new JTextField();
     t3.setFont(new Font("serif",Font.BOLD,15));
     t3.setBounds(200,200,150,30);
     box.add(t3);
     
     label4 = new JLabel("Owner PAN");  
     label4.setBounds(400,200,200,30);
     label4.setFont(new Font("serif",Font.BOLD,20));
     box.add(label4);

     t4=new JTextField();
     t4.setFont(new Font("serif",Font.BOLD,15));
     t4.setBounds(600,200,150,30);
     box.add(t4);
        
      
        label5 = new JLabel("LIC");  
        label5.setBounds(400,250,200,30);
        label5.setFont(new Font("serif",Font.BOLD,20));
        box.add(label5);

        t5=new JTextField();
        t5.setFont(new Font("serif",Font.BOLD,15));
        t5.setBounds(600,250,150,30);
        box.add(t5);

        label6 = new JLabel("NSC");  
        label6.setBounds(800,300,150,30);
        label6.setFont(new Font("serif",Font.BOLD,20));
        box.add(label6);

        t6=new JTextField();
        t6.setFont(new Font("serif",Font.BOLD,15));
        t6.setBounds(950,300,150,30);
        box.add(t6);

        
        label7 = new JLabel("NSCI");  
        label7.setBounds(400,300,200,30);
        label7.setFont(new Font("serif",Font.BOLD,20));
        box.add(label7);

        t7=new JTextField();
        t7.setFont(new Font("serif",Font.BOLD,15));
        t7.setBounds(600,300,150,30);
        box.add(t7);


        label8 = new JLabel("ULIP");
        label8.setBounds(50,250,100,30);
        label8.setFont(new Font("serif",Font.BOLD,20));
        box.add(label8);

        t8=new JTextField();
        t8.setFont(new Font("serif",Font.BOLD,15));
        t8.setBounds(200,250,150,30);
        box.add(t8);

        label9 = new JLabel("PPF");
        label9.setBounds(400,350,100,30);
        label9.setFont(new Font("serif",Font.BOLD,20));
        box.add(label9);

        t9=new JTextField();
        t9.setFont(new Font("serif",Font.BOLD,15));
        t9.setBounds(600,350,150,30);
        box.add(t9);

        label10 = new JLabel("Tution_fee");
        label10.setBounds(50,300,100,30);
        label10.setFont(new Font("serif",Font.BOLD,20));
        box.add(label10);

        t10=new JTextField();
        t10.setFont(new Font("serif",Font.BOLD,15));
        t10.setBounds(200,300,150,30);
        box.add(t10);

        label11 = new JLabel("Repay principal");
        label11.setBounds(400,400,140,30);
        label11.setFont(new Font("serif",Font.BOLD,20));    
        box.add(label11);

        t11=new JTextField();
        t11.setFont(new Font("serif",Font.BOLD,15));
        t11.setBounds(600,400,150,30);
        box.add(t11);

        label12 = new JLabel("Repay Interest");
        label12.setBounds(50,350,130,30);
        label12.setFont(new Font("serif",Font.BOLD,20));
        box.add(label12);

        t12=new JTextField();
        t12.setFont(new Font("serif",Font.BOLD,15));
        t12.setBounds(200,350,150,30);
        box.add(t12);


        label13 = new JLabel("Section80_D");
        label13.setBounds(400,450,120,50);
        label13.setFont(new Font("serif",Font.BOLD,20));
        box.add(label13);

        t13=new JTextField();
        t13.setFont(new Font("serif",Font.BOLD,15));
        t13.setBounds(600,450,150,30);
        box.add(t13);

        label14 = new JLabel("Section80_DD");
        label14.setBounds(50,400,150,30);
        label14.setFont(new Font("serif",Font.BOLD,20));
        box.add(label14);

        t14=new JTextField();   
        t14.setFont(new Font("serif",Font.BOLD,15));
        t14.setBounds(200,400,150,30);
        box.add(t14);
        
        label15 = new JLabel("Section80_E");
        label15.setBounds(400,500,120,40);
        label15.setFont(new Font("serif",Font.BOLD,20));
        box.add(label15);

        t15=new JTextField();
        t15.setFont(new Font("serif",Font.BOLD,15));
        t15.setBounds(600,500,150,30);
        box.add(t15);

        label16 = new JLabel("Section80_CCD");
        label16.setBounds(50,450,150,30);
        label16.setFont(new Font("serif",Font.BOLD,20));
        box.add(label16);

        t16=new JTextField();   
        t16.setFont(new Font("serif",Font.BOLD,15));
        t16.setBounds(200,450,150,30);
        box.add(t16);
        
        label17 = new JLabel("Section80_G");
        label17.setBounds(800,350,120,30);
        label17.setFont(new Font("serif",Font.BOLD,20));
        box.add(label17);

        t17=new JTextField();
        t17.setFont(new Font("serif",Font.BOLD,15));
        t17.setBounds(950,350,150,30);
        box.add(t17);

        label18 = new JLabel("Oth_INC");
        label18.setBounds(50,500,150,30);
        label18.setFont(new Font("serif",Font.BOLD,20));
        box.add(label18);

        t18=new JTextField();   
        t18.setFont(new Font("serif",Font.BOLD,15));
        t18.setBounds(200,500,150,30);
        box.add(t18);
        
        label19 = new JLabel("Freeze");
        label19.setBounds(800,150,120,30);
        label19.setFont(new Font("serif",Font.BOLD,20));
        box.add(label19);
        

        String[] option = {"Y","N"};
        JComboBox<String> cb2 = new JComboBox<>(option);
        cb2.setFont(new Font("serif",Font.BOLD,15));
        cb2.setBounds(950,150,150,30);
        box.add(cb2);
        frame.setLayout(null);    
	    frame.setSize(400,500);    
	    frame.setVisible(true);
	    
	    label20 = new JLabel("Loan Agency");
        label20.setBounds(800,200,150,30);
        label20.setFont(new Font("serif",Font.BOLD,20));
        box.add(label20);

        t19=new JTextField();   
        t19.setFont(new Font("serif",Font.BOLD,15));
        t19.setBounds(950,200,150,30);
        box.add(t19);
        
        label21 = new JLabel("L_Agency PAN");
        label21.setBounds(800,250,180,30);
        label21.setFont(new Font("serif",Font.BOLD,20));
        box.add(label21);

        t20=new JTextField();   
        t20.setFont(new Font("serif",Font.BOLD,15));
        t20.setBounds(950,250,150,30);
        box.add(t20);
        
        
        label22 = new JLabel("Emp_id");
        label22.setBounds(800,400,180,30);
        label22.setFont(new Font("serif",Font.BOLD,20));
        box.add(label22);

        t21=new JTextField();   
        t21.setFont(new Font("serif",Font.BOLD,15));
        t21.setBounds(950,400,150,30);
        box.add(t21);
        
        label23 = new JLabel("F_year");
        label23.setBounds(800,450,180,30);
        label23.setFont(new Font("serif",Font.BOLD,20));
        box.add(label23);

        t22=new JTextField();   
        t22.setFont(new Font("serif",Font.BOLD,15));
        t22.setBounds(950,450,150,30);
        box.add(t22);
        
   
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(400,600,150,40);
        box.add(b1);

        b2=new JButton("Cancel");   
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(600,600,150,40);
        box.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        frame.setVisible(true);
        frame.setSize(1280,750);
        frame.setLocation(0,0);
    }
//     
    
    @Override
	public void actionPerformed(ActionEvent ae) {
	
//		String a  = t1.getText();
        String bb = t2.getText();
        String c  = t3.getText();
        String d  = t4.getText();
        String e  = t5.getText();
        String ff = t6.getText();
        String g  = t7.getText();
        String h  = t8.getText();
        String i  = t9.getText();
        String j  = t10.getText();
        String k  = t11.getText();
        String l  = t12.getText();
        String m  = t13.getText();
        String n  = t14.getText();
        String o  = t15.getText();
        String p  = t16.getText();
        String qq  = t17.getText();
        String r  = t18.getText();
        String s  = t19.getText();
        String t  = t20.getText();
        String u  = t21.getText();
        String v  = t22.getText();
//        String w  = t23.getText();
//        String x  = t24.getText();
        
       
        if(ae.getSource() == b1){
            try{
                conn cc = new conn();
                String q = "insert into investment values('"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"','"+o+"','"+p+"','"+qq+"','"+r+"','"+s+"','"+t+"','"+u+"','"+v+"')";
                cc.st.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                frame.setVisible(false); // close current frame.
                new details_page(); // open details page
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b2){
            frame.setVisible(false);
            new finance_year();
        }else if(ae.getSource() == b2){
            frame.setVisible(false);
            new details_page();
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
		
		
	}
	

	public static void main(String[] args) {
		new investment();
	}

}
