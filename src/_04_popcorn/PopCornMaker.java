package _04_popcorn;

import javax.swing.JOptionPane;

public class PopCornMaker {
public static void main(String[] args) {
	Microwave m= new Microwave();
	String jesus= JOptionPane.showInputDialog("What flavor of popcorn would you like?");
	String god=JOptionPane.showInputDialog("How many minutes would you like to cook your popcorn?");
	int allah=Integer.parseInt(god);
	Popcorn p= new Popcorn(jesus);
	m.putInMicrowave(p);
	m.setTime(allah);
	m.startMicrowave();

	
}
}
