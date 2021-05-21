class Calcu {
	public int calculate(int x, int y) {
		return x + y;
	}
}
class SamsungPhone extends Calcu implements PhoneInterface {
	public void sendCall() {
		System.out.println("따르릉");
	}
	public void receiveCall() {
		System.out.println("여보세요!!!");
	}
	public void flash() {
		System.out.println("휴대폰 화면이 켜졌습니다.");
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
