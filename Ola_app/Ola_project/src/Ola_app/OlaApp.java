package Ola_app;
import java.util.Scanner;

public class OlaApp {
	public static void main(String[]args) {
		System.out.println("welcome to ola");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the option 1");
		int opt=s.nextInt();
		
		
		if(opt==1)
		{
		    User u=new User();
		    System.out.println("enter the choice i for auto");
			System.out.println("enter the choice 2 for bike");
			System.out.println("enter the choice 3 for car");
			int o=s.nextInt();
			
			switch(o)
			{
			case 1:
				
			{
				System.out.println("you have selected auto");
				ola.addAuto(new Auto());
				System.out,println(""); //ola.a.autodetailes
                
				
			}
			
			break;
			case 2:
			{
		}
			
		else if(opt==2)
		{
			Driver d=new Driver();
			System.out.println("hy ram,");
		}
		
		
	}
	

}


}
