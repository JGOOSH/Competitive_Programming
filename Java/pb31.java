
public class pb31 {

	static int[] currency = {1,2,5,10,20,50,100,200};
	
	public static void main(String[] args) {
		int[] counter = {0};
		find(0, counter, 0);
		System.out.println(counter[0]);
	}

	/*
	 * recursive method to find all the combinations
	 */
	private static void find(int index, int[] counter, int cur) {
		//ending/failed condition #1
		if(index >= currency.length){
			return;
		}
		//ending/failed condition#2
		else if(cur > 200){
			return;
		}
		//successful condition
		else if(cur == 200){
			counter[0]++;
		}
		//continue searching
		else{
			find(index , counter , cur+currency[index]);
			find(index+1, counter, cur);
		}
	}

}
