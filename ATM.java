import java.util.Scanner;

class ATM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			int balance=10000;
			char choice;
			
			do{
				System.out.println("\n-------ATM-------");
				System.out.println("1.Check balance");
				System.out.println("2.Deposit");
				System.out.println("3.Withdraw");
			
				System.out.println(" ");
				System.out.print("Choose option:");
				int option =sc.nextInt();

				
					switch (option){
						
						case 1:
						System.out.println("balance:"+balance);
						break;
						
						case 2:
						System.out.print("Enter Deposit amount:");
						int dep =sc.nextInt();
						balance+=dep;
						System.out.println("Updated balance:"+balance);
						break;
					
						case 3:
						System.out.print("Enter Withdrawal amount:");
						int wd =sc.nextInt();
						balance-=wd;
						System.out.println("Updated balance:"+balance);
						break;
						
						default:
						System.out.println("Invalid option");
						break; 
					}
				
					System.out.print("Do you want another operation (y/n):");
					choice =sc.next().charAt(0);
			}while (choice=='y'|| choice=='Y');
		System.out.println("Thank you! have a nice day.");
	}
}