import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class pb22 {

	public static void main(String[] args) throws IOException {
		//read file and load it as string
		BufferedReader br = new BufferedReader(new FileReader("p022_names.txt"));
		String names = br.readLine();
		StringTokenizer st = new StringTokenizer(names, ",");
		ArrayList<String> arr = new ArrayList<String>();
		//store each name into array
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			arr.add(token.substring(1, token.length()-1));
		}
		//sort
		Collections.sort(arr);
		int total = 0;
		//calculate each name and add up to total
		for(int i = 0; i< arr.size(); i++){
			String name = arr.get(i);
			int temp = 0;
			for(int j = 0; j< name.length(); j++){
				temp += name.charAt(j) - '@';
			}
			total += temp*(i+1);
		}
		br.close();
		System.out.println(total);
	}
}
