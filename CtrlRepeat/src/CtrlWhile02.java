import java.util.Scanner;

public class CtrlWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� : ");
		n =sc.nextInt();
		
		int i, sum = 0;
		
		i = 1;
		while (i < n)
		{
			sum +=i;
			System.out.print(i);
			
			if(i <= n-i)
			{
				System.out.print(" + ");
			}
			else
			{
				System.out.print(" = ");
			}
			i++;
		}
		System.out.println(sum);
		System.out.printf("i = %d",i);
		
		sc.close();
	}

}
