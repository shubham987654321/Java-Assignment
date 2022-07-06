package OopsConcept;

import java.util.Random;
import java.util.Scanner;

public class RockSiccor {

    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for Scissor
        System.out.println("0 for Rock\n" +
                "        // 1 for paper\n" +
                "        // 2 for Scissor");

        Scanner sc  =  new Scanner(System.in);
        String str;

        System.out.println("Start the game press Y and Exit the Game press E");
        str = sc.nextLine();
        while (str.charAt(0)=='Y') {


            str = sc.nextLine();

            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 1 && computerInput == 0
                    || userInput == 0 && computerInput == 2
                    || userInput == 2 && computerInput == 1) {

                System.out.println("You win");
            } else {
                System.out.println("You Loss");
            }

            if (computerInput == 0) {
                System.out.println("Computer choise : rock");
            } else if (computerInput == 1) {
                System.out.println("Computer choise : Paper");
            } else if (computerInput == 2) {
                System.out.println("Computer choise : Scissor");
            }
            System.out.println("Start the game press Y and Exit the Game press E");
        }
    }
}
