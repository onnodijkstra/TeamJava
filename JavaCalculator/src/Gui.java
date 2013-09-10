import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Gui extends JFrame {
	private JButton jbtNum1, jbtNum2, jbtNum3, jbtNum4,jbtNum5,jbtNum6,jbtNum7,jbtNum8,jbtNum9,jbtNum0,jbtMC, jbtMR, jbtMS, jbtMPlus, jbtMMin, jbtBackspace, jbtCE, jbtC, jbtPlusMin, jbtSqrt, jbtDiv, jbtPerc, jbtMult, jbt1x, jbtMin, jbtEq, jbtDec, jbtPlus;
	private JTextField jtfResult;

	public Gui() {
		GridBagLayout m = new GridBagLayout();
		Container c = (Container)getContentPane();
		c.setLayout(m);
		
		GridBagConstraints con;
		con = new GridBagConstraints();  
		con.weighty = 1;
		con.anchor = GridBagConstraints.CENTER;
		con.fill = GridBagConstraints.BOTH;
		con.insets = new Insets(3,3,3,3);

		// Outcome  
		con.gridy = 0; con.gridx = 0;
		con.gridwidth = 5; con.gridheight = 1;

		jtfResult = new JTextField();
		jtfResult.setHorizontalAlignment(JTextField.RIGHT);
		jtfResult.setEditable(true);
		jtfResult.setMinimumSize( jtfResult.getPreferredSize() );
		jtfResult.setMaximumSize( jtfResult.getPreferredSize() );
		jtfResult.setColumns(10);
		jtfResult.disable();
		Font font1 = new Font("SansSerif", Font.BOLD, 24);
		jtfResult.setFont(font1);
		m.setConstraints(jtfResult, con);
		c.add(jtfResult);

		/*
		 * Row 1 (memory functions)
		 */        
		con.gridy = 1; 
		con.gridwidth = 1; con.gridheight = 1; 

		// MC
		con.gridx = 0;
		jbtMC = new JButton("MC");
		m.setConstraints(jbtMC, con);
		c.add(jbtMC);

		// MR
		con.gridx = 1;
		jbtMR = new JButton("MR");
		m.setConstraints(jbtMR, con);
		c.add(jbtMR);

		// MS
		con.gridx = 2;
		jbtMS = new JButton("MS");
		m.setConstraints(jbtMS, con);
		c.add(jbtMS);

		// M+
		con.gridx = 3;
		jbtMPlus = new JButton("M+");
		m.setConstraints(jbtMPlus, con);
		c.add(jbtMPlus);

		// M-
		con.gridx = 4;
		jbtMMin = new JButton("M-");
		m.setConstraints(jbtMMin, con);
		c.add(jbtMMin);

		/*
		 * Row 2
		 */
		con.gridy = 2; 
		con.gridwidth = 1; con.gridheight = 1; 

		// Backspace
		con.gridx = 0;
		jbtBackspace = new JButton("<-");
		m.setConstraints(jbtBackspace, con);
		c.add(jbtBackspace);

		// CE
		con.gridx = 1;
		jbtCE = new JButton("CE");
		m.setConstraints(jbtCE, con);
		c.add(jbtCE);

		// C
		con.gridx = 2;
		jbtC = new JButton("C");
		m.setConstraints(jbtC, con);
		c.add(jbtC);

		// +/-
		con.gridx = 3;
		jbtPlusMin = new JButton("\u00B1");
		m.setConstraints(jbtPlusMin, con);
		c.add(jbtPlusMin);

		// sqrt
		con.gridx = 4;
		jbtSqrt = new JButton("\u221a");
		m.setConstraints(jbtSqrt, con);
		c.add(jbtSqrt);

		/*
		 * Row 3
		 */
		con.gridy = 3; 
		con.gridwidth = 1; con.gridheight = 1; 

		// 7
		con.gridx = 0;
		jbtNum7 = new JButton("7");
		m.setConstraints(jbtNum7, con);
		c.add(jbtNum7);

		// 8
		con.gridx = 1;
		jbtNum8 = new JButton("8");
		m.setConstraints(jbtNum8, con);
		c.add(jbtNum8);

		// 9
		con.gridx = 2;
		jbtNum9 = new JButton("9");
		m.setConstraints(jbtNum9, con);
		c.add(jbtNum9);

		// div
		con.gridx = 3;
		jbtDiv = new JButton("/");
		m.setConstraints(jbtDiv, con);
		c.add(jbtDiv);

		// %
		con.gridx = 4;
		jbtPerc = new JButton("%");
		m.setConstraints(jbtPerc, con);
		c.add(jbtPerc);

		/*
		 * Row 4
		 */
		con.gridy = 4; 
		con.gridwidth = 1; con.gridheight = 1; 

		// 4
		con.gridx = 0;
		jbtNum4 = new JButton("4");
		m.setConstraints(jbtNum4, con);
		c.add(jbtNum4);

		// 5
		con.gridx = 1;
		jbtNum5 = new JButton("5");
		m.setConstraints(jbtNum5, con);
		c.add(jbtNum5);

		// 6
		con.gridx = 2;
		jbtNum6 = new JButton("6");
		m.setConstraints(jbtNum6, con);
		c.add(jbtNum6);

		// Multiply
		con.gridx = 3;
		jbtMult = new JButton("*");
		m.setConstraints(jbtMult, con);
		c.add(jbtMult);

		// 1/x
		con.gridx = 4;
		jbt1x = new JButton("1/x");
		m.setConstraints(jbt1x, con);
		c.add(jbt1x);

		/*
		 * Row 5
		 */
		con.gridy = 5; 
		con.gridwidth = 1; con.gridheight = 1; 

		// 1
		con.gridx = 0;
		jbtNum1 = new JButton("1");
		m.setConstraints(jbtNum1, con);
		c.add(jbtNum1);

		// 2
		con.gridx = 1;
		jbtNum2 = new JButton("2");
		m.setConstraints(jbtNum2, con);
		c.add(jbtNum2);

		// 3
		con.gridx = 2;
		jbtNum3 = new JButton("3");
		m.setConstraints(jbtNum3, con);
		c.add(jbtNum3);

		// -
		con.gridx = 3;
		jbtMin = new JButton("-");
		m.setConstraints(jbtMin, con);
		c.add(jbtMin);

		// =
		con.gridx = 4;
		con.gridwidth = 1; con.gridheight = 2; 
		jbtEq = new JButton("=");
		m.setConstraints(jbtEq, con);
		c.add(jbtEq);

		/*
		 * Row 6
		 */
		con.gridy = 6; 

		// 0
		con.gridx = 0;
		con.gridwidth = 2; con.gridheight = 1; 
		jbtNum0 = new JButton("0");
		m.setConstraints(jbtNum0, con);
		c.add(jbtNum0);

		// Decimals
		con.gridx = 2;
		con.gridwidth = 1; con.gridheight = 1; 
		jbtDec = new JButton(",");
		m.setConstraints(jbtDec, con);
		c.add(jbtDec);

		//+
		con.gridx = 3;
		con.gridwidth = 1; con.gridheight = 1; 
		jbtPlus = new JButton("+");
		m.setConstraints(jbtPlus, con);
		c.add(jbtPlus);
	}
} 