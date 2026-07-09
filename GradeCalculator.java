import java.util.Scanner;

class GradeCalculator{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int m1=0;
		
		System.out.println("Enter Marks for Subject 1:");
		m1=sc.nextInt();
		
		System.out.println("Enter Marks for Subject 2:");
		int m2=sc.nextInt();
		
		System.out.println("Enter Marks for Subject 1:");
		int m3=sc.nextInt();
		
		int total= m1+m2+m3;
		int average = total/3;
		
		if (average>=75){
		System.out.println("GRADE:A");
		}else if(average>=60){
		System.out.println("GRADE:B");
		}else if (average>=40){ 
		System.out.println("GRADE:C");
		}else{
		System.out.println("GRADE:FAIL");
		}
	}	
}	