import java.util.Scanner;

class UserInput{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		String name ="";
		System.out.print("please enter your name:");
		name=scan.nextLine();
		System.out.println("Your Name is:" + name);
		
		System.out.println("***********");
		
		int marks =0;
		System.out.print("please enter your marks:");
		marks=scan.nextInt();
		System.out.println("Your Marks is:" + marks);
	}
}