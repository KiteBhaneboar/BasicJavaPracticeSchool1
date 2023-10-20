package Tuition;

import java.util.Scanner;

public class Tuition 
{
	static double InDistFace = 95.00;
	static double InDistOnline = 108.00;
	static double OutDistFace = 167.00;
	static double OutDistOnline = 119.00;
	
	public static void main(String[] args) 
	{
		
		
		Scanner tuition = new Scanner(System.in);
		String inDistrict, faceToFace;
		double cost, credits;
		
		System.out.println("Are you taking face to face classes, Y/N?");
		faceToFace = tuition.nextLine();
		System.out.println("Are you in disctrict Y/N?");
		inDistrict = tuition.nextLine();
		System.out.println("Please enter the number of credits you're taking: ");
		credits = tuition.nextInt();
		
		if(inDistrict.equalsIgnoreCase("Y") && faceToFace.equalsIgnoreCase("Y"))
		{
			cost = credits*InDistFace; 
			System.out.printf("Credits cost $%6.2f\n", InDistFace);
			System.out.printf("Cost: $%6.2f", cost);
		}
		else if(inDistrict.equalsIgnoreCase("Y") && faceToFace.equalsIgnoreCase("N"))
		{
			cost = credits*InDistOnline; 
			System.out.printf("Credits cost $%6.2f\n", InDistOnline);
			System.out.printf("Cost: $%6.2f", cost);
		}
		else if(inDistrict.equalsIgnoreCase("N") && faceToFace.equalsIgnoreCase("Y"))
		{
			cost = credits*OutDistFace; 
			System.out.printf("Credits cost $%6.2f\n", OutDistFace);
			System.out.printf("Cost: $%6.2f", cost);
		}
		else if(inDistrict.equalsIgnoreCase("N") && faceToFace.equalsIgnoreCase("N"))
		{
			cost = credits*OutDistOnline; 
			System.out.printf("Credits cost $%6.2f\n", OutDistOnline);
			System.out.printf("Cost: $%6.2f", cost);
		}
		else {System.out.println("Invalid.");}
		
		tuition.close();
	}

}
