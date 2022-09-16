package bj18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int a = Integer.parseInt(str);
		
		int b = 2541-1998;
		
		System.out.println(a-b);
	}

}
