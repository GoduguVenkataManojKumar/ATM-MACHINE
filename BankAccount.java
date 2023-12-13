package CodSoft_Task3;

import java.util.Scanner;

public class BankAccount implements ATM{
	
	double bal=5000;

	@Override
	public double deposit(Scanner sc) {
		System.out.print("enter deposit amount:");
		double amount = sc.nextDouble();
		
		if(amount<=0) {
			System.out.println("Enter valid Amount...");
		}
		else {
			bal += amount;
			System.out.println("Your Amount "+amount+"is deposited Succesfully, your balance is : ");
		}
		
		return bal;
	}

	@Override
	public double withDraw(Scanner  sc) {
		System.out.println("Enter amount  to withdraw :");
		double amount = sc.nextDouble();
		if(amount<=0||amount>bal) {
			System.out.print("Insufficient Amount, your Balance is : ");
		}
		else {
			bal-= amount;
			System.out.println("Your Amount "+amount+" is withdraw Succesfully,your balance is : "+bal);
		}
		
		
		return bal;
	}

	@Override
	public double checkBalance() {
		System.out.print("Your Balance is : ");
		
		return bal;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin no:");
		
		BankAccount  bc = new BankAccount ();
		int pin=sc.nextInt();
		
		if(pin==1234) {
			System.out.println("1.deposite amount\n2.withdraw amount\n3.check balance\nenter choice : ");
			int ch=sc.nextInt();
		switch(ch) {
		case 3:
		System.out.println(bc.checkBalance());
		break;
		
		case 1:
		System.out.println(bc.deposit(sc));break;
		
		case 2:System.out.println(bc.withDraw(sc));break;
		default:System.out.println("Invalid Choice....");
		}
		
			
		
		
		
	}
		else {
			System.out.println("invalid pin.");
		
		}

}
}
