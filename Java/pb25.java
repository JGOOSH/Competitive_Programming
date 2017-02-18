import java.math.BigInteger;

public class pb25 {

	public static void main(String[] args) {
		BigInteger cur = BigInteger.valueOf(1);
		BigInteger prev = BigInteger.valueOf(1);
		boolean done = false;
		int count = 2;
		while(!done){
			count++;
			cur = cur.add(prev);
			prev = cur.subtract(prev);
			if(cur.toString().length() == 1000){
				done = true;
			}
		}
		System.out.println(count);
	}

}
