/* 
Minh Tran
CS1400
Assignment 4
9/25/21 
*/
import java.util.Scanner;

public class TriviaGame 
{
    public static void main(String[] args)
    {
        Question[] questions = new Question[10];
        Scanner playerInput = new Scanner(System.in);

        //Questions
        questions[0] = new Question("What month is Halloween celebrated in?", 
        "Spooktober", "Octopus", "October", "SPOOKY SCARY SKELETONS, COME SHIVER DOWN YOUR SPINE~", 3);

        questions[1] = new Question("What activity is Halloween best known for?",
        "Treating-or-Trick", "Trickery-and-Treats", "TNT", "Trick-or-Treat", 4);

        questions[2] = new Question("What is given out to Trick-or-Treaters?",
        "Candy", "Vampire Teeth", "Airplane Food", "A voice message about your car's extended warranty", 1);

        questions[3] = new Question("What color most accurately represents Halloween?",
        "I'm colorblind", "Orange", "Yellow", "Red", 2);

        questions[4] = new Question("Which of these groups is more active in the activities of Halloween, such as Trick-or-Treat?",
        "Old People", "Adults", "Children", "Ghosts~", 3);

        questions[5] = new Question("What should you do at a red light?",
        "Step on the gas, MAX SPEED", "Stop inside the intersection", "Stop your car before the limit line", "Turn off your car", 3);

        questions[6] = new Question("When a light is orange/yellow, what should you do?",
        "Step on the gas, MAX SPEED", "Slow down", "Do some donuts", "Just keep driving and hope it doesn't turn red", 2);

        questions[7] = new Question("What should you do at a stop sign?",
        "Step on the gas, MAX SPEED", "Stop once and go", "Stop forever", "Stop and yield if necessary", 4);

        questions[8] = new Question("What does it mean when the road light is green",
        "Step on the gas, MAX SPEED", "MAX ACCELERATION", "Step on the brakes, MAX STRENGTH", "Go forward in a safe speed", 4);

        questions[9] = new Question("What is the capital of Thailand?", 
        "Hanoi", "Bangkok", "Washington D.C.", "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", 2);

        int points1 = 0;
        int points2 = 0;

        //Player answering Questions
        for(int i = 0; i < questions.length; i++)
        {
            int playerAnswer = 0;

            if(i % 2 == 0)
            {
                //Player 1's Turn
                System.out.println("Player 1's Turn\n" + questions[i]);

                do
                {
                    //Only accepts an int answer 1-4
                    System.out.print("What is your answer? (1, 2, 3 ,4): ");
                    playerAnswer = playerInput.nextInt();
                    playerInput.nextLine();
                }
                while (playerAnswer < 1 || playerAnswer > 4);

                if(playerAnswer == questions[i].getCorrectAnswer())
                {   
                    points1++;
                    System.out.println("Correct! (+1 Point) Player 1: " + points1 + "/5\n");
                }
                else
                {
                    System.out.println("Wrong! (Correct Answer: " + questions[i].getCorrectAnswer() + ") Player 1: " + points1 + "/5\n");
                }
            }
            else
            {
                //Player 2's Turn
                System.out.println("Player 2's Turn\n" + questions[i]);

                do
                {
                    //Only accepts an int answer 1-4
                    System.out.print("What is your answer? (1, 2, 3 ,4): ");
                    playerAnswer = playerInput.nextInt();
                    playerInput.nextLine();
                }
                while (playerAnswer < 1 || playerAnswer > 4);

                if(playerAnswer == questions[i].getCorrectAnswer())
                {   
                    points2++;
                    System.out.println("Correct! (+1 Point) Player 2: " + points2 + "/5\n");
                }
                else
                {
                    System.out.println("Wrong! (Correct Answer: " + questions[i].getCorrectAnswer() + ") Player 2: " + points2 + "/5\n");
                }
            }
        }

        //Checking who won
        if(points1 > points2)
        {
            //Player 1 wins
            System.out.println("Congrats Player 1!");
        }
        else if (points2 > points1)
        {
            //Player 2 wins
            System.out.println("Congrats Player 2!");
        }
        else
        {
            //Tie
            System.out.println("It's a Tie!");
        }

        System.out.println("Player 1: " + points1 + "/5  | Player 2: " + points2 + "/5");

        playerInput.close();
    }
}
