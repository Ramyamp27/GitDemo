package tutorialpoint;

import java.util.Scanner;

public class Elseif {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a number:");
		int i = scanner.nextInt();
	
		//int i = scanner.nextInt();
		if(i>0)
		{
			System.out.println(" Positive");
		}
		else if(i<0 || i!=0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Equal to Zero");
		}
		
	}
	}
