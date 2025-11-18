package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_17389 {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String st = (br.readLine());
		
		
		int score=0;
		int bonus =0;
		
		for(int i =0; i<count;i++) {
			if(st.charAt(i) =='X') {
				bonus =0;
			}else if(st.charAt(i) =='O') {
				score +=i+1;
				score+=bonus;
				bonus++;
			}

		}
		System.out.println(score);
		
	}

}
