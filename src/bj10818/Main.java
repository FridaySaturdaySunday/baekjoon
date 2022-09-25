package bj10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
// Arrays.sort() 메소드 : 배열 오름차순 정렬
// 최솟값 (index 0) / 최댓값 (arr.length-1) 에 있다.
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		int index = 0;
		while(st.hasMoreTokens()) { // for(;st.hasMoreTokens();) 도 가능
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}

		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[arr.length-1]);
	}

}
