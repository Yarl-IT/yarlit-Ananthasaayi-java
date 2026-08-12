class StarPattern5{
	public static void main(String args[]){
		int n=5;
	
		for(int rows=1;rows<=n;rows++){ 
			for(int cols1=1;cols1<rows;cols1++){
				System.out.print(" ");
			}	
			for(int cols2=1;cols2<=2*(n-rows)+1;cols2++){  //bracket - multiply - addition
				System.out.print("*");
			}	
		System.out.println();
		}
	}
}
	