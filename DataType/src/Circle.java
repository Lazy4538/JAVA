public class Circle {
	public static void main(String[] args) {
		
		final double PI = 3.14;
		double radius = 10.2;
		double CircleArea = radius * radius * PI;
		double circleCir = 2 * PI * radius;
		
		System.out.printf("원의 반지름 = %.2f",radius);
		System.out.printf("원의 면적 = %.2f", CircleArea);
		System.out.println("원의 둘레 =" + circleCir);
	}
}