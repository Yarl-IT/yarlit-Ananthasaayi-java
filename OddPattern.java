class OddPattern{
	public static void main(String args[]){
		
		int rows=5;
		int []odds= {1,3,5};
	
		for(int i=1;i<=rows;i++){
			for(int j=0;j<odds.length;j++){
				System.out.print(odds[j]);
				if(j!=odds.length-1){
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}
		