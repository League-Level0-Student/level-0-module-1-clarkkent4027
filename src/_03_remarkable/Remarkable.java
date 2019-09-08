package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Arshia="Super Cool";
String Ashay="Hard-working";
String Devin="Positive";
String Andrew="Helpful";
String Darren="Kind and Nice";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input= JOptionPane.showInputDialog(null, "Enter a name");
if(input.equalsIgnoreCase("Arshia")) {
JOptionPane.showMessageDialog(null, Arshia);

}else if( input.equalsIgnoreCase("Ashay")){
	JOptionPane.showMessageDialog(null, Ashay);
	if(input.equalsIgnoreCase("Devin")) {
		JOptionPane.showMessageDialog(null, Devin);
		if(input.equalsIgnoreCase("Andrew")) {
			JOptionPane.showMessageDialog(null, Andrew);
			if(input.equalsIgnoreCase("Darren")) {
				JOptionPane.showMessageDialog(null, Darren);
		

// 3. In a pop-up, tell the user what is remarkable about that person. 
}
	}
}
}
}
}