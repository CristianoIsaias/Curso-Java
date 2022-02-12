import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teste {

	@Test
	void testSoma() {
		calculo c = new calculo();
		c.calc1 = 2;
		c.calc2 = 0;
		c.somar();
		
		assertEquals(2, c.resultado);
	}

}
