
public class Percentual {
	
	float salarioMes = 2800.00f;
	float despesaMes = 0.67f;
	float sobraMinha;
	
	float calcDespesa() {
		sobraMinha = salarioMes * despesaMes;
		
		System.out.println("O meu salário mês é " + salarioMes);
	//	System.out.println("O valor da mesada do meu filho é de " + sobraMinha);
		
		return sobraMinha;
	}
	
	

}
