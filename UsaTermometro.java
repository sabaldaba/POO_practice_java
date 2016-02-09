public class UsaTermometro{
	public static void main(String[]args){
		Termometro sin = new Termometro ();
		Termometro gdl = new Termometro (18);
		gdl.setTemp(20);
		int tG=gdl.getTemp();

		System.out.println(tG);

	}

}
