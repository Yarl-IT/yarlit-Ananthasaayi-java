import java.util.Scanner;

class SimpleCalculator{
	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("");
		System.out.print("Enter First Number:");
		int x = scan.nextInt();
		
		System.out.println("");
		System.out.print("Enter second Number:");
		int y = scan.nextInt();
		
		System.out.println("");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multipication");
		System.out.println("4.Division");
		
		System.out.println("");
		System.out.print("Enter your choice:");
		int choice = scan.nextInt();
		switch (choice){
			case 1:
			System.out.println("Result:"+(x+y));
			break;
			case 2:
			System.out.println("Result:"+(x-y));
			break;
			case 3:
			System.out.println("Result:"+(x*y));
			break;
			case 4:
			System.out.println("Result:"+(x/y));
			break;
		}
	}
}