/*
실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
저장되어 있는 실수값을 출력해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float f = input.nextFloat();
		input.close();
		System.out.printf("%f",f);
	}
}
