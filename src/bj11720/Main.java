package bj11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // n은 사실 쓸모없다
		
		int sum = 0;
		
		// getBytes() : 입력 문자열을 byte 단위의 '배열'로 반환시켜주는 메소드
		for(byte a : br.readLine().getBytes()) {
			sum += a - '0'; 
			// getBytes()로 int형으로 변환하는 방법은 UTF-16 (유니코드) 방식을 따르므로 반드시 '0' 또는 48 을 빼주어야
		}
		
		System.out.println(sum);
		
	}

}
