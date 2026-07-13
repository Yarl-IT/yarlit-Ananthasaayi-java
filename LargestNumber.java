import java.util.Scanner;

class LargestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Number:");
		int a =sc.nextInt();
		
		System.out.print("Enter first Number:");
		int b =sc.nextInt();
		
		System.out.print("Enter first Number:");
		int c =sc.nextInt();
		
		if(a>=b&&a>=c){
			System.out.println("Lagest Number is:"+a);
		}else if(b>=a&&b>=c){
			System.out.println("Lagest Number is:"+b);
		}else{
			System.out.println("Lagest Number is:"+c);
		}
	}
}