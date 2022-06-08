package applet;
import java.applet.*;
import java.awt.*;
public class drawShapes extends Applet
{
	public void paint(Graphics g)
	{	
		g.setColor(Color.green);
		g.fillRect(25,100,100,200);  
		g.setColor(Color.red);
		g.drawLine(25,25,150,50); 
		g.setColor(Color.magenta);
		g.fillOval(50,25,250,250); 
	}
}
