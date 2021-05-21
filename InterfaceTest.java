class Calcu {
	public int calculate(int x, int y) {
		return x + y;
	}
}
class SamsungPhone extends Calcu implements PhoneInterface {
	public void sendCall() {
		System.out.println("������");
	}
	public void receiveCall() {
		System.out.println("��������!!!");
	}
	public void flash() {
		System.out.println("�޴��� ȭ���� �������ϴ�.");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		SamsungPhone s = new SamsungPhone();
		s.printLogo();
		s.sendCall();
		s.receiveCall();
		s.flash();
		System.out.println(s.calculate(1, 2));
	}

}
