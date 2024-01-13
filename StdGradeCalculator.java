package JavaIntern;
import java.util.Scanner;

public class StdGradeCalculator {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of subject to calculation");
		int NumSubject=sc.nextInt();
		int TotalMarks=0;
		for(int i=1;i<=NumSubject;i++)
		{
			System.out.println("Enter Marks Obtained In Subject "+ i +"(out of 100);");
			int marks=sc.nextInt();
			TotalMarks += marks;
			
		}
		
		double averagePercentage=(double )TotalMarks / NumSubject;
		
		char grade;
		if(averagePercentage >= 90)
		{
			grade='o';
			
		}
		
		else if(averagePercentage >=80){
			grade='A';
		}
		else if(averagePercentage >= 70)
		{
			grade='B';
		}
		else if(averagePercentage >=60)
		{
			grade='C';
		}
		else if(averagePercentage >=50)
		{
			grade='D';
		}
	
		else
		{
			
			grade='F';
			
		}
		
		
		System.out.println("\n Total Marks Obtained: "+TotalMarks);
		
		
		
		System.out.println("\n Average Percentage In All Subject Is  "+averagePercentage);
		
		
		
		System.out.println("\n Grade:"+grade);
		
		
		
		
		
		
		
	} 
}