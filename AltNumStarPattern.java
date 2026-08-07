class AltNumStarPattern{
	public static void main(String args[]){
		int rows=5;
		int cols=5;
		
		for(rows=1;rows<=5;rows++){
			if(rows%2!=0){
				for(cols=1;cols<=5;cols++){
					System.out.print(rows);
				}
			}
			else{
				for(cols=1;cols<=5;cols++){
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}