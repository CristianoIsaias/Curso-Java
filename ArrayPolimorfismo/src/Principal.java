
public class Principal {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[3];
		
		animal[0] = new Cachorro();
		animal[1] = new Gato();
		animal[2] = new Cavalo();
		
		bramir(animal);
	}
	
	public static void bramir(Animal [] animal) {
		for(Animal a : animal) {
			System.out.println(a.barulho());
		}
	}

}
