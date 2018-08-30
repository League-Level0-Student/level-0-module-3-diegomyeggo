package elseif;

import javax.swing.JOptionPane;

public class Zodiac {
String sign = JOptionPane.showInputDialog("What is your Star Sign?");{
if (sign.equals("Aries")) {
	JOptionPane.showMessageDialog(null, "You are:Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	 if (sign.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "You are:Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		if (sign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are: Cerebral, chatty, loves learning and education, charming, and adventurous.");
			if (sign.equals("Cancer")) {
				JOptionPane.showMessageDialog(null, "You are:Emotional, group oriented, seeks security, family.");
				if (sign.equals("Leo")) {
					JOptionPane.showMessageDialog(null, "You are:Generous, organized, protective, beautiful.");
					if (sign.equals("Virgo")) {
						JOptionPane.showMessageDialog(null, "You are: Particular, logical, practical, sense of duty, critical.");
						if (sign.equals("Libra")) {
							JOptionPane.showMessageDialog(null, "You are: Balanced, seeks beauty, sense of justice.");
							if (sign.equals("Scorpio")) {
								JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
								if (sign.equals("Sagittarius")) {
									JOptionPane.showMessageDialog(null, "You are:Happy, absent minded, creative, adventurous.");
									if (sign.equals("Capricorn")) {
										JOptionPane.showMessageDialog(null, "You are: Timeless, driven, calculating, ambitious.");
										if (sign.equals("Aquarius")) {
											JOptionPane.showMessageDialog(null, "You are:Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
											if (sign.equals("Pisces")) {
												JOptionPane.showMessageDialog(null, "You are: Likeable, energetic, passionate, sensitive.");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
else if (sign.equals("")) {
	JOptionPane.showMessageDialog(null, "That's not a star sign!");
}
}

}