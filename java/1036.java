/*
영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%d",(int)sc.next().charAt(0));
	}
}
