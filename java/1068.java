/*
점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a >= 90 && a <= 100) {
			System.out.println("A");
		} else if (a >= 70 && a <= 89) {
			System.out.println("B");
		} else if (a >= 40 && a <= 69) {
			System.out.println("C");
		} else if (a >= 0 && a <= 39) {
			System.out.println("D");
		}
	}
}
