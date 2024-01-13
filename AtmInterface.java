package JavaIntern;
import java.util.Scanner;
public class AtmInterface 
	
{
	public static void main(String argsp[])
	{
		System.out.println("ATM Machine");
		System.out.println("First Deposit Money In Account");
		int balance = 0, withdraw, deposit;  
		Scanner sc =new Scanner(System.in);
		while(true)
		{
		
		
		System.out.println("Choose 1 For Withdraw ");
		System.out.println("Choose 2 For Deposit");
		System.out.println("Choose 3 For Check Balance");
		System.out.println("Choose 4 For Exit");

		System.out.println("Choose The Operation To Perform");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter The Money To Withdraw ");
			
		
		 withdraw=sc.nextInt();
				
		if(balance >= withdraw )
		{
			 balance = balance - withdraw;  
			System.out.println("Please Collect Your Money");
		}
		
		else
		{
			System.out.println(" Oops! Insufficient Balance ");
		} 
		break;
		
        case 2:  
            
            System.out.print("Enter Money To Be Deposited:");  
                          
            deposit = sc.nextInt();  
                          
            balance = balance + deposit;  
            System.out.println("Your Money Has Been Successfully Deposited");  
            System.out.println("");  
            break;  
       
       case 3:  
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            break;  
       
      case 4:  
            System.exit(0);  		
		
		}
		
	}		
	}	        
}