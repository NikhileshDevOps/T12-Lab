import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

/* 
<applet code="Applet1" width="400" height="200">
</applet>
*/
  
public class Applet1 extends JApplet
{
public void init()
{
add(new MyClass()); 		//Adding JPanel to our Swing Applet.
}
}


class MyClass extends JPanel implements ActionListener
{
JButton north, south, east, west;
String str;

MyClass()
{

north = new JButton("NORTH");
south = new JButton("SOUTH");
east = new JButton("EAST");
west = new JButton("WEST");
str ="";

setLayout(new BorderLayout());

add(north, BorderLayout.NORTH); 	//Adds button named north in the NORTH direction
add(south, BorderLayout.SOUTH);		//Adds button named south in the SOUTH direction
add(east, BorderLayout.EAST);		//Adds button named east in the EAST direction
add(west, BorderLayout.WEST);		//Adds button named west in the WEST direction


north.addActionListener(this);		//Registering MyClass to listen to event when button named north is pressed
south.addActionListener(this);
east.addActionListener(this);
west.addActionListener(this);

}



public void actionPerformed(ActionEvent ae) 	//listening to button click events 
{
if(ae.getActionCommand().equals("NORTH"))		//when NORTH button is pressed
{
str="Are you going North?";
repaint();
}

if(ae.getActionCommand().equals("SOUTH"))		//when SOUTH button is pressed
{
str="Are you going South?";
repaint();
}

if(ae.getActionCommand().equals("EAST"))		//when EAST button is pressed
{
str="Are you going East?";
repaint();
}

if(ae.getActionCommand().equals("WEST"))		//when WEST button is pressed
{
str="Are you going West?";
repaint();
}

}


public void paintComponent(Graphics g)
{
super.paintComponent(g);
System.out.println("hello");
System.out.println(str);
g.drawString(str, 150, 150);
}

}