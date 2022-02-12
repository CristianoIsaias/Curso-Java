
public class Mesada extends Percentual{

	float Percent = 0.10f;
	float valor;
	float sobraMenos;
	
	public float calcMesada() {
		
		valor = salarioMes * Percent;
		
		System.out.println("O valor da mesada do meu filho é " + valor);
		
		return valor;
	}
	
	public float calcularResto() {		
		
		sobraMenos = salarioMes - valor;
		
		System.out.println("O que sobra do meu salário é " + sobraMenos);
		
		return sobraMenos;
	}
}
