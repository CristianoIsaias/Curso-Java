import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteSalario {

	@Test
	public void calcDespesa() {
		
		Percentual per = new Percentual();
		per.calcDespesa();
		assertEquals(per.sobraMinha, 1876.0f);			
		
	}
	@Test
	public void calcMesada() {
		                                                                    
		Mesada mes = new Mesada();
		mes.calcMesada();
		assertEquals(mes.valor, 280.0f);
	}
	
	@Test
	public void calcularResto() {
		                                                                    
		Mesada mes = new Mesada();
		
		mes.calcMesada();
		mes.calcularResto();
		assertEquals(mes.sobraMenos, 2520.0f);
	}
	
	

}
