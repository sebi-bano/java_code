package sw;

import java.util.Scanner;

import additionProg.Addition;
import divisionProg.Division;
import multiProg.Product;
import subtractionProg.Subtraction;

public class Swh {
	public static void main(String [] args) {
	
	
	
	System.out.println("ENTER 1 FOR ADD ");
	System.out.println("ENTER 2 FOR SUB");
	System.out.println("ENTER 3 FOR PRODUCT");
	System.out.println("ENTER 4 FOR DIVISION");
	System.out.println("ENTER 5 GO BACK");
	Scanner s = new Scanner(System.in);
	int opt = s.nextInt();
	switch(opt) {
	case 1:
	{
		System.out.println("WELCOME ADDITION");
		System.out.println("ENTER 1 FOR 2 NO ADD");
		System.out.println("ENTER 2 FOR 3 NO ADDITION"); 
		System.out.println("ENTER 3 FOR GO BACK");
		int y = s.nextInt();
		if(y == 1) {
			System.out.println("ENTER THE 1ST NUMBER ");
			int num1 = s.nextInt();
			System.out.println("ENTER THE 2ND NUMBER");
			int num2 = s.nextInt();
			Addition.addi(num1, num2);
			
		}
		else if(y ==2) {
			System.out.println("ENTER THE 1ST NUMBER ");
			int num1 = s.nextInt();
			System.out.println("ENTER THE 2ND NUMBER");
			int num2 = s.nextInt();
			System.out.println("ENTER THE 3RD NUMBER");
			int num3 = s.nextInt();
			Addition ref = new Addition();
			ref.add(num1, num2, num3);
			}
		break;
	}
		case 2:
		{
			System.out.println("WELCOME SUBSTRACTION");
			System.out.println("ENTER 1 FOR 2 NO SUB");
			System.out.println("ENTER 3 FOR GO BACK");
			int y = s.nextInt();
			if(y == 1) {
				System.out.println("ENTER THE 1ST NUMBER ");
				int num1 = s.nextInt();
				System.out.println("ENTER THE 2ND NUMBER");
				int num2 = s.nextInt();
				Subtraction a = new Subtraction(); 
				a.subt(num1, num2);
			}
			break;
		}
		
		case 3: 
		{
			System.out.println("WELCOME MULTIPLICATION");
			System.out.println("ENTER 1 FOR 3 NO MULTI");
			System.out.println("ENTER 3 FOR  GO BACK");
			int y = s.nextInt();
			if(y == 1) {
				System.out.println("ENTER THE 1ST NUMBER ");
				int num1 = s.nextInt();
				System.out.println("ENTER THE 2ND NUMBER");
				int num2 = s.nextInt();
				System.out.println("ENTER THE 3RD NUMBER");
				int num3 = s.nextInt();
				Product c = new Product();
				c.mult(num1, num2, num3);	
			}
			break;
		}
			
		case 4: 
		{
			System.out.println("WELCOME DIVISION");
			System.out.println("ENTER 1 FOR 2 NO DIV");
			System.out.println("ENTER 3 FOR GO BACK");
			int y = s.nextInt();
			if(y == 1) {
				System.out.println("ENTER THE 1ST NUMBER ");
				int num1 = s.nextInt();
				System.out.println("ENTER THE 2ND NUMBER");
				int num2 = s.nextInt();
				Division.divi (num1,num2);
			}
			break;
		}	
		
		}
			
	}

	
	
}





