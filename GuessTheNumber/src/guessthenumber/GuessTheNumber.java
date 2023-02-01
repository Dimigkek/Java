package guessthenumber;
import javax.swing.*;

public class GuessTheNumber {

    public static void main(String[] args) {
        int secretNumber = (int) (Math.random()*100 + 1);
       int userAnswer = 0;
       System.out.println("The correct guess would be " + secretNumber);
        int count = 0;
        int counter = 0;
        boolean game = true;
        
        while(game){
            
        while(counter != 10 && counter != 5 && counter != 3){
            String question = JOptionPane.showInputDialog(null,
               "Choose difficutly:\n1.Easy\n2.Medium\n3.Hard", "Guessing Game", 1);
            counter = Integer.parseInt(question);
           JOptionPane.showMessageDialog(null, ""+ showMessage(counter));
            counter = GuessTheNumber.selectDifficutly(counter);
            System.out.println(counter);
            System.out.println(question);
           }
       while (userAnswer != secretNumber || count != counter)
       {    
           
           String response = JOptionPane.showInputDialog(null,
               "Enter a guess between 1 and 100", "Guessing Game", 3);
           userAnswer = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, secretNumber, count));
           count++;
           if(count == counter){JOptionPane.showMessageDialog(null,"You Lose!", "Guessing Game", 0);
           break;}
       }
       String playAgain = JOptionPane.showInputDialog(null,
               "Wanna play again", "Guessing Game", 1);
       if(playAgain.equals("Yes")){
           count=0;
           counter=0;
       }
       else if (playAgain.equals("No")){
           game = false;
           JOptionPane.showMessageDialog(null,"GoodBye!!!", "Guessing Game", 0);
           break;}
       else{
       JOptionPane.showMessageDialog(null,"Type 'Yes' or 'No' ", "Guessing Game", 0);
       while(playAgain !="Yes" && playAgain !="No"){
                playAgain = JOptionPane.showInputDialog(null,
                "Wanna play again\n-Type 'Yes' or 'No'", "Guessing Game", 1);
        if(playAgain.equals("No")){
            game = false;
           JOptionPane.showMessageDialog(null,"GoodBye!!!", "Guessing Game", 0);
           break;
        }
         else if(playAgain.equals("Yes")){
            count=0;
           counter=0;
         break;}
       } }
       
       
       }
        
   }
    

   public static String determineGuess(int userAnswer, int secretNumber, int count){
       if (userAnswer <=0 || userAnswer >100) {
           return "Your guess is invalid";
       }
       else if (userAnswer == secretNumber ){
           return "Correct!\nTotal Guesses: " + (count+1);
       }
       else if (userAnswer > secretNumber) {
           return "Your guess is too high, try again.\nTry Number: " + (count+1);
       }
       else if (userAnswer < secretNumber) {
           return "Your guess is too low, try again.\nTry Number: " + (count+1);
       }
       else {
           return "Your guess is incorrect\nTry Number: " + (count+1);
   	}
       
   
    }
    public static int selectDifficutly(int counter){
            if( counter == 1){
                 return 10;
                }
           else if(counter == 2){
                return 5;
                }
           else if(counter == 3){
                return 3;
                }
            else{
                return 0 ;
                }
    }
   public static String showMessage(int counter){
       if( counter == 1){
                 return "Easy mode activated you have 10 tries";
                }
           else if(counter == 2){
                return "Medium mode activated you have 5 tries!";
                }
           else if(counter == 3){
                return "Hard mode activated you have 3 tries!";
                }
           else{
           return "Choose between 1 , 2 and 3!";}
           }
       
   }
   
