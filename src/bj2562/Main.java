package bj2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] arr2 = Arrays.copyOf(arr, arr.length); // 깊은복사
		
		Arrays.sort(arr);
		System.out.println(arr[8]);
		
		int n = 0;
		for(int i=0; i<9; i++) {
			if(arr[8] == arr2[i]) {
				break;
			} else {
				n++;
			}
		}
		System.out.println(n+1);
	}

}
