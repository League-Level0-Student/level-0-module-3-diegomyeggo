package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

String happy = JOptionPane.showInputDialog("Are you Happy?");
if (happy.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
}
else if (happy.equals("No")) {
	JOptionPane.showInputDialog("Do you want to be happy?")
}
	}
}