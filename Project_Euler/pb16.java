import java.math.BigInteger;

public class pb16 {

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		String result  = n.toString();
		//iterate through each character to calculate the sum
		int sum = 0;
		for(int i = 0; i < result.length(); i++){
			sum+= Integer.parseInt(result.substring(i, i+1));
		}
		System.out.println(sum);
	}

}
