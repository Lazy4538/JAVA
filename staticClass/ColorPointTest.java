package staticClass;

public class ColorPointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(4, 5, "Blue");
		cp.showColorPoint();
		
		Point p;
		p = cp;
		System.out.println(p.x);
	}

}
