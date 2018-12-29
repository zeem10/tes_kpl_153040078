import static org.junit.Assert.*;
import org.junit.Test;

public class TestCase {

	@Test
	public void test1() {
		A a = new A();
		assertEquals(a.hitung(2, 3, 5), 25.0, 0);
	}
	
	@Test
	public void test2() {
		A a = new A();
		assertEquals(a.hitung(2.1, 3.5, 1.0), 5.6, 0);
	}

}
