/*
정수 1개를 입력받아 2배 곱해 출력해보자.
(비트시프트연산자 사용)
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d\n", a<<1);
	}
}
