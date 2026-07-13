import java.util.Scanner;

class PasswordChecker{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		String correctpassword="@yarlit123";
		int attempts=3;
		
		while(attempts>0){
			System.out.print"Enter Password:");
			String password = sc.nextLine();
			if (password.equals(correctpassword)){
			System.out.print("Access Granted");
			break;
			}else{
				attempts--;
				System.out.print("Wrong password.Attempts left:"+ attempts);
			}
		}	
		if (attempts==0){
			System.out.println("Access Blocked");		
		}
	}
}