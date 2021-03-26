import java.util.Scanner;

public class CtrlIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;

		System.out.print("년도 : ");
		year = sc.nextInt();
		
		//4의 배수이고 100의 배수가 아니면서 400의 배수면 윤년
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.printf("%d 년은 윤년(leap year)입니다.", year);
		}
		else
		{
			System.out.printf("%d 년은 평년(common year)입니다.", year);
		}
		
		sc.close();
	}

}
