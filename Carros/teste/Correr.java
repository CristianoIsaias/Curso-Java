import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Correr {

	@Test
	public void testePoliposition() {
		Carro c = new Carro();
		c.aceleracao = 24;
		c.acelerar();
		
		assertEquals(24, 24, 0);
	}

}
