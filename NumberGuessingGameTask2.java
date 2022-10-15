import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int OriginalNumber = (int)(Math.random()*100+1);
        int guessedNumber = 0;
        int count = 1;
        while(guessedNumber != OriginalNumber){
            String response = JOptionPane.showInputDialog(null,"Enter a number between 1 and 100\n You have 5 chances to guess the number",5);
            guessedNumber = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null,determineGuess(guessedNumber, OriginalNumber, count));
            count++;
        }
    }
    public static String determineGuess(int guessedNumber, int OriginalNumber, int count){
    while(count<5 && count>0) {
        if(guessedNumber <= 0 || guessedNumber > 100){
            return ("Your guess is not in the range 1 to 100 🙃️!!!");
        }
        else if(guessedNumber == OriginalNumber){
            return ("WOWW🤩️!! You won the game in "+count +" guesses\n Your score is "+(5-count)*20+".....");
        }
        else if(guessedNumber > OriginalNumber){
            return ("Your guess is higher than the required number, \n Try again in: "+(5-count) +" guesses");
        }
        else if(guessedNumber < OriginalNumber){
            return ("Your guess is lower than the required number, \n Try again in: "+(5-count) +" guesses");
        }
        else{
            return ("Your guess is incorrect!!!");
        }
    }
    return ("Sorry☹️!! Chances over... Try Again.");
}
}
