import java.util.Scanner;

public class CtrlIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;

		System.out.print("�⵵ : ");
		year = sc.nextInt();
		
		//4�� ����̰� 100�� ����� �ƴϸ鼭 400�� ����� ����
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.printf("%d ���� ����(leap year)�Դϴ�.", year);
		}
		else
		{
			System.out.printf("%d ���� ���(common year)�Դϴ�.", year);
		}
		
		sc.close();
	}

}
