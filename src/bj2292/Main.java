package bj2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 한바퀴 돌때마다 방 개수는 6개씩 늘어남
		
		int count = 1; // 바퀴 수 (최소 루트)
		int range = 2; // 범위 (최소값 기준)
		
		if(n == 1) {
			System.out.println(1);
		} else {
			while (range <= n) { // 범위가 n보다 커지기 직전까지 반복
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
	}
}
