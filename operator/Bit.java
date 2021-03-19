package operator;

public class Bit {

	public static void main(String[] args) {
		int a = 3, b = 5;
		//3 = 0000 0013;
		//5 = 0000 0101;
		
		System.out.println("~" + a + "=" + (~a));
		System.out.printf("%d & %d + = %s \n", a, b, (a & b));
		System.out.printf("%d ^ %d + = %s \n", a, b, (a ^ b));
		System.out.printf("%d | %d + = %s \n", a, b, (a | b));
		
		//~ (tield) (1의 보수) : 0을 1로, 1을 0으로 바꿈
		//& (and) : 둘중에 하나라도 1이 있으면 1 (둘다 0일 경우에만 0)
		//^ (exclusive or) : 두개가 같으면 0, 다르면 1
		//|(or) 둘중에 하나라도 1이 있으면 1
	}

}
