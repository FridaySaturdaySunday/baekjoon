package bj1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눔 -> String 배열에 각각 저장
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		
//		if(a > b) {
//			System.out.println(">");
//		} else if(a < b) {
//			System.out.println("<");
//		} else {
//			System.out.println("==");
//		}
		
		// 삼항연산자
		System.out.println((a>b) ? ">" : (a<b) ? "<" : "==");
	}

}
