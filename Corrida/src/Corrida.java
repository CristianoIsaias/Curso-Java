
public class Corrida{
	float recordPistaHora;
	float velocidadeNacorrida;
	float retardatario;
	float tamanhoPista;	
	
	Corrida(Equipe e){
		recordPistaHora = 1.30f;
		tamanhoPista = 100.0f;
			
	}
	
	void velocidadeCorrida(Equipe e) {
		velocidadeNacorrida *= tamanhoPista;
		
	}
	
	void ultrapassarRetardatario(Equipe e) {
		velocidadeNacorrida *= -1.0f;
	}
	
/*	
	int acelerar() {
		
		return aceleracao *= motorPotencia;		 
	}
	
	void frear() {
		aceleracao *= 0;
		System.out.println("Retardatario na pista.");
	}
	
	void imprimir() {
		System.out.println("Inicia a Corrida");
		System.out.println("Equipe + equipe + passa na primeira curva a + this.acelerar()+km/h.");
		
	}
*/
}
