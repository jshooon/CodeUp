/*
년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] date = str.split("\\.");
		input.close();
		System.out.printf("%04d.%02d.%02d",Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
	}
}
