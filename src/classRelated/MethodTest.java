/**
 * 
 */
package classRelated;

/**
 * @author Ramesh
 *
 */
public class MethodTest {

	/**
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {
		Volume vol = new Volume();
		vol.length = 10;
		vol.breadth = 20;
		vol.width = 30;
		System.out.println("Volume of 10x20x30 = " + vol.volume());
	}
}

class Volume {
	double length, breadth, width;

	double volume() {
		return length * breadth * width;
	}
}
