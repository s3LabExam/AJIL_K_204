package applet;
import java.awt.*;
import java.awt.event.*;
public class maxNo implements ActionListener
{
	Button b1;
    TextField t1,t2,t3;
    Label l1,l2,l3,l4;
    Frame f;
	maxNo()
	{
		f = new Frame("-----Largest of 3 numbers-----");
        l1 = new Label("Enter First Number :");
        l1.setBounds(5, 50, 150, 30);
        f.add(l1);
        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);

        t2 = new TextField();
        t2.setBounds(200, 100, 150, 30);
        f.add(t2);

        l2 = new Label("Enter Second Number :");
        l2.setBounds(5, 100, 150, 30);
        f.add(l2);

        t3 = new TextField();
        t3.setBounds(200, 150, 150, 30);
        f.add(t3);

        l3 = new Label("Enter Third Number :");
        l3.setBounds(5, 150, 150, 30);
        f.add(l3);
        
        l4 = new Label("Result :");
        l4.setBounds(90, 200, 150, 30);
        f.add(l4);

        b1 = new Button("Check");
        b1.setBounds(90, 250, 100, 30);
        f.add(b1);

        b1.addActionListener(this);

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());
        int d = 0;

        if (e.getSource().equals(b1))
        {
            if (a>b && a>c)
            {
            	l4.setText(String.valueOf("Largest :    " + a));
            }
            else if(b>a && b>c)
            {
            	l4.setText(String.valueOf("Largest :    " + b));
            }
            else
            {
            	l4.setText(String.valueOf("Largest :    " + c));
            }
        }

    }

    public static void main(String args[])
    {
        maxNo m = new maxNo();
    }
}
