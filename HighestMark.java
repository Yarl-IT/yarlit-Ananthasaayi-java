class HighestMark{
	public static void main(String args[]){
		int[] marks={70,85,60,90,75};
		int max=marks[0];
		
		for(int i=1;i<marks.length;i++){
			if(marks[i]>max){
			max = marks[i];
			}	
		}
		System.out.println("Highest Marks: " + max);
	}
}