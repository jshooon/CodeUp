/*
어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(series)이라고 한다.
시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
n번째 수를 출력하는 프로그램을 만들어보자.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			a = (a * m) + d;
		}
		System.out.println(a);
	}
}
