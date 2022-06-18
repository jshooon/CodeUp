/*
어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
n번째 수를 출력하는 프로그램을 만들어보자.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(a * (long)Math.pow(r, n-1));
	}
}
