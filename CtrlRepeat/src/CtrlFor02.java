import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, hap = 0;
		System.out.print("���� : ");
		int n = sc.nextInt();

		for(i = 0; i <= n; i++)
		{
			hap += i; //hap = hap + i;
		}
		System.out.printf("0���� %d������ �� = %d �Դϴ�.", n, hap);
		
		sc.close();
	}

}
