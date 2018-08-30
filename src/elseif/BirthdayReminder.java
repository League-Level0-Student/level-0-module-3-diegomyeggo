
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Febuary 24th";
		String dadsBirthday = "October 30th";
		String myBirthday = "December 31st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog("Which birthday do you want to know: Moms, Dads or mine?");
		// 3. Print out what the user typed
		if (Birthday.equals("Moms Birthday")) {
			JOptionPane.showMessageDialog(null, "Febuary 24th");
			}
		else if (Birthday.equals("Dads Birthday")) {
			JOptionPane.showMessageDialog(null, "October 30th");
		}
		else if (Birthday.equals("My Birthday")) {
			JOptionPane.showMessageDialog(null, "December 31st");
		}
		else if (Birthday.equals("")) {
			JOptionPane.showMessageDialog(null, "Sorry I don't remember that person's birthday");
			
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
