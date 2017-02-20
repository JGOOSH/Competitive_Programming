
public class pb21 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 2; i< 10000; i++){
			int sum = sumDivisors(i);
			//check if valid amicable number pair
			if( sum != i && sumDivisors(sum) == i ){
				total += i;
			}
		}
		System.out.println(total);
	}
	/*
	 * method to calculate sum of all positive divisors
	 */
	private static int sumDivisors(int n){
		int sum = 0;
		for(int i = 1; i<Math.sqrt(n); i++){
			if(n%i ==0){
				sum+=i;
				if(i != n/i){
					sum+= n/i;
				}
			}
		}
		return sum - n;
	}
}
