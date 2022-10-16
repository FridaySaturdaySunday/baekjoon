package bj10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken()); // w는 쓸 일 없음
			int n = Integer.parseInt(st.nextToken());
			
			if(n % h == 0) {
				sb.append((h * 100) + (n / h)).append('\n');
			} else {
				sb.append(((n % h) * 100) + ((n / h) + 1)).append('\n');
			}
		
		}
		System.out.println(sb);

	}

}
