package bj1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}

	
	public static int arithmetic_sequence (int num) {
		int cnt = 0; // 한수 카운팅

		if(num < 100) { // 1 ~ 99 의 경우 그 수 자체가 수열
			return num;
		} else {
			cnt = 99; // 일단 100 이상의 수가 들어오면 한수의 최소 개수는 99개
			
			for(int i = 100; i <= num; i++) { // 100부터 입력한 num까지 한수가 몇개인지 카운트
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun-ten) == (ten-one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

	
}
