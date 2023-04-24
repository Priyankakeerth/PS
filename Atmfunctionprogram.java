package userfunctions;

import java.util.Scanner;

public class Atmfunctionprogram {

	public static void main(String[] args) {
		Scanner scanner_obj= new Scanner(System.in);
		int password=5454678;
		int Acc_balance=30500;
System.out.println("Enter your password:");
int userpassword=scanner_obj.nextInt();
if(userpassword==password)
{
	System.out.println("Password Match");
for(int i=0;i<=100;i++)
{
	System.out.println("Press_1/Press2/Press3/Exit/Invalid");
	String input=scanner_obj.next();
	switch(input)
	{
	case "Press_1":
		System.out.println("Enter withdrawel Amount");
		int withdraw_amount=scanner_obj.nextInt();
		System.out.println("Withdrawel Amount:"+withdraw_amount);
		Acc_balance=Acc_balance-withdraw_amount;
		System.out.println("Balance Amount:"+Acc_balance);
		break;
	case "Press_2":
		System.out.println("Enter your Deposit Amount");
		int Deposit_amount=scanner_obj.nextInt();
		Acc_balance=Acc_balance+Deposit_amount;
		System.out.println("Balance Amount:"+Acc_balance);
		break;
	case "Press_3":
	System.out.println("Receipt- to view thw accaount balance:"+Acc_balance);
	
	break;
	case "Exit":
		System.out.println("EXIT");
		break;
	case "Invalid":
		System.out.println("Invalid User");
		break;
	}
		
		
}
}
else
{
	System.out.println("Password didnot Match");
}
	}
}


