import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("당신의 이름은 : ");
		name = sc.next();
		
		String city;
		System.out.print("당신이 살고있는 도시는 : ");
		city = sc.next();
		
		int age;
		System.out.print("당신의 나이는 : ");
		age = sc.nextInt();
		
		double weight;
		System.out.print("당신의 체중은 : ");
		weight = sc.nextDouble();
		
		boolean single;
		String single2;
		System.out.print("당신의 결혼은 : ");
		single = sc.nextBoolean();
		
		if (single == true) {
			single2 = "기혼";
		}
		else {
			single2 = "미혼";
		}
		
		System.out.println("당신의 이름은 " + name + "이며, 사는곳은 " + city + "이고, 나이는 " + age + "세 이며, 당신의 체중은 " + weight + "kg이며, 결혼여부는 " + single2 + "입니다.");
		
		
		
		sc.close();
		
	}
}
	