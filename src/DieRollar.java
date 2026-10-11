import java.util.Random;
import java.util.Scanner;

public class DieRollar
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        String choice = "Y";

        while(choice.equalsIgnoreCase("Y"))
        {
            int die1 = 0;
            int die2 = 0;
            int die3 = 0;
            int sum = 0;
            int roll = 0;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");

            System.out.println("--------------------------------------------------");

            do
            {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;

                sum = die1 + die2 + die3;

                roll++;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n",
                        roll, die1, die2, die3, sum);

            }while(!(die1 == die2 && die2 == die3));

            System.out.println();
            System.out.println("Triple! You rolled three " + die1 + "'s.");
            System.out.println();

            System.out.print("Would you like to play again? Y/N: ");
            choice = in.nextLine();

            System.out.println();
        }

        System.out.println("Thanks for playing!");

        in.close();
    }
}