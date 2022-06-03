package Unit_04;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class P17_DisplayGraphics_GUI  extends Canvas{
	
	public static void main(String[]  args) {
		P17_DisplayGraphics_GUI obj=new P17_DisplayGraphics_GUI();
		
	  JFrame f=new JFrame();
	  f.add(obj);
	  f.setSize(500,500);
		f.setVisible(true);
	}
    
	public void paint(Graphics grap) {
	grap.drawOval(25, 140, 40, 70);	
	grap.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
	setForeground(Color.BLUE);
	grap.fillOval(140,140,40,60);
	
	grap.drawArc(10,20,140,150,90,60);
	
	}
	
}
