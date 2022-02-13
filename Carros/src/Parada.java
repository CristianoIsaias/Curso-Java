
public class Parada {
	
	
	float trocaPneu;
	float colocarGasolina;
	float parada;
	
	Parada() {	
	  trocaPneu = 4.0f;
	  colocarGasolina = 5.0f;
	}
	
	void pitStopCompleto() {		
		
		parada *= trocaPneu + colocarGasolina;
	}
	
	void trocarPneu() {
		parada *= trocaPneu;
	}
	
	void abastecer() {
		parada *= colocarGasolina;
	}
	
	void imprimir() {
		System.out.println("Parada para o PitStop "+ parada+"s.");
		System.out.println("*****************************************************************");

	}

}
