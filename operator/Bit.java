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
		
		//~ (tield) (1�� ����) : 0�� 1��, 1�� 0���� �ٲ�
		//& (and) : ���߿� �ϳ��� 1�� ������ 1 (�Ѵ� 0�� ��쿡�� 0)
		//^ (exclusive or) : �ΰ��� ������ 0, �ٸ��� 1
		//|(or) ���߿� �ϳ��� 1�� ������ 1
	}

}
