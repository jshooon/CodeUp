/*
1개의 단어를 입력받아 그대로 출력해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		System.out.printf("%s",str);
	}
}
