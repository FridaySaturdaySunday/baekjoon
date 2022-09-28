package bj8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// 배열 생성
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		
		for(int i=0; i<n; i++) {

			int count = 0; // 연속횟수
			int sum = 0; // 누적합산
			
			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);
	}

}
