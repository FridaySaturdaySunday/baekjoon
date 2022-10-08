package bj2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[2];
		
		for(int i=0; i<2; i++) {
			
			String str = st.nextToken();
			
			String a = String.valueOf(str.charAt(0)); // String.valueOf() : 괄호안 어떤형이든 String으로 변환
			String b = String.valueOf(str.charAt(1));
			String c = String.valueOf(str.charAt(2));
			
			arr[i] = Integer.parseInt(c+b+a);
		}
		
		System.out.println(arr[0]>arr[1] ? arr[0] : arr[1]);

	}

}


