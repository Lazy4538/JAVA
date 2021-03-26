import java.util.Scanner;

public class CtrlSwitch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		
		System.out.print("월(1~12) : ");
		month = sc.nextInt();

		//3,4,5 봄
		//6,7,8 여름
		//9,10,11 가을
		//12,1,2 겨울
		
		switch(month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다, 놉시다."); break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다, 놉시다."); break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다, 놉시다."); break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울 입니다, 놉시다."); break;
		default :
			System.out.println("잘못 입력하셨습니다. 놀지말고 공부하세요.");
		}
		
		sc.close();
		
	}

}
