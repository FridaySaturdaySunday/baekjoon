package bj2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		
		// A(시)와 B(분)을 하나의 분으로 변환한 뒤, C를 더하고 나온 결과 값을 다시 시와 분 으로 변환하는 방법
		
		int min = a*60 + b + c; 
		
		int hour = (min/60) % 24; // 24시 이상일 경우 0시부터 시작하도록 함
		int minute = min%60;
		
		System.out.println(hour + " " + minute);
		
	}

}
