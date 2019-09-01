package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[]args) {	
String input=JOptionPane.showInputDialog("When is your birthday?");
if(input.equals("09/01")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
JOptionPane.showMessageDialog(null, ("Happy UnBirthday"));
}

}
}