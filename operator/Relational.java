package operator;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		b = sc.nextInt();
		
		//printf로 논리값 true, false 출력할땐 %s를 쓰면됨
		System.out.printf("%d < %d = %s \n", a, b, (a < b));
		System.out.printf("%d <= %d = %s \n", a, b, (a <= b));
		System.out.printf("%d > %d = %s \n", a, b, (a > b));
		System.out.printf("%d >= %d = %s \n", a, b, (a >= b));
		System.out.printf("%d == %d = %s \n", a, b, (a == b));
		System.out.printf("%d != %d = %s \n", a, b, (a != b));
		
		sc.close();

	}

}
