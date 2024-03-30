package Pack2;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int pin= 1234;
		int balance=10000;
		int Addamount=0;
		int Takeamount=0;
		int withdraw=0;
		
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		//we have to take an input by an user
		
		System.out.println("Enter your pin number");
		
		int password=sc.nextInt();
		
		//code arrangement 
		if (password==pin) {
			System.out.println("Enter your name");
			name=sc.next();
			System.out.println("Welcome"+ name);
			
			while(true) {
				System.out.println("Press 1 to cheak your balance");
				System.out.println("Press 2 to add amount");
				System.out.println("Press 3 to take amount");
				System.out.println("Press 4 to take resipt");
				System.out.println("press 5 to EXIT");
				
		int opt=sc.nextInt();
		switch(opt) {
				case 1:
					System.out.println("your current balance"+balance);
					break;
				
				case 2:
					System.out.println("How much amount did you want to ADD to your account");
					Addamount=sc.nextInt();
					System.out.println("Successfully creadited");
					balance =Addamount+balance;
					//10000=100+10000
					//balance=10100
					break;
					
				case 3:
					System.out.println("How much amount did you want to take");
					Takeamount=sc.nextInt();
					if(Takeamount>balance) {
						System.out.println("your balance is insufficient");
						System.out.println("try less than your available balance");
						System.out.println("withdraw 0");
					}
					else {
						System.out.println("Successfully taken");
						balance =balance-Takeamount;
					
						//balance=10100=10100-100
						//balance=10000
					}
				case 4:
					System.out.println("Welcome to state bank of india");
					System.out.println("Available balance is"+balance);
					System.out.println("Amount deposited    "+Addamount);
					System.out.println("Amount taken        "+withdraw);
					System.out.println("Thanks for coming");
					
					break;
			         
				default:
					System.out.println("Press the number below 1234"
							+ "");
					break;
		}
		     if(opt==5) {
		    	 System.out.println("Thank you ");
		    	 break;
		     }
		      
				 
		}
		
	}
		else {
			System.out.println("Wrong pin number");
		}
		}
	

}