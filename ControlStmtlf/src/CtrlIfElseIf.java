import java.util.Scanner;

public class CtrlIfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("���� �Է�");
		score = sc.nextInt();
		
		if(score >= 90)
			System.out.println("����� ���(Grade)�� A �Դϴ�.");
		else if(score >= 80)
			System.out.println("����� ���(Grade)�� B �Դϴ�.");
		else if(score >= 70)
			System.out.println("����� ���(Grade)�� C �Դϴ�.");
		else if(score >= 60)
			System.out.println("����� ���(Grade)�� D �Դϴ�.");
		else
			System.out.println("����� ���(Grade)�� F �Դϴ�.");

		sc.close();
	}

}
