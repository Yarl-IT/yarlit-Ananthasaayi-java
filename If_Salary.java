class If_Salary{
	public static void main (String args[]){
		int employeesalary = 50000;
		double tax;
		double netsalary; 
		
		System.out.println("Employee Basic Salary :"+ employeesalary );
		
		if (employeesalary>100000){
	tax= employeesalary * 0.03;
		}
		
		else {
		tax = employeesalary *0.01;
		}
		
		netsalary = employeesalary - tax;
		System.out.println("tax  :" + tax);
		System.out.println("netsalary :" + netsalary);
    }
}