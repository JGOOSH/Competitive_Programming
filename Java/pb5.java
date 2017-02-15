
public class pb5 {

	public static void main(String[] args) {
		boolean found = false;
		int num = 21;
		while(!found){
			int div = 1; 
			boolean divisble = true;
			while(div<= 20 && divisble){
				if(num%div != 0){
					divisble = false;
				}
				div++;
			}
			if(divisble){
				found = true;
			}else{
				num++;
			}
		}
		System.out.println(num);
	}
}


/*
problem :
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
