﻿/*
정수 3개를 입력받아 합과 평균을 출력해보자.
단, -2147483648 ~ +2147483647
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.printf("%d\n", (a+b+c));
		System.out.printf("%.1f\n", (float)(a+b+c)/3);
	}
}
