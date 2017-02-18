
public class pb14 {

	public static void main(String[] args) {
		long maxN = 1, maxTerm = 1;
		long n = 2;
		while(n < 1000000){
			long temp = collatz(n);
			if(temp > maxTerm){
				maxTerm = temp;
				maxN = n;
			}
			n++;
		}
		System.out.println(maxN);
	}
	
	//iterative method to count number of terms in collatz seq
	public static long collatz(long n){
		long length = 0;
		boolean done = false;
		while(!done){
			length++;
			if(n == 1){
				done = true;
			}
			else if(n % 2 == 0){
				n/=2;
			}else{
				n = 3*n +1;
			}
		}
		return length;
	}
}
