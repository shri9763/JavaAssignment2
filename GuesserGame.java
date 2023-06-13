package in.ineuron.assign;

import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println(" Guesser kindly guess the number in the range 1-10");
		guessNum=scan.nextInt();
		while(guessNum<0 || guessNum>10) // Added Range 1-10 Without that no number is accepted
		{   System.out.println(" Invalid entry! \nGuesser kindly guess the number in the range 1-10");
			guessNum=scan.nextInt();
		}
		System.out.println("************************************************************** \n"); 
		return guessNum;	
		
	}	

}

class Player
{
	int pguessNum;
	static int c=1; // Added Player number to print Exact Player 
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player " +c+ " kindly guess the number in the range 1-10");
		
		
		pguessNum=scan.nextInt();
		while(pguessNum<0 || pguessNum>10)
		{  
			System.out.println("Invalid entry! \nPlayer "+c+" kindly guess the number in the range 1-10");
			pguessNum=scan.nextInt();
		}
		System.out.println("************************************************************** \n"); 
		c++;
		return pguessNum;
	}
}

class Umpire
{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	int numFromPlayer5;
	
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player(); // Added Extra Player
	
		
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
		numFromPlayer4=p4.guessNumber();
		
	}
	
	void compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4 )
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 ,Player 2 and Player 3 won the game");
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4)
			{
				System.out.println("Player 1 ,Player 2 and Player 4 won the game");
			}
			else if(numFromGuesser==numFromPlayer4 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 ,Player 3 and Player 4 won the game");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
			{
			System.out.println("Player 2, Player 3 and Player 4 won the game");
			}
			else if(numFromGuesser==numFromPlayer3 )
			{
			System.out.println("Player 2 and Player 3 won the game");
			}
			else if(numFromGuesser==numFromPlayer4 )
			{
			System.out.println("Player 2 and Player 4 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			
			if(numFromGuesser==numFromPlayer4)
			{
			System.out.println("Player 3 and Player 4 won the game");
			}
			else
			{
				System.out.println("Player 3 won the game");
			}
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	
}





public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}









