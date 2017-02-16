
public class pb9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(run());
	}

	public static int run(){
	
	int a = 0, b = 0 , c = 0;
	
	boolean found = false;
	
	for(int  i = 1; i< 1000; i++){
		for( int j = i+1; j<1000; j++){
			a = i;
			b = j;
			if(Math.sqrt(a*a+b*b) -(int)Math.sqrt(a*a+b*b) ==0 ){
				c = (int) Math.sqrt(a*a+b*b);
					if((a+b+c == 1000) && (c>b) && (b>a)){
					return a*b*c;
				}
			}
		}
	}
	return 0;
	}
}


/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
*/