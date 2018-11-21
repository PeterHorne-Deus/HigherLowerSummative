/*
 * Peter Horne-Deus
 * This program will allow the user to have a number print and the user will guess if the next number will be higher or lower
 * HigherLowerSummative.java
 * November 20, 2018
 */

package higherlowersummative;

import java.util.Scanner;
import java.util.ArrayList;

public class HigherLowerSummative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Creating Variables
        int randomNumber = 0;
        int userEnterdGuess,userChoice;
        
        //Creating Constents
        final int NUMBER_OF_QUESTIONS = 9;
        
        //Creating Arrays
        ArrayList userguess = new ArrayList();
        ArrayList answers = new ArrayList();
        
        //Calling Methods In Order
        menu(keyedInput);
        
    }
    
    public static void menu(Scanner keyedInput){
        //Creating Variables
        int userChoice,randomNumber = 0;
        int play = 1;
        String userEnterdGuess;
        
        //Outputting options
        while (play == 1){
            System.out.println("1... Play Game");
            System.out.println("2... Instructions");
            System.out.println("3... Exit Game");

            userChoice = keyedInput.nextInt();
            
            //Running programs 
            if (userChoice == 1){
                randomNumber = creatingRandomNumber(randomNumber);
                userEnterdGuess = userGuess(keyedInput,randomNumber);
                
            }
            
            else if (userChoice == 2){
                //How to play
                System.out.println("\n The system will output a integer number between 1 and 10"
                        + "\n Your job is to guess if the next number will be higher or lower"
                        + "\n The system will output if you were correct or not"
                        + "\n You gain points for every correct answer "
                        + "\n The game ends when you have 10 correct answers \n");
            }
            
            else if (userChoice == 3){
                System.out.println("BYE!!!!");
                play = 2;
            }
            else{
                System.out.println("Enter A Number from 1 - 3");
            }
        }
        
       
    }
    
    public static int creatingRandomNumber(int randomNumber){
        //Variables
        int perameter = 9; 
        
        //Creating a random number
        randomNumber = (int)Math.round(Math.random()*perameter +1);
        
        return randomNumber;
    }
    
    public static String userGuess(Scanner keyedInput, int randomNumber){
        //Creating Variables
        String userGuess;
        
        //Prompting user for input
        System.out.println("The Number Is: " + randomNumber);
        
        System.out.println("Enter A Guess (higher or lower)");
        
        userGuess = keyedInput.nextLine();
        
        return userGuess;
    }
    
    public static void isAnswerCorrect(){
        
        
    }
}
