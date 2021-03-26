import java.util.Scanner;

public class CtrlSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("성적 : ");
		score = sc.nextInt();
		
		switch(score / 10)
		{
		case 10:
		case 9:
			System.out.println("당신의 등급(Grade)은 A 입니다.");
		case 8:
			System.out.println("당신의 등급(Grade)은 B 입니다.");
		case 7:
			System.out.println("당신의 등급(Grade)은 C 입니다.");
		case 6:
			System.out.println("당신의 등급(Grade)은 D 입니다.");
		default :
			System.out.println("당신의 등급(Grade)은 F 입니다.");
		}
		
		sc.close();
	}

}
