/*
2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		input.close();
		System.out.printf("%s %s", b, a);
	}
}
