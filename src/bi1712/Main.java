package bi1712;

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
		int c = Integer.parseInt(st.nextToken());
		
		if(c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a / (c - b)) + 1);
		}
		
		// 판매량 n
		// 총 수입과 총 비용이 같아지는 지점 구한다면
		// nc = a + nb
		// n(c - b) = a
		// n = a / (c - b)
		// 이익이 발생하는 조건은 위 식에 +1 해주면 된다
	}

}
