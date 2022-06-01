/*
단어를 1개 입력받는다.

입력받은 단어(영어)의 각 문자를

한줄에 한 문자씩 분리해 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String[] fstr = str.split("");
		input.close();
		for(int i = 0; i < fstr.length; i++) {
			System.out.printf("\'%s\'\n", fstr[i]);
		}
	}
}
