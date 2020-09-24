import javax.swing.*;
import java.awt.*;
/**
*The StartHere class simply contains the main
*class and uses the GUI constructor in order to create a gui
*
*@author Joe Graham
*/
public class StartHere{
	public static void main (String args[]){
		GUI gui = new GUI();
		gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(600,600);
		
	}
}