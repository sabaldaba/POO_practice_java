public class Naipe{
	private int palo; //0->espadas, 1->corazones, 2->  treboles, 3->Diamantes
		int valor; //0->As, 1->2,..,9->10, 10->Joto, 11->Reina

	public Naipe(int palo, int valor){
		this.palo=palo;
		this.valor=valor;
	}

	private final static String[] nPalo={"espadas", "corazones", "tréboles", "diamantes"};
	private final static String[] nValor={"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joto", 						"Cuina", "Rey"};
	//Final No se puede modificar el arreglo
	//Static es para que todos los objetos compartan el mismo arreglo
	public String toString(){
		return this.nValor[this.valor]+" de " +this.nPalo[this.palo];
	}
	public static void main(String[] args){	
			Naipe asCorazones= new Naipe(1, 0);
			System.out.println(asCorazones);
			Baraja baraja=new Baraja();
			System.out.println(baraja);	
			baraja.mezclar();
			System.out.println();
			System.out.println(baraja);
	}

	

}//final todo
