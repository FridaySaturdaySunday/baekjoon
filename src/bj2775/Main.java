package bj2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int[][] APT = new int[15][15]; // 0~14층,호짜리 아파트 생성
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		make_APT(); // 아파트 만들기
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]+"\n");
		}
		System.out.println(sb);
	}
	
	public static void make_APT() {
		
		for(int i=0; i<15; i++) {
			APT[i][1] = 1; // i층 1호
			APT[0][i] = i; // i층 1호
		}
		
		for(int i=1; i<15; i++) { // 1~14층
			for(int j=2; j<15; j++) { // 2~14호
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
	}

}
