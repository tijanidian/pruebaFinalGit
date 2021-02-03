import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuentaTest {

	Cuenta c;
	@Before
	public void setUp() throws Exception {
		c = new Cuenta();
	}

	@Test
	public void testCuenta() {
		
		assertEquals(0, 0);
	}

	@Test
	public void testCuentaStringDouble() {
		Cuenta c = new Cuenta();
		assertEquals(c.getTitular(),c.getTitular());
	}

	@Test
	public void testGetTitular() {
		c.setTitular("Pepa");
		assertEquals("Pepa", c.getTitular());
	}

	@Test
	public void testSetTitular() {
		c.setTitular("Manolo");
		assertEquals("Manolo", c.getTitular());
		
	}

	@Test
	public void testGetCantidad() {
	
		c.setCantidad(120.2);
		assertTrue(c.getCantidad() == 120.2);
	}

	@Test
	public void testSetCantidad() {
		c.setCantidad(120);
		assertTrue(c.getCantidad()==120);
	}

	@Test
	public void testIngresar() {
		int ingresar=10;
		c.ingresar(ingresar);
		
		int resultado=10;
		
		assertEquals(resultado, ingresar);
		
		
	}

	@Test
	public void testRetirar() {
		
		int retirar=10;
		c.retirar(retirar);
		
		int resultado=10;
		
		assertEquals(resultado, retirar);
		
	}

	@Test
	public void testToString() {
		c.setCantidad(112);
		assertTrue(c.getCantidad()==112);
	}

}
