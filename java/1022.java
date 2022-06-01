/*
공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
			System.out.printf("%s",str);
	}
}
