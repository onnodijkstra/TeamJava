import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.Insets;



public class Foo extends JFrame{
	
	JButton buttonMC, buttonMR, buttonMS, buttonMP, buttonMM, buttonCE, buttonBackspace, buttonC, buttonPlusMins, buttonSqrt, buttonDiv, buttonMult,
	buttonPlus, buttonMin, buttonPerc, buttonEql, button1x, buttonDec, button1, button2, button3, button4, button5, button6, button7, button8, button9,
	button0;
	
	JTextField textField; 
	
	public static void main(String[] args) {
		
		new Foo();
	}

	
	Foo() {
		
		
		JPanel thePanel = new JPanel();
		thePanel.setLayout(new GridLayout(0,3,2,2));
		
		ListenForButton lForButton = new ListenForButton();
		
				
		// button1.addActionListener(lForButton);
		
		buttonMC = new JButton("MC");
		buttonMR = new JButton("MR");
		buttonMS = new JButton("MS");
		buttonMP = new JButton("Mp");
		buttonMM = new JButton("MM");
		buttonCE = new JButton("CE");
		buttonBackspace = new JButton("BackSpace");
		buttonC = new JButton("C");
		buttonPlusMins = new JButton("+/-");
		buttonSqrt = new JButton("SQRT");
		buttonDiv = new JButton("/");
		buttonMult = new JButton("*");
		buttonPlus = new JButton("+");
		buttonMin = new JButton("-");
		buttonPerc = new JButton("%");
		buttonEql = new JButton("=");
		button1x = new JButton("1/X");
		buttonDec = new JButton(".");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		
		
		thePanel.add(button7);
		thePanel.add(button8);
		thePanel.add(button9);
		thePanel.add(button4);
		thePanel.add(button5);
		thePanel.add(button6);
		thePanel.add(button1);
		thePanel.add(button2);
		thePanel.add(button3);
		thePanel.add(button0);
		thePanel.add(buttonDec);
		
		
		JPanel operationsPanel = new JPanel();
		
		operationsPanel.add(button1x);
		operationsPanel.add(buttonEql);
		operationsPanel.add(buttonPerc);
		operationsPanel.add(buttonMin);
		operationsPanel.add(buttonPlus);
		operationsPanel.add(buttonMult);
		operationsPanel.add(buttonDiv);
		operationsPanel.add(buttonSqrt);
		operationsPanel.add(buttonC);
		operationsPanel.add(buttonPlusMins);
		operationsPanel.add(buttonBackspace);
		operationsPanel.add(buttonCE);
		operationsPanel.add(buttonMM);
		operationsPanel.add(buttonMP);
		operationsPanel.add(buttonMS);
		operationsPanel.add(buttonMR);
		operationsPanel.add(buttonMC);
	
		
		
		this.add(thePanel);

		toonFrame();
			
		
	}
	
	private void toonFrame() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("RekenMachine");
		this.setVisible(true);

	}
	
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
	}
	
}


/*
 * 
		ButtonGroup operation = new ButtonGroup();
		
		operation.add(button0);
		operation.add(button1);
		operation.add(button2);
		operation.add(button3);
		operation.add(button4);
		operation.add(button5);
		operation.add(button6);
		operation.add(button7);
		operation.add(button8);
		operation.add(button9);
		
		ButtonGroup operation2 = new ButtonGroup();
		
		operation2.add(button1x);
		operation2.add(buttonEql);
		operation2.add(buttonPerc);
		operation2.add(buttonMin);
		operation2.add(buttonPlus);
		operation2.add(buttonMult);
		operation2.add(buttonDiv);
		
		
		operation.add(buttonSqrt);
		operation.add(buttonC);
		operation.add(buttonPlusMins);
		operation.add(buttonBackspace);
		operation.add(buttonCE);
		operation.add(buttonMM);
		operation.add(buttonMP);
		operation.add(buttonMS);
		operation.add(buttonMR);
		operation.add(buttonMC);
		*/
