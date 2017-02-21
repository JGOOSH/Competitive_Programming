import java.math.BigInteger;

public class pb53 {
	
	public static void main(String[] args) {
		int count = 0 ;
		for(int i = 1; i<= 100; i++){
			//tried to minimize the computation
			//if max value of combination with i is less than a million
			//no reason to go through unnecessary loop
			if(combination(i , i/2).compareTo(BigInteger.valueOf(1000000)) > 0){
				for(int j = 1; j <= i ; j++){
					if(combination(i , j).compareTo(BigInteger.valueOf(1000000)) > 0){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	/**
	 * method to calculate combination using BigInteger object 
	 * to even calculate the combination of very big numbers
	 */
	private static BigInteger combination(int n , int k ){
		BigInteger result = BigInteger.ONE;
		for(int i = 0 ; i < k; i++){
			result = result.multiply(BigInteger.valueOf(n-i)).divide(BigInteger.valueOf(i+1));
		}
		return result;
	}
}
