
public class pb12 {

	public static void main(String[] args) {
		//initialize triangular numbers and its sequences
		int cur = 1; 
		int counter = 1;
		boolean done = false;
		while(!done){
			counter ++;
			cur+= counter;
			//now check how many divisors it has
			int numDivisor = 0;
			for(int i = 1 ; i < (int)Math.sqrt(cur); i++){
				if(cur%i == 0){
					numDivisor++;
					if(i != cur/i){
						numDivisor++;
					}
				}
			}
			done = numDivisor >= 500;
		}
		System.out.println(cur);
	}

}
