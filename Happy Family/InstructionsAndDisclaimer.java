import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class InstructionsAndDisclaimer
{

public static void Instructions()
{
			InstructionsAndDisclaimer claim= new InstructionsAndDisclaimer();
			HappyFamilyTest hft = new HappyFamilyTest();
			HappyFamily hf = new HappyFamily();

	        	String[] options = {"Disclaimer", "Start", "Menu","Quit"};
	        	ImageIcon icon = new ImageIcon("instruction.png");

			JLabel label = new JLabel("<html>Instructions<br><br><br>1. The starting player starts by asking another player for a card needed to complete<br>a family. They have to tell specifically who they are looking for and their family name.<br><br>2. If the questioned player has the card, it needs to be handed over.<br>   Note: The questioning player gets another turn and can choose a different player to<br>ask a card from during this new turn.<br><br>3. If the other player doesn’t have that specific card, the turn ends and the next<br>player gets to request a card.<br>   Note: The player can retake the cards taken from them in the previous round.<br><br>4. As soon as a player gathers a complete family, 1 point will be <br>added while those cards (cards of the completed family) will disappear from the deck.<br><br>5. The game ends when all players have no more cards.<br><br>6. The player who collects the most families at the end of the game is the winner.<br> (there may be more than 1 winner)<html>");

			label.setFont(new Font("Arial", Font.BOLD, 16));
		
		        int result = JOptionPane.showOptionDialog(null, label, "Instructions",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		                icon, options, null);

		        if (result == 0)
			{
		        	claim.Disclaimer();
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
        			String[] arg = new String[] {""};
				hft.main(arg);
		        }
}

public static void Disclaimer()
{	
			InstructionsAndDisclaimer instruct= new InstructionsAndDisclaimer();
			HappyFamilyTest hft = new HappyFamilyTest();
			HappyFamily hf = new HappyFamily();

	        	String[] options = {"Instruction", "Start", "Menu","Quit"};
	        	ImageIcon icon = new ImageIcon("disclaimer.jpg");

			JLabel label = new JLabel("<html>Disclaimer<br><br><br>1. There are 4 players involved in this game.<br><br>2. By default, the user is Player 1 (live player).<br><br>3. Player 2, Player 3, and Player 4 are handled by the system (auto-play).<br><br>4. The cards will be shuffled and are equally distributed to all players (11 cards for each player).<br><br>5. The starting player is randomly chosen.<br><br>6. The sequence of a players turn is in ascending order. After Player 4 has played, it will go back<br>to being Player 1's (user) turn.<br><br>7. When asking for a card, players can only ask for the relatives of the family members they have<br>in their deck.<br><br>8. On the command prompt, it will display whos turn it is and the converstions between players<br> (user and system) when they question each other.<br><br>9. When it is player 1's turn (user's turn), each player's points and number of cards they have<br>is displayed on the command prompt.<html>");

			label.setFont(new Font("Arial", Font.BOLD, 16));
		
		        int result = JOptionPane.showOptionDialog(null, label, "Disclaimer",
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
        			String[] arg = new String[] {""};
				hft.main(arg);
		        }

}

}

	
