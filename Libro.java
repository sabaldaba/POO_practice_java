public class Libro{
	private String titulo,
		       autor,
		       editorial,
		       isbn;


	public Libro(){
		titulo = "Programacion";
		autor = "Fernando Saldaña";
		editorial = "ITESM";
		isbn = "978-3-1-6765-4";
	}

	public Libro(String t, String a, String e, String i){
		titulo = t;
		autor = a;
		editorial = e;
		isbn = i;

	}

	public void setTitulo(String t){
		titulo = t;
	}

	public void setAutor(String a){
		autor = a;
	}

	public void setEditorial(String e){
		editorial = e;
	}

	public void setIsbn(String i){
		isbn = i;
	}

	public String getTitulo(){
		return titulo;
	}

	public String getAutor(){
		return autor;
	}

	public String getEditorial(){
		return editorial;
	}

	public String getIsbn(){
		return isbn;
	}

	public static void main(String[]args){
		Libro Sistemas = new Libro();
		Libro Fisica = new Libro();

		Sistemas.setTitulo("Digital Design");
		String lST = Sistemas.getTitulo();

		Sistemas.setAutor("Frank Vahid");
		String lSA=Sistemas.getAutor();

		Sistemas.setEditorial("Mc Graw Hill");
		String lSE = Sistemas.getEditorial();

		Sistemas.setIsbn("978-3-1-4346-4");
		String lSI = Sistemas.getIsbn();

		Fisica.setTitulo("Physics II");
		String lFT = Fisica.getTitulo();

		Fisica.setAutor("Wolfgang Bauer");
		String lFA = Fisica.getAutor();

		Fisica.setEditorial("ITESM");
		String lFE = Fisica.getEditorial();

		Fisica.setIsbn("978-3-1-2123-6");
		String lFI = Fisica.getIsbn();


		System.out.println(lST);
		System.out.println(lSA);
		System.out.println(lSE);
		System.out.println(lSI);

		System.out.println();

		System.out.println(lFT);
		System.out.println(lFA);
		System.out.println(lFE);
		System.out.println(lFI);





	}



}
