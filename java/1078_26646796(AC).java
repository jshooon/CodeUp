/*
정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = 0;
		for(int i = 0; i <= n; i++) {
			if (i % 2 ==0) {
				b += i;
			}
		}
		System.out.println(b);
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int c = 0;
		while (i <= n) {
			if (i % 2 ==0) {
				c+=i;
			}
			i++;
		}
		System.out.println(c);
	}
}