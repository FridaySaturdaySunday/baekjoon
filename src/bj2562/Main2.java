package bj2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int num = 0;
		
		int count = 1; // 몇번째 수인지 카운트. 1번부터 시작
		
		for(int n : arr) {
			if(n > max) {
				max = n;
				num = count;
			}
			count++;
		}

		System.out.println(max);
		System.out.println(num);
	}

}
