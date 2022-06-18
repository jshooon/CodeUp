/*
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			System.out.println(n);
			n--;
		}
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}