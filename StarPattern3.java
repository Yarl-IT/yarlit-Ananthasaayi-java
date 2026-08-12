class StarPattern3{
	public static void main(String args[]){
		int n=5;
	
		for(int rows=1;rows<=n;rows++){ 
			for(int cols1=rows;cols1<n;cols1++){  
				System.out.print("  ");
			}
			for(int cols2=1;cols2<=rows;cols2++){
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
}	