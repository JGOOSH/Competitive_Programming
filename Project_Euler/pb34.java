
public class pb34 {

	public static void main(String[] args) {
		int max = factorial(9)*7;
		int sum = 0;
		for(int i = 3 ; i <= max; i++){
			String s = String.valueOf(i);
			int temp = 0;
			for(int j = 0; j< s.length(); j++){
				temp += factorial(Integer.parseInt(s.substring(j, j+1)));
			}
			if(temp == i){
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static int factorial(int n){
		int result = 1;
		for(int i =  2 ; i <= n; i++){
			result *= i;
		}
		return result;
	}
}
