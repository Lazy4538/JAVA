import java.util.Scanner;

public class CtrlSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("���� : ");
		score = sc.nextInt();
		
		switch(score / 10)
		{
		case 10:
		case 9:
			System.out.println("����� ���(Grade)�� A �Դϴ�.");
		case 8:
			System.out.println("����� ���(Grade)�� B �Դϴ�.");
		case 7:
			System.out.println("����� ���(Grade)�� C �Դϴ�.");
		case 6:
			System.out.println("����� ���(Grade)�� D �Դϴ�.");
		default :
			System.out.println("����� ���(Grade)�� F �Դϴ�.");
		}
		
		sc.close();
	}

}
