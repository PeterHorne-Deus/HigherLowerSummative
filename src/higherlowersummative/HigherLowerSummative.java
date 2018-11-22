/*
 * Peter Horne-Deus
 * This program will have a number print and the user will guess if the next number will be higher or lower
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
        ArrayList numbers = new ArrayList();

        
        //Calling Methods In Order
        menu(keyedInput,numbers,NUMBER_OF_QUESTIONS);
        
    }
    
    public static void menu(Scanner keyedInput,ArrayList numbers, final int NUMBER_OF_QUESTIONS){
        //Creating Variables
        int userChoice,randomNumber = 0;
        int play = 1,playGame = 0;
        int randomNum = 0;
        int userEnterdGuess,output = 0;
        int score = 0;
        
        //Outputting options
        while (play == 1){
            System.out.println("1... Play Game");
            System.out.println("2... Instructions");
            System.out.println("3... Exit Game");

            userChoice = keyedInput.nextInt();
            
            //Running programs 
            if (userChoice == 1){
                for (int i = 0; i <= NUMBER_OF_QUESTIONS; i++){
                    randomNum = randomNumber;
                    randomNumber = creatingRandomNumber(randomNumber);
                    userEnterdGuess = userGuess(keyedInput,randomNumber);
                    score = isAnswerCorrect(userEnterdGuess,randomNumber,randomNum,numbers,output,score);
                    output = output + 1;
                    if (output > 9){
                        output = 0;
                    }
                        
                }
                
                
            }
            
            else if (userChoice == 2){
                //How to play
                System.out.println("\n The system will output a integer number between 1 and 10"
                        + "\n Your job is to guess if the next number will be higher or lower"
                        + "\n The system will output if you were correct or not"
                        + "\n You gain points for every correct answer "
                        + "\n The game ends when you have answerd 10 questions \n");
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
    
    public static int userGuess(Scanner keyedInput, int randomNumber){
        //Creating Variables
        int userGuess;
        
        //Prompting user for input
        System.out.println("The Number Is: " + randomNumber);
        
        System.out.println("Enter A Guess (1 for higher or 2 for lower)");
        
        userGuess = keyedInput.nextInt();
        
        return userGuess;
    }
    
    public static int isAnswerCorrect(int userEnterdGuess, int randomNumber,int randomNum,ArrayList numbers,int output,int score){
        
        //To see if the user was correct or not and give appropriate score
        if (randomNumber > randomNum && userEnterdGuess == 1){
            System.out.println("Well done you got it correct! ");
            score = score + 1;
            
        }
        else if(randomNumber < randomNum && userEnterdGuess == 2){
            System.out.println("Well done you got it correct! ");
            score = score + 1;
        }
        else {
            incorrect();
        }
        
        
        numbers.add(randomNumber);
        
        if (output == 9){
            //Output
                System.out.println("\n \n \n \n ");
                
                System.out.println("----------------------------------------------");
                System.out.println("You got " + score + " correct!\n");
                
                System.out.println("The numbers outputed were "+ numbers + "\n \n \n");
                
                numbers.clear();
                
                
        }
        
        return score;
    }
    
    
    public static void incorrect(){
        System.out.println("Sorry You were inncorrect");
 
    }
    
    
}
