package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_swing_in_java {

	public static void main(String args[]) {
		SampleSwingCode obj=new SampleSwingCode();
	}
}
class SampleSwingCode extends JFrame{
	
	JRadioButton r1;
	JRadioButton r2;
	JCheckBox c1;
	JCheckBox c2;
	JList l;
	JComboBox j1;
	JScrollBar sc;
	
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JLabel l1;
	JTextArea A1;
	
	 SampleSwingCode() {
		 t1=new JTextField(20);
		 t2=new JTextField(20);
		 b1= new JButton("sum");
		 b2= new JButton("sub");
		 l1=new JLabel("result");
		 A1=new JTextArea(10,20);
		 r1= new JRadioButton("Male");
		 r2=new JRadioButton("Female");
		 c1=new JCheckBox("Dancer");
		 c2=new JCheckBox("singer");
		 
		 String week[]= {"Mon","Tue","Wed","Thu","Fri","Sat"};
		 j1=new JComboBox(week);
		 ActionListener al=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a1=Integer.parseInt(t1.getText());
				int a2=Integer.parseInt(t2.getText());
				Integer sum=a1+a2;
				l1.setText(sum.toString());
				
				if(e.getSource()==b2) {
					Integer sub=a1-a2;
					l1.setText(sub.toString());
				}
				
				if(e.getSource()==r1) {
					l1.setText("Male");
				}else if(e.getSource()==r2) {
					l1.setText("female");
				}
			}
		};
		
		add(A1);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(j1);
		ButtonGroup bd=new ButtonGroup();
		bd.add(r1);
		bd.add(r2);
		b1.addActionListener(al);
		b2.addActionListener(al);
		add(l1);
		setLayout(new FlowLayout());
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	 
}
