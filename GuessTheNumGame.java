package JavaIntern;
import  java.util.Random;	
import  java.util.Scanner;
	
    class NumGame{
		    int computer;
		        NumGame(){
		        Random rand1 = new Random();
		        computer = rand1.nextInt(100);
		        System.out.println("Guess The Number  1 to 100");
		    }
		    int computerNo(){
		        return computer;
		    }
		}
	class GuessTheNumGame{
	
		    static int takeUserInput(){
		        int user;
		            System.out.println("Enter a Number");
		            Scanner sc= new Scanner(System.in);
		        user=sc.nextInt();
		        return user;
		    }

		    static void isCorrectNumber(int i, int j) {
		        if(i==j){
		            System.out.println("Correct NO. Guess");
		        }
		        else if(i>j){
		            System.out.println("Your No. is higher than computer No.");
		        }
		        else {
		            System.out.println("Your No. is lower than computer No.");
		        }
		    }
		    public static void main(String[] args) {
		   
		    
		        int user=0,computer=0,itteration=0;
		        NumGame g = new NumGame();
		        do {
		            user = takeUserInput();
		            computer = g.computerNo();
	                isCorrectNumber(user, computer);
		            itteration++;
		        }while (user!=computer);
		             System.out.println("YOU GUESS NO IN "+ itteration+" ITTERATIONS");
		    		
		    }	


	}



