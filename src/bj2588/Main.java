package bj2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close(); // 버퍼 닫아주기
		
		// StringBuilder의 객체를 생성
		StringBuilder sb = new StringBuilder();
		
		// append()의 인자로 연결하고자 하는 문자열을 넣기
		sb.append(a * (b%10)); // 1의자리
		sb.append("\n");
		sb.append(a * ((b%100)/10)); // 10의자리
		sb.append("\n");
		sb.append(a * (b/100)); // 100의자리
		sb.append("\n");
		
		sb.append(a * b);
		
		System.out.println(sb);
	}

}
