
public class pb2 {

	public static void main(String[] args) {
		//finding the sum of even valued terms whose values do
		//not exceed four million in the Fibonacci sequence
		int sum = 2;
		int first = 1; 
		int second = 2;
		while(second < 4000000){
			second = second + first;
			//update sum if the next term is even
			if(second % 2 == 0){
				sum+=second;
			}
			first = second - first;
		}
		System.out.println(sum);
	}
}
