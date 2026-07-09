import java.util.Scanner;

class EvenOdd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int x =scan.nextInt();
		if(x%2==0){
		System.out.println("EVEN");
		}else{
		System.out.println("ODD");
		}
	}
}