import java.math.BigInteger;

public class pb20 {

	public static void main(String[] args) {
		BigInteger fact = factorial(100);
		String result = fact.toString();
		int sum = 0;
		for(int i = 0 ; i< result.length(); i++){
			sum += Integer.parseInt(result.substring(i, i+1));
		}
		System.out.println(sum);
	}
	
	public static BigInteger factorial(int num){
	    if (num<=1)
	        return BigInteger.ONE;
	    else
	        return factorial(num-1).multiply(BigInteger.valueOf(num));
	}

}
