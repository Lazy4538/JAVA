import java.util.Scanner;

public class GuGu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("�ܼ��� �Է� �ϼ��� : ");
		int dan = sc.nextInt();
		
		for(i = 1; i <= 9; i++)
		{
			System.out.printf("%d * %d = %-2d \n",dan, i, dan * i);
		}
		
		sc.close();
	}

}
