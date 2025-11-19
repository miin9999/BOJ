package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2920 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[]arr = new int[8];
		
		String a = "";
		for(int i =0;i<8;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean isAsc = true;
		boolean isDesc = true;
		
		for(int i = 0; i < 7; i++){
		    if(arr[i] + 1 != arr[i+1]) isAsc = false;
		    if(arr[i] - 1 != arr[i+1]) isDesc = false;
		}
		
		if(isAsc) a = "ascending";
		else if(isDesc) a = "descending";
		else a = "mixed";
		
		System.out.println(a);
		
		

	}

}
