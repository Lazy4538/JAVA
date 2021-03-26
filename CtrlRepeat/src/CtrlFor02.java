import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, hap = 0;
		System.out.print("숫자 : ");
		int n = sc.nextInt();

		for(i = 0; i <= n; i++)
		{
			hap += i; //hap = hap + i;
		}
		System.out.printf("0부터 %d까지의 합 = %d 입니다.", n, hap);
		
		sc.close();
	}

}
