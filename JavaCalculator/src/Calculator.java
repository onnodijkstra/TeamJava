import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Gui calc = new Gui();
		calc.pack();
		calc.setLocationRelativeTo(null);
		calc.setTitle("Rekenmachine");  
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(290, 400);
		calc.setResizable( false );
		calc.setVisible(true);
	}
} 