package formativeController;

import java.util.Scanner;

public class FormativeController
{
	private Scanner input;
	private int computerMove;
	private int computerScore;
	private int playerScore;

	public FormativeController()
	{
		input = new Scanner(System.in);
		computerScore = 0;
		playerScore = 0;
	}

	public void start()
	{
		System.out.println("WELCOME TO ROCK PAPER SCISSORS!!! To play simply put in a move, to stop type stop.");
		checkMoves();

	}

	/*
	 * Checks the players current move and randomizes the computers move back.
	 * also checks for the players move to make sure it is valid.
	 */
	private void checkMoves()
	{
		String playerInput = input.nextLine();

		if (playerInput.equals("rock") || playerInput.equals("paper") || playerInput.equals("scissors"))
		{
			if (playerInput.toLowerCase().equals("rock"))
			{
				computerMove = (int) (Math.random() * 3);
				{
					if (computerMove == 0)
					{
						System.out.println("you chose rock , and the computer chose rock its a tie");
					}
					if (computerMove == 1)
					{
						System.out.println("you chose rock the computer chose paper the computer wins a point");
						computerScore++;
					}
					if (computerMove == 2)
					{
						System.out.println("you chose rock the computer chose scissors you win a point!!");
						playerScore++;

					}
				}
			}
			if (playerInput.toLowerCase().equals("paper"))
			{
				computerMove = (int) (Math.random() * 3);
				{
					if (computerMove == 0)
					{
						System.out.println("you chose paper , and the computer chose rock you win a point!");
						playerScore++;
					}
					if (computerMove == 1)
					{
						System.out.println("you chose paper the computer chose paper its a tie!");
					}
					if (computerMove == 2)
					{
						System.out.println("you chose paper the computer chose scissors the computer wins a point");
						computerScore++;

					}
				}
			}

			if (playerInput.toLowerCase().equals("scissors"))
			{
				computerMove = (int) (Math.random() * 3);
				{
					if (computerMove == 0)
					{
						System.out.println("you chose scissors , and the computer chose rock the computer wins a point");
						computerScore++;
					}
					if (computerMove == 1)
					{
						System.out.println("you chose scissors the computer chose paper you win a point");
						playerScore++;
					}
					if (computerMove == 2)
					{
						System.out.println("you chose scissors the computer chose scissors its a tie");

					}

				}

			}

		}
		if (playerInput.toLowerCase().equals("stop"))
		{
			System.out.println("your score was " + playerScore + "the computers score was " + computerScore + " thanks for playing");
		}
		else
		{
			System.out.println("please use a valid move");
		}
		checkMoves();
	}

}
