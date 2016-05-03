import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void testGetName() {
		Customer TestCustomer = new Customer("Jan");
		assertTrue(TestCustomer.getName()== "Jan");
	}

	@Test
	public void testStatement() {
		Customer TestCustomer = new Customer("Jan");
		assertTrue(TestCustomer.statement()!= "");
	}

}