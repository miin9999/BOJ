package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int max_limit = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[]arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int temp= 0;

		for(int i =0; i<count-2;i++) {
			for(int j =i+1; j<count-1;j++) {
				for(int k=j+1; k<count;k++) {
					
					if(arr[i]+arr[j]+arr[k] <= max_limit && arr[i]+arr[j]+arr[k] >temp) {
						temp = arr[i]+arr[j]+arr[k];
						
					}
				}
			}
		}
		
		
		System.out.println(temp);
		

	}

}
