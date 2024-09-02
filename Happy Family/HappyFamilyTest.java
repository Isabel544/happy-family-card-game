import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class HappyFamilyTest  
{
    	public static void main(String[] args) 
	{
			InstructionsAndDisclaimer instruct= new InstructionsAndDisclaimer();
			InstructionsAndDisclaimer claim= new InstructionsAndDisclaimer();
			HappyFamily hf = new HappyFamily();

	        	String[] options = {"Instruction", "Start", "Disclaimer","Quit"};
	        	ImageIcon icon = new ImageIcon("menu.gif");

			JLabel label = new JLabel("<html>There was once 11 families that had 4 memebers each.<br>(a father. a mother, a son, a daughter).<br>And they lived a peaceful life.<br><br>But suddenly... a tragedy striked and<br>they were all separated !<br><br>So now it's up to you to<br>bring the families back together !!!<html>");

			label.setFont(new Font("Arial", Font.BOLD, 16));
		
		        int result = JOptionPane.showOptionDialog(null, label, "Prologue",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		                icon, options, null);

		        if (result == 0)
			{
		        	instruct.Instructions();
		        }
		        else if (result == 1)
			{
				ImageIcon aim = new ImageIcon("aim.jpg");
				JLabel l = new JLabel("<html>Let's collect and complete<br>as many families as possible.<html>");

				l.setFont(new Font("Arial", Font.BOLD,16));

 				JOptionPane.showMessageDialog(null, l, "Aim", JOptionPane.PLAIN_MESSAGE, aim);

		        	hf.HappyFamily();
		        }
		        else if (result == 2)
			{
				claim.Disclaimer();
		        }
	}
}