import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("����� �̸��� : ");
		name = sc.next();
		
		String city;
		System.out.print("����� ����ִ� ���ô� : ");
		city = sc.next();
		
		int age;
		System.out.print("����� ���̴� : ");
		age = sc.nextInt();
		
		double weight;
		System.out.print("����� ü���� : ");
		weight = sc.nextDouble();
		
		boolean single;
		String single2;
		System.out.print("����� ��ȥ�� : ");
		single = sc.nextBoolean();
		
		if (single == true) {
			single2 = "��ȥ";
		}
		else {
			single2 = "��ȥ";
		}
		
		System.out.println("����� �̸��� " + name + "�̸�, ��°��� " + city + "�̰�, ���̴� " + age + "�� �̸�, ����� ü���� " + weight + "kg�̸�, ��ȥ���δ� " + single2 + "�Դϴ�.");
		
		
		
		sc.close();
		
	}
}
	