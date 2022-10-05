package bj4673;

public class Main {
	
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		// 1부터 10000까지 검사한 뒤, 해당 수를 생성자로 하는 수가 있으면 그 수를 거르기
		// d 함수에 숫자를 넣어보며 return 되는 수는 해당 number를 생성자로 하는 수로 구성 할 것
		for(int i=1; i<10001; i++) {
			int n = d(i); // n => 생성자가 있는 수
			
			if(n < 10001) { 
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	
	public static int d (int number) {
		
		int sum = number; // sum : number 을 생성자로 하는 수

		while(number != 0) {
			sum += (number % 10); // 첫째자리수를 계속 더해줌
			number = number / 10; // 첫째자리를 없앰
		}
		
		return sum;
	}

	
}
