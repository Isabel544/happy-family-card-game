import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class HappyFamily
{
	public static void fullfamily()	
	{
 		ImageIcon icon = new ImageIcon("full family.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("<html>Thank you for bringing<br>us back together.");
		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(500, 240));
	
		JOptionPane.showMessageDialog(null, panel, "A complete family",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }
	public static void home()	
	{
 		ImageIcon icon = new ImageIcon("welcome-home.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(100, 40));
		panel.setLayout(null);
		

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(500, 220));
	
		JOptionPane.showMessageDialog(null, panel, "Welcome home",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }
	public static void nothome()	
	{
 		ImageIcon icon = new ImageIcon("nobodyhome.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("<html>Maybe try asking<br>for someone else<br>next time.");

		String output="Nope, not home.\nMaybe try asking\nfor someone else\nnext time.";

		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));
	
		JOptionPane.showMessageDialog(null, label, "No one here",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }
	public static void win1()	
	{
 		ImageIcon icon = new ImageIcon("winner1.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("<html>Congrats!!!<br>You won!!!.");

		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));
	
		JOptionPane.showMessageDialog(null, label, "You are a winner",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }
	public static void win2()	
	{
 		ImageIcon icon = new ImageIcon("winner.gif");
 		JPanel panel = new JPanel();

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(180, 200));
	
		JOptionPane.showMessageDialog(null, panel, "Cluck cluck cluck",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }
	public static void lose()	
	{
 		ImageIcon icon = new ImageIcon("loser.gif");
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));

		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		JLabel label = new JLabel("<html>You lost.<br>Better luck next time.");

		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);

		//size of pop out for word sections
		UIManager.put("OptionPane.minimumSize",new Dimension(700, 240));
	
		JOptionPane.showMessageDialog(null, label, "Sad...",
		JOptionPane.PLAIN_MESSAGE, icon);
	 }

	public static void winner(int p1, int p2, int p3, int p4) 
	{
		int winner2=0;
		int winner3=0;
		int winner4=0;
	
		if(p1 <p2)
		{
			if(p2<p3)
			{
				if(p3<p4)
					System.out.println("\nPlayer 4 is the winner");
				else
					System.out.println("\nPlayer 3 is the winner");
			}
			else if(p2<p4)
				System.out.println("\nPlayer 4 is the winner");
			else
			{
				if(p3==p2)
					winner2=3;
				if(p4==p2)
					winner3=4;
				
				if(winner3!=0 && winner2!=0)
					System.out.println("\nPlayer 2, Player " +winner2+" and Player "+winner3+" is the winner");
				else if(winner3!=0)
					System.out.println("\nPlayer 2 and Player " +winner3+" is the winner");
				else if(winner2!=0)
					System.out.println("\nPlayer 2 and Player " +winner2+" is the winner");
				else
					System.out.println("\nPlayer 2 is the winner");
			}
			lose();
		}
		else if(p1<p3)
		{
			if(p3<p4)
				System.out.println("\nPlayer 4 is the winner");
			else
			{
				if(p3==p4)	
					winner2=4;
				
				if(winner2!=0)
					System.out.println("\nPlayer 3 and Player " +winner2+" is the winner");
					else
				System.out.println("\nPlayer 3 is the winner");
			}
			lose();
		}
		else if(p1<p4)
		{
			System.out.println("\nPlayer 4 is the winner");
			lose();
		}
		else
		{
			if(p2==p1)
				winner2=2;
			if(p3==p1)
					winner3=3;
		if(p4==p1)
				winner4=4;
	
			if(winner2!=0 && winner3!=0)
				System.out.println("\nPlayer 1, Player " +winner2+" and Player "+winner3+" is the winner");
			else if(winner2!=0 && winner4!=0)
				System.out.println("\nPlayer 1, Player " +winner2+" and Player "+winner4+" is the winner");
			else if(winner3!=0 && winner4!=0)
				System.out.println("\nPlayer 1, Player " +winner3+" and Player "+winner4+" is the winner");
			else if(winner2!=0)
					System.out.println("\nPlayer 1 and Player " +winner2+" is the winner");
			else if(winner3!=0)
						System.out.println("\nPlayer 1 and Player " +winner3+" is the winner");
		else if(winner4!=0)
					System.out.println("\nPlayer 1 and Player " +winner4+" is the winner");
			else
				System.out.println("\nPlayer 1 is the winner");
	
			win1();
			win2();
		}
		System.exit( 0 );
	}
	
	public static void HappyFamily() 
		
	{
			String[] titles={"Mr", "Mrs", "Master", "Miss"};
			String[] families={" Block, the Barber", " Bones, the Butcher", " Bun, the Baker", " Chip, the Carpenter", " Dose, the Doctor", " Bung, the Brewer", " Dip, the Dryer", 					" Grits, the Grocer", " Pots, the Painter", " Soot, the Sweep", " Tape, the Tailor" };
			String[] deck= new String[44];
			String[] tArr=new String[44];
			String[] pArr=new String[44];
			String dialog="Hint: Look at the command prompt to see past conversations, \npoints and number of cards of each player";
	
			int[] index= new int[4];
			int[] point= {0, 0, 0, 0};
	
			String t1= "Mr";
			String t2= "Mrs" ;
			String t3= "Master"; 
			String t4= "Miss";
			String f1= " Block, the Barber";
			String f2= " Bones, the Butcher";
			String f3= " Bun, the Baker";
			String f4= " Chip, the Carpenter"; 
			String f5= " Dose, the Doctor"; 
			String f6= " Bung, the Brewer" ;
			String f7= " Dip, the Dryer" ;
			String f8= " Grits, the Grocer"; 
			String f9= " Pots, the Painter";
			String f10= " Soot, the Sweep";
			String f11= " Tape, the Tailor";
	
			Scanner scan=new Scanner(System.in);
			Random rand=new Random();
	
			int got=0;
			int total=0;
			int choice=0;
			int pairing=0;
			int player;
			int starter;
			int target;
			int cnt=0;
			int ascend=0;
			String sort="-";
			String combine="";
			String title="";
			String family="";
			String element="";
			boolean found=false;
			boolean notempty=false;
			boolean present=false;
	
	 		// creating a deck of 44 cards
	 		for ( int i = 0; i < families.length; i++ )
	 		{
				family=families[i];
	 			for(int j=0; j<4; j++)
				{
					title=titles[j];
					deck[pairing]=title+family;
					pairing++;
				}
	 		} 
	
			// Shuffling deck
			for(int i=0; i<deck.length; i++)
			{
				int randomIndexToSwap = rand.nextInt(deck.length);
				String temp = deck[randomIndexToSwap];
				deck[randomIndexToSwap] = deck[i];
				deck[i] = temp;
			}
	
			// giving cards out to the players
			String[] p1=new String[44];
			System.arraycopy(deck,0 , p1,0,11);
			String[] p2=new String[44];
			System.arraycopy(deck,11 , p2,0,11);
			String[] p3=new String[44];
			System.arraycopy(deck,22 , p3,0,11);
			String[] p4=new String[44];
			System.arraycopy(deck,33 , p4,0,11);
	
			for(int i=11;i<deck.length;i++)
			{
				p1[i]="-";
				p2[i]="-";
				p3[i]="-";
				p4[i]="-";
			}
	//----------------------Start of Game------------------------------------------------
	
			// choosing starting player
			System.out.println("Randomly choosing starting player...");
			starter = rand.nextInt(4)+1;
			player=starter;
		
			switch(starter)
			{
				case 1:
					System.out.println("Player 1 starts first");
					break;
				case 2:
					System.out.println("Player 2 starts first");
					break;
				case 3:
					System.out.println("Player 3 starts first");
					break;
				case 4:
					System.out.println("Player 4 starts first");
					break;
			}
	
			do{
				do{
					if(player==2)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(p2[i]!="-")
							{
								notempty=true;
								break;
							}	
							else
								notempty=false;
						}	
	
						if(notempty==false)
							player++;
						else
							player=2;
					}
					if(player==3)
					{
						for(int i=0; i< deck.length; i++)
						{	
							if(p3[i]!="-")
							{
								notempty=true;
								break;
							}
							else
								notempty=false;
						}
		
						if(notempty==false)
							player++;
						else
							player=3;
					}
					if(player==4)
					{
						for(int i=0; i< deck.length; i++)
						{	
							if(p4[i]!="-")
							{
								notempty=true;
								break;
							}
							else
							notempty=false;
						}
		
						if(notempty==false)
							player++;
						else
							player=4;
					}
					if(player==5)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(p1[i]!="-")
							{
								notempty=true;
								break;
							}
							else
								notempty=false;
						}	
						if(notempty==false)
							player=2;
						else
							player=1;
					}
				}while(player==2 && notempty==false);
	
				switch(player)
				{
					case 1:
						for(int i=0; i< deck.length; i++)
							pArr[i]=p1[i];
						break;
					case 2:
						for(int i=0; i< deck.length; i++)
							pArr[i]=p2[i];
						break;
					case 3:
						for(int i=0; i< deck.length; i++)
							pArr[i]=p3[i];
						break;
					case 4:
						for(int i=0; i< deck.length; i++)
							pArr[i]=p4[i];
						break;
				}
	
	
	
	//----------------------Game in Progress------------------------------------------------

				do{
					int h1=0;
					int h2=0;
					int h3=0;
					int h4=0;
	
					System.out.println("\nPlayer "+player+"'s turn:\n");
						
					// check if starting got full family from the start
					if(got<4)
					{
						for(int i=0; i<families.length; i++)
						{
							cnt=0;
							family=families[i];
							for(int j=0; j<titles.length; j++)
							{
								title=titles[j];
								combine=title+family;
			
								for(int k=0; k<deck.length; k++)
								{
									element=pArr[k];
									present=element.equals(combine);
									if(present== true)
									{
										cnt+=1;
										index[j]=k;	
									}
								}
							}
							if(cnt==4)
							{
								pArr[index[0]]="-";
								pArr[index[1]]="-";
								pArr[index[2]]="-";
								pArr[index[3]]="-";
								point[player-1]++;
	
								if(player==1)
								{
									fullfamily();
									ImageIcon icon = new ImageIcon("celebrate.gif");
									String msg ="Congraats !!!\nYou had a full family from the start!\nSo now you start with" 													+" less cards and more points than others.\n";
	 								JOptionPane.showMessageDialog(null, msg,"Hooray!!!", JOptionPane.PLAIN_MESSAGE, icon);
								}
								else
								{	
									ImageIcon icon = new ImageIcon("alert.gif");
									String msg ="Oh no!\nPlayer "+player+" had a full family from the start!!\nand now starts with more points" + 														" and less  cards than you!!!";
	 								JOptionPane.showMessageDialog(null, msg,"Alert alert", JOptionPane.PLAIN_MESSAGE, icon);
								}

							}
						}
						got++;
					}
	
					//Arranging cards of player nicely
					for(int i=0; i<families.length; i++)
					{
						family=families[i];
						for(int j=0; j<titles.length; j++)
						{
							title=titles[j];
							combine=title+family;
					
							for(int k=0; k<deck.length; k++)
							{
								element=pArr[k];
								present=element.equals(combine);
								if(present== true)
								{
									sort=pArr[ascend];
									pArr[k]=sort;
									pArr[ascend]=combine;
									ascend++;
								}
							}
						}
					}
					ascend=0;
	
					if(player==1)
					{	// all players points and no. of cards on hand
						for(int i=0; i< deck.length; i++)
						{
							if(p1[i]!="-")
								h1++;
							if(p2[i]!="-")
								h2++;
							if(p3[i]!="-")
								h3++;
							if(p4[i]!="-")
								h4++;
						}
						System.out.println("\n\n--------------------------------");
						System.out.println("|PLAYER| POINTS | NO. OF CARDS |");
						System.out.print("|------------------------------|");
						System.out.printf("\n|   1  |   %02d   |      %02d      |",point[0], h1);
						System.out.printf("\n|   2  |   %02d   |      %02d      |",point[1], h2);
						System.out.printf("\n|   3  |   %02d   |      %02d      |",point[2], h3);
						System.out.printf("\n|   4  |   %02d   |      %02d      |",point[3], h4);
						System.out.println("\n--------------------------------");
		
					}
	
					String cardslist="\n\nPlayer 1's cards:\n";
					if(player==1)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(pArr[i]=="-")
								break;
							else
								cardslist+= pArr[i]+"\n";
						}
					}
	
					String str=dialog+cardslist;
	
					do{
						do{
							if(player==1)
							{
								String[] p={"2" ,"3" ,"4"};
								String input = (String)JOptionPane.showInputDialog(null, str +"\n Choose a player to take a card from: Player ", "Targeting player",JOptionPane.QUESTION_MESSAGE, null, p, p[0]);
								target=Integer.parseInt(input);
	
							}
							else 
								target = rand.nextInt(4)+1;
	
						}while(target==player);
	
						switch(target)
						{
							case 1:
								for(int i=0; i< deck.length; i++)
									tArr[i]=p1[i];
								break;
							case 2:
								for(int i=0; i< deck.length; i++)
									tArr[i]=p2[i];
								break;
							case 3:
								for(int i=0; i< deck.length; i++)
									tArr[i]=p3[i];
								break;
							case 4:
								for(int i=0; i< deck.length; i++)
									tArr[i]=p4[i];
								break;
						}
						for(int i=0; i< deck.length; i++)
						{
							if(tArr[i]!="-")
							{
								notempty=true;
								break;
							}
							else
								notempty=false;
						}
						if(notempty==false && player==1)
						{
							ImageIcon icon = new ImageIcon("nocards.png");
							String msg ="Player "+target+" has no more cards.\nChoose another player.";
	 						JOptionPane.showMessageDialog(null, msg,"No more cards", JOptionPane.PLAIN_MESSAGE, icon);
						}
					}while(notempty== false);
	
					do{
						str=dialog+cardslist;
						if(player==1)
						{
							String input = (String)JOptionPane.showInputDialog(null, str +"\nEnter the family you are looking for:", "Choosing a family" ,JOptionPane.QUESTION_MESSAGE, null, families, families[0]);
							switch(input)	
							{
								case " Block, the Barber" :
									choice=1;
									break;
								case " Bones, the Butcher" :
									choice=2;
									break;
								case " Bun, the Baker"   :
									choice=3;
									break;
								case " Chip, the Carpenter": 
									choice=4;
									break;
								case " Dose, the Doctor" :
									choice=5;
									break;
								case " Bung, the Brewer" :
									choice=6;
									break;
								case " Dip, the Dryer":		
									choice=7;
									break;
								case " Grits, the Grocer": 
									choice=8;
									break;
								case " Pots, the Painter" :
									choice=9;
									break;
								case " Soot, the Sweep"    :  
									choice=10;
									break;
								case " Tape, the Tailor":
									choice=11;
									break;
							}
						}
						else
							choice = rand.nextInt(11)+1;
		
						switch(choice)
						{
							case 1:
								family=f1;
								break;
							case 2:
								family=f2;
								break;
							case 3:
								family=f3;
								break;
							case 4:
								family=f4;
								break;
							case 5:
								family=f5;
								break;
							case 6:
								family=f6;
								break;
							case 7:
								family=f7;
								break;
							case 8:
								family=f8;
								break;
							case 9:
								family=f9;
								break;
							case 10:
								family=f10;
								break;
							case 11:
								family=f11;
								break;
						}
				
						//check if player got any members of the chosen family or not
						for(int j=0; j<titles.length; j++)
						{
							title=titles[j];
							combine=title+family;
							for(int i=0; i<deck.length; i++)
							{
								element=pArr[i];
					
								found=element.equals(combine);
								if(found==true)
									break;
								else if(element=="-")
									break;
							}
							if(found==true)
								break;
						} 	
						if(found==false && player==1)
						{
							ImageIcon icon = new ImageIcon("nocando.gif");
							String msg ="You do not have any members of this family.\nYou can only choose a family based \non the family members you have on hand.";
	 						JOptionPane.showMessageDialog(null, msg, "No no", JOptionPane.PLAIN_MESSAGE, icon);
						}
					}while(found==false);
			
					do{								 
						str=dialog+cardslist;
						if(player==1)
						{
							String input = (String)JOptionPane.showInputDialog(null, str +"\nEnter the family member you are looking for: ", "Choosing family member",JOptionPane.QUESTION_MESSAGE, null, titles, titles[0] );

							switch(input)
							{
								case "Mr":
									choice=1;
									break;
								case "Mrs":
									choice=2;
									break;
								case "Master":
									choice=3;
									break;
								case "Miss":
									choice=4;
									break;
							}
	
						}
						else
							choice = rand.nextInt(4)+1;
	
						switch(choice)
						{
							case 1:
								title=t1;
								break;
							case 2:
								title=t2;
								break;
							case 3:
								title=t3;
								break;
							case 4:
								title=t4;
								break;
						}	
						combine=title+family;		
	
						//check if player already have chosen family member or not
						for(int i=0; i<deck.length; i++)
						{
							element=pArr[i];
				
							found=element.equals(combine);
							if(found==true)
								break;
							else if(element=="-")
								break;
						}
						if(found==true && player==1)
						{
							ImageIcon icon = new ImageIcon("noclone.gif");
							String msg ="You already have this family member.";
 							JOptionPane.showMessageDialog(null, msg,"No cloning allowed", JOptionPane.PLAIN_MESSAGE, icon);
						}
					}while(found==true);
	
						if(player==1)
							System.out.print("\n");
	
					System.out.println("P"+player+": Player "+ target+ ", is "+combine+ " home?");

					//check if targeted player got the card or not
					for(int i=0; i<deck.length; i++)
					{
						element=tArr[i];
							
						found=element.equals(combine);
						if(found==true)
						{
							tArr[i]="-";
							System.out.println("P"+target+": Yes, "+combine+" is home.");
							System.out.println("P"+player+": Hooray!! Thank you Player "+ target+ ".");
	
							if(player==1)
								home();
	
							for(int j=0; j<deck.length; j++)
							{
								if(pArr[j]=="-")
								{
									pArr[j]=combine;
									break;
								}
							}	
						}
						if(found==true)
							break;
					}
					if(found==false)
					{
						System.out.println("P"+target+": No, "+combine+" is not home.");
						System.out.println("P"+player+": Okay...");
						if(player==1)
							nothome();
					}
		
					// check if got a full family
					for(int i=0; i<families.length; i++)
					{
						cnt=0;
						family=families[i];
							for(int j=0; j<titles.length; j++)
						{
							title=titles[j];
							combine=title+family;
		
							for(int k=0; k<deck.length; k++)
							{
								element=pArr[k];
								present=element.equals(combine);
								if(present== true)
								{
									cnt+=1;
									index[j]=k;	
								}
							}
						}
						if(cnt==4)
						{
							pArr[index[0]]="-";
							pArr[index[1]]="-";
							pArr[index[2]]="-";
							pArr[index[3]]="-";
							point[player-1]++;
	
							if(player==1)
							{
								fullfamily();
								System.out.println("\nYou have successfully collected a full family!");
							}
							else
								System.out.println("\nPlayer "+player+" has successfully collected a full family!");
						}
					}
					if(player==1)
					{
						for(int i=0; i< deck.length; i++)
							p1[i]=pArr[i];
					}
					else if(player==2)
					{
						for(int i=0; i< deck.length; i++)
							p2[i]=pArr[i];
					}
					else if(player==3)
					{
						for(int i=0; i< deck.length; i++)
							p3[i]=pArr[i];
					}
					else if(player==4)
					{
						for(int i=0; i< deck.length; i++)
							p4[i]=pArr[i];
					}
				
					switch(target)
					{
						case 1:
							for(int i=0; i< deck.length; i++)
								p1[i]=tArr[i];
							break;
						case 2:
							for(int i=0; i< deck.length; i++)
								p2[i]=tArr[i];
							break;
						case 3:
							for(int i=0; i< deck.length; i++)
								p3[i]=tArr[i];
							break;
						case 4:
							for(int i=0; i< deck.length; i++)
								p4[i]=tArr[i];
							break;
					}
					if(found == true)
						System.out.print("\nAgain !!!");
	
					if(player==1)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(p1[i]!="-")
							{
								notempty=true;
								break;
							}	
							else
								notempty=false;
	
							if(notempty==true)
								break;
						}
					}			
					else if(player==2)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(p2[i]!="-")
							{
								notempty=true;
								break;
							}	
							else
								notempty=false;
	
							if(notempty==true)
								break;
						}
					}
					else if(player==3)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(p3[i]!="-")
							{
								notempty=true;
								break;
							}	
							else
								notempty=false;
	
							if(notempty==true)
								break;
						}
					}
					else if(player==4)
					{
						for(int i=0; i< deck.length; i++)
						{
							if(p4[i]!="-")
							{
								notempty=true;
								break;
							}	
							else
								notempty=false;
				
							if(notempty==true)
								break;
						}
					}
					if(notempty==false)
						System.out.println("\nPlayer "+player+" has no more cards.");
	
				}while(found ==true && notempty==true);
	
	 
				player++;
		
				total= point[0] + point[1] + point[2] + point[3];
	
			}while(total!=11); //player taking turn
	

			ImageIcon icon = new ImageIcon("theend.gif");
			String msg ="All players have no more cards.\nThe game has ended.";
 			JOptionPane.showMessageDialog(null, msg,"The end", JOptionPane.PLAIN_MESSAGE, icon);
	
	
			System.out.println("\n\nAll players have no more cards.\nThe game has ended.");
	
			//Print out score
			System.out.println("\n+++++++++++++++++++++++++++++++++");
			System.out.printf("+%21s%11s","Score Board", "+");
			System.out.println("\n+++++++++++++++++++++++++++++++++");
			System.out.printf("|%20s%d%11s","Player 1: ", point[0], "|");
			System.out.println("\n---------------------------------");
			System.out.printf("|%20s%d%11s","Player 2: ", point[1], "|");
			System.out.println("\n---------------------------------");
			System.out.printf("|%20s%d%11s","Player 3: ", point[2], "|");
			System.out.println("\n---------------------------------");
			System.out.printf("|%20s%d%11s","Player 4: ", point[3], "|");
			System.out.println("\n---------------------------------");
	
			//Annouce who are the winners
			winner(point[0], point[1], point[2], point[3]);
			
	} // end public HappyFamily

} // end class HappyFamily
		



















