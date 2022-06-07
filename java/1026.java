/*
입력되는 시:분:초 에서 분만 출력해보자.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("\\:");
		
		System.out.printf("%d", Integer.parseInt(a[1]));
	}
}
