
package mycall;
import java.util.Scanner;
import additionProg.Addition;
import divisionProg.Division;
import subtractionProg.Subtraction;
import multiProg.Product;




public class cal {
	public static void main(String[]args) {
		
		Addition.addi(3,5);
		Addition a=new Addition();
		a.add(5, 8, 9);
		
		Division.divi(7, 8);
		Division b=new Division();
		b.div(6,9,8);
		
		Subtraction.subt(8,9);
		Subtraction c=new Subtraction();
		c.sub(3, 4, 7);
		
		Product.multi(8,9);
		Product d=new Product();
		d.mult(3, 4, 7);
		




System.out.println("ENTER 1 FOR ADD ");
		System.out.println("ENTER 2 FOR SUB");
		System.out.println("ENTER 3 FOR PRODUCT");
		System.out.println("ENTER 4 FOR DIVISION");
		System.out.println("ENTER 5 EXIT");
		Scanner s = new Scanner(System.in);
		int opt = s.nextInt();
		switch(opt) {
		case 1:
		{
			System.out.println("WELCOME ADDITION");
			System.out.println("ENTER 1 FOR 2 NO ADD");
			System.out.println("ENTER 2 FOR 3 NO ADDITION"); 
			System.out.println("ENTER 3 FOR  EXIT");
			int y = s.nextInt();
			if(y == 1) {
				System.out.println("ENTER THE 1ST NUMBER ");
				int num1 = s.nextInt();
				System.out.println("ENTER THE 2ND NUMBER");
				int num2 = s.nextInt();
				Addition.add(num1, num2);
				
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
				System.out.println("ENTER 3 FOR EXIT");
				int y = s.nextInt();
				if(y == 1) {
					System.out.println("ENTER THE 1ST NUMBER ");
					int num1 = s.nextInt();
					System.out.println("ENTER THE 2ND NUMBER");
					int num2 = s.nextInt();
					Substraction a = new Substraction(); 
					a.sub(num1, num2);
				}
				break;
			}
			
			case 3: 
			{
				System.out.println("WELCOME MULTIPLICATION");
				System.out.println("ENTER 1 FOR 3 NO MULTI");
				System.out.println("ENTER 3 FOR  EXIT");
				int y = s.nextInt();
				if(y == 1) {
					System.out.println("ENTER THE 1ST NUMBER ");
					int num1 = s.nextInt();
					System.out.println("ENTER THE 2ND NUMBER");
					int num2 = s.nextInt();
					System.out.println("ENTER THE 3RD NUMBER");
					int num3 = s.nextInt();
					Product c = new Product();
					c.prod(num1, num2, num3);	
				}
				break;
			}
				
			case 4: 
			{
				System.out.println("WELCOME DIVISION");
				System.out.println("ENTER 1 FOR 2 NO DIV");
				System.out.println("ENTER 3 FOR EXIT");
				int y = s.nextInt();
				if(y == 1) {
					System.out.println("ENTER THE 1ST NUMBER ");
					int num1 = s.nextInt();
					System.out.println("ENTER THE 2ND NUMBER");
					int num2 = s.nextInt();
					Division.div (num1,num2);
				}
				break;
			}	
			
			}
				
		}
    }
		
		
	}
	// this static no // this use non static 

}
