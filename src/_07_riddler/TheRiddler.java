package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

				// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
 String question1 = JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (question1.equalsIgnoreCase("incorrectly")) {
JOptionPane.showMessageDialog(null, "Correct!");
score ++;
		// 5. Otherwise, say "wrong" and tell them the answer
	} else {
		JOptionPane.showMessageDialog(null, "Wrong. The answer is incorrectly");
		
		// 6. Add some more riddles
String question2 = JOptionPane.showInputDialog(null, "What gets broken without being held");
if (question2.equalsIgnoreCase("A promise")) {
JOptionPane.showMessageDialog(null, "Correct!");
score +=1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is a promise");
		// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null, score);
	
}			
	}
}

}