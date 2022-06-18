/*
정보 선생님은 오늘도 이상한 출석을 부른다.

영일이는 오늘도 다른 생각을 해보았다.
출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?

출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		
		for(int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		int c = 23;
		for(int d : b) {
			if (c > d) c = d;
		}
		System.out.println(c);
	}
}
