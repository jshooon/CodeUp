/*
어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
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
