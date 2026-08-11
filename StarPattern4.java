class StarPattern4{
	public static void main(String args[]){
		int n=5;
	
		for(int rows=1;rows<=n;rows++){ 
			for(int cols1=1;cols1<rows;cols1++){   
				System.out.print("  ");
			}
			for(int cols2=rows;cols2<=5;cols2++){
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
}	