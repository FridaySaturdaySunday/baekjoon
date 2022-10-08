package bj11654;

import java.util.Scanner;

public class Main {
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 'A'는 아스키 코드로 65
		int ch = sc.next().charAt(0); // 어떤 타입이 입력되든 char형으로 변환 후 int형 변수에 저장
		
		System.out.println(ch);
		
	}

}
