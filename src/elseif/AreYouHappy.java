package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

String happy = JOptionPane.showInputDialog("Are you Happy?");
if (happy.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
}
else if (happy.equals("No")) {
	String enjoy = JOptionPane.showInputDialog("Do you want to be happy?");
	if (enjoy.equals("No")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	if (enjoy.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something");
	}
}


	}
}