//Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {

	public static void main(String args[])
    { 
    		generateRandom();
    } //end main method



    public static void generateRandom(){
    	//Creating object of Random Class
    	Random rand=new Random();

    	//Generating a random number between 0-100
    	int randomNum=rand.nextInt(11);

    	//Calling guess method
    	guess(randomNum);
    }//end generateRandom method



    public static void guess(int randomNum){
    	// here we creating an object of Scanner Class
    	Scanner in =new Scanner(System.in);

    	//Welcome Message for Player
    	System.out.println("");
    	System.out.println("Number Guessing Game");
    	System.out.print("Guess a number between 0-100: ");
    	int guess=in.nextInt();
    	System.out.println("");

    	//input validation
    	while (guess<0 || guess>100){
    		System.out.print("Guess a number between 0-100: ");
    		guess=in.nextInt();
    		System.out.println("");
    	}

    	//try again until you guess the correct number
    	int tries=0;
    	while(guess!=randomNum){
    		tries++;
    		System.out.println("Wrong Guess!");
    		System.out.print("Guess again: ");
    		guess=in.nextInt();
    		System.out.println("");

    		//input validation
    		while (guess<0 || guess>100){
    			System.out.print("Guess a number between 0-100: ");
    			guess=in.nextInt();
    			System.out.println("");
    		}
    	}

    	// if you Win the Game then 
    	System.out.println("Correct Answer. You Won!");
    	System.out.println("Wrong Tries: "+tries);
    	System.out.println("");
		System.out.println("Thanks For Playing !...");

    	// Do you want to Play again or exit?
    	System.out.println("Press 1 to Play again.");
    	System.out.println("Press 0 to exit.");
    	int choice=in.nextInt();

    	if(choice==1)
    		generateRandom();
    	else
    		return;
    }//end guessing method

}//end  of the class