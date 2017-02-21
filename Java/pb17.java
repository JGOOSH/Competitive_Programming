
public class pb17 {

	static String[] num_u20 = {"", "one", "two", "three", "four", "five", 
            "six", "seven", "eight", "nine", 
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
            "sixteen", "seventeen", "eighteen", "nineteen"};
	static String[] tens = {"twenty", "thirty","forty","fifty",
            "sixty","seventy","eighty","ninety"};
	static String hundred = "hundred";
	static String thousand = "thousand";
	static String and = "and";
	
	public static void main(String[] args) {
		int total = 0;
		for(int i  = 1 ; i<= 1000; i++){
			try{
			total += letterCount(i);
			}catch(IndexOutOfBoundsException e){
				System.out.println(i);
			}
		}
		System.out.println(total);
	}

	/*
	* method to count the amount of letters in a given integer
	*/
	private static int letterCount (int n){
		int count = 0;
		if(n < 20){
			return num_u20[n].length();
		}
		else if (n < 100){
			count += tens[(n/10)-2].length();
			count += num_u20[n%((n/10)*10)].length();
		}else if(n < 1000){
			count += num_u20[n/100].length() + hundred.length();
			if(n%100 != 0){
				count += and.length();
				int temp = n%((n/100)*100);
				if(temp > 19){
					count += tens[(temp/10)-2].length();
					count += num_u20[temp%((temp/10)*10)].length();
				}else{
				count += num_u20[temp%20].length();
				}
			}
		}else{
			count += num_u20[1].length() + thousand.length();
		}
		return count;
	}
}
