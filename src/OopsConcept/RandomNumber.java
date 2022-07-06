package OopsConcept;


import java.util.Random;
import java.util.Scanner;

class  Game{
    int userInput;
    int randomNumber;
    Random random = new Random();
     public  Game(){

          randomNumber = random.nextInt(10);
          System.out.println("random Number is "+randomNumber);
     }

     public void  takeUserInput(){
         Scanner sc = new Scanner(System.in);
          userInput = sc.nextInt();
     }
     public  boolean  isCorrectNumber(){
         if(userInput == randomNumber ){
             System.out.println("You win");
             return  true;
         }else  if(userInput<randomNumber){
             System.out.println("Your Number is less than Random Number");
             return  false;
         }else if(userInput>randomNumber){
             System.out.println("Your Number is greater than Random Number");
             return  false;
         }
         return  false;
     }

}
public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Game g = new Game();

        boolean result =  false;
        System.out.println("Enter any Number b.w 1 to 10");
        while (!result){
             g.takeUserInput();
             result = g.isCorrectNumber();
             if(result){
                 System.out.println("You wan't to continue press 0 or No and 1 for Yes");
                 int resumeGame = sc.nextInt();
                 if(resumeGame==1){
                     g = new Game();
                     result = false;

                 }
             }

        }


    }
}
