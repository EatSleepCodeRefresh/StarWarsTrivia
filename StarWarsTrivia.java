//Users must answer correct answer before moving onto next question
import javax.swing.JOptionPane;
public class StarWarsTrivia
{
	public static void main(String[] args)
	{
		int answer;
		String entry;
		
		//QUESTIONS
		String q1 = "Who played Lando Calrissian?\n";
		String q2 = "Who said I find your lack of faith disturbing.?\n";
		String q3 = "What game do Chewbacca and R2-D2 play in 'A New Hope'?\n";
		String q4 = "Who is the only non-Jedi/Sith character to use a lightsaber in the original trilogy?\n";
		String q5 = "What creature does Han Solo have to cut open to save Luke on planet Hoth?\n";
		String q6 = "Who said i think it is time we demonstrated the full power of this station.";
		String q7 = "Who voiced Jar Jar Binks";
		String q8 = "What fatal flaw did the rebels exploit to destroy the first Death Star?";
		String q9 = "Who adopted Leia at birth?";
		String q10 = "What line have Luke Skywalker, Han Solo, C-3PO, Obi-Wan Kenobi, Anakin Skywalker, and Princess Leia all said at some point?";
		String q11 = "Where did Darth Vader reveal himself to be Luke's father?";
		String q12 = "Who said “I suggest a new strategy, R2. Let the wookiee win.";
		String q13 = "Which bounty hunter did Han Solo kill in 'Episode IV: A New Hope?";
		String q14 = "Whose DNA was used in the creation of the Clone Army?";
		
		//ANSWERS
		String a1 = "Billy Dee Williams";
		String a2 = "Darth Vader";
		String a3 = "Dejarik";
		String a4 = "Han Solo";
		String a5 = "TaunTaun";
		String a6 = "grand moff tarkin";
		String a7 = "Ahmed Best";
		String a8 = "Exposed thermal exhaust port";
		String a9 = " Breha Organa Bail Organa";
		String a10 = "I have a bad feeling about this";
		String a11 = "Cloud City";
		String a12 = "C-3PO";
		String a13 = "Greedo";
		String a14 = "Jango Fett";
		
		//DISPLAY FOR ANSWER LIST
		String answerList = "(1)  " + a1 + "\n" +
							"(2)  " + a2 + "\n" +
							"(3)  " + a3 + "\n" +
							"(4)  " + a4 + "\n" +
							"(5)  " + a5 + "\n" +
							"(6)  " + a6 + "\n" +
							"(7)  " + a7 + "\n" +
							"(8)  " + a8 + "\n" +
							"(9)  " + a9 + "\n" +
							"(10) " + a10 + "\n" +
							"(11) " + a11 + "\n" +
							"(12) " + a12 + "\n" +
							"(13) " + a13 + "\n" +
							"(14) " + a14;
							
		//Prompt for questions
		
//QUESTION 1-------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q1 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 1)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q1 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 2-------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q2 + answerList);
		answer = Integer.parseInt(entry);
		while(answer != 2)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q2 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 3-------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q3 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 3)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q3 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 4-------------------------------------------------------------------------------------

		entry = JOptionPane.showInputDialog(null, q4 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 4)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q4 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 5-------------------------------------------------------------------------------------

		entry = JOptionPane.showInputDialog(null, q5 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 5)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q5 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 6-------------------------------------------------------------------------------------
		
		entry = JOptionPane.showInputDialog(null, q6 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 6)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q6 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 7-------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q7 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 7)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q7 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 8-------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q8 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 8)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo!! \n" + q6 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 9-------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q9 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 9)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo! \n" + q9 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		

//QUESTION 10------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q10 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 10)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo! \n" + q10 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 11------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q11 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 11)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo! \n" + q11 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
		
//QUESTION 12------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q12 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 12)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo! \n" + q12 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
//QUESTION 13------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q13 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 13)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo! \n" + q13 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
		
//QUESTION 14------------------------------------------------------------------------------------
		entry = JOptionPane.showInputDialog(null, q14 + answerList);
		answer = Integer.parseInt(entry);
		
		while(answer != 14)
		{
			entry = JOptionPane.showInputDialog(null, "Noooooooooooo! \n" + q14 + answerList);
			answer = Integer.parseInt(entry); 
		}
		JOptionPane.showMessageDialog(null, "The force is strong in you!");
	}
}