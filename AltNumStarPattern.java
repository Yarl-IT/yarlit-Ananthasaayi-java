class AltNumStarPattern{
	public static void main(String args[]){
		int rows=5;
		int cols=5;
		
		for(int i=1;i<=rows;i++){
			if(i%2!=0){
				for(int j=1;j<=cols;j++){
					System.out.print(i);
				}
			}else{
				for(int j=1;j<=cols;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}