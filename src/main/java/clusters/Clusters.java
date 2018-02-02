package clusters;

import java.util.Arrays;
import java.util.Collection;

public class Clusters {

	private int[] numbers;
	
	public Clusters(int[]  numbers) {
		// TODO Auto-generated constructor stub
		this.numbers = numbers; 
	}

	public int findCluster() {
	// TODO Auto-generated method stub
	int count = 0; 
	for(int i =0; i<numbers.length-3; i++) {
		if(numbers[i] == numbers[i+1]) {
			count++;
//			i+=3;	
			} 
			
		}
			

		return count; 
	}
	
	
	
	
}
