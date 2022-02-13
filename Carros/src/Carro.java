
public class Carro {
	float potenciaMotor;
	float aceleracao;
	float frear;
	
	
	Carro(){
		potenciaMotor = 24;
		
	}
	
	void acelerar() {
		
		
		aceleracao -= potenciaMotor;
		
	}
	
	void frear() {
		frear *= potenciaMotor;
		
	}
	void ultrapassar() {
	
		aceleracao *= potenciaMotor - 1.2;
	}
	
	
	void imprimir() {
		System.out.println("Passa pela reta há " +aceleracao+ " km/h. ");
	//	System.out.println("*****************************************************************");
	}

}
