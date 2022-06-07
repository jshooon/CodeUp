/*
8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.valueOf(sc.next(), 8); 
		System.out.printf("%d",a);
	}
}
