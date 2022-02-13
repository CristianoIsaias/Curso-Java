
public class Principal {

	public static void main(String[] args) {
	
	Piloto p1 = new Piloto();
	p1.nome = "Leuis Henitton";
	p1.equipe = "Maclaren";
	p1.impressao();
	
	Parada p01 = new Parada();
	p01.parada = 1.2f;
	p01.pitStopCompleto();
	
	Carro c1 = new Carro();
	c1.aceleracao = 10.0f;
	c1.acelerar();
	
	c1.imprimir();
	p01.imprimir();
	
	
	
	
	Piloto p2 = new Piloto();
	p2.nome = "Verstappen";
	p2.equipe = "Mercedes";
	p2.impressao();
	
	Parada p02 = new Parada();
	p02.pitStopCompleto();
	
	
	Carro c2 = new Carro();
	c2.aceleracao = 9.0f;
	c2.acelerar();
	
	c2.imprimir();
	p01.imprimir();
		
	}
}
