/*
영문자 1개를 입력받아 그 다음 문자를 출력해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		System.out.printf("%s", (char)(a+1));
	}
}
