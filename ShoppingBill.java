import java.util.Scanner;

class ShoppingBill{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter item Price:");
		double price =sc.nextInt();
		
		System.out.print("Enter quantity:");
		int quantity =sc.nextInt();
		
		double total=price*quantity;
		
		if(total>5000){
			total=total-(total*0.10); // 10% discount
			System.out.println("Discount appilied (10%)");
		}
		
		System.out.println("Total bill amount:"+total);
	}
}