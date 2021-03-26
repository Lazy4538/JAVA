import java.util.Scanner;

public class CtrlFor03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i, sum = 0;
		int n;
		
		System.out.print("Á¤¼ö : ");
		n =sc.nextInt();
		
		for(i = 1; i <= n; i++)
		{
			sum += i;
			System.out.print(i);
			
			if(i <= n-1)
			{
				System.out.print(" + ");
			}
			else
			{
				System.out.print(" = ");
			}
		}
		
		System.out.println(sum);
		System.out.printf("i = %d",i);
		
	}

}
