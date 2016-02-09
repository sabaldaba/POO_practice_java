public class PruebaArreglos{
  public int suma(int [] valores){
	int total = 0;
	for (int i = 0; i < valores.length; i++){
		total += valores[i];
	}
	return total;
  }

  public int maximo(int[] valores){
    int mayor = valores[0];
    for (int i=0; i < valores.length; i++){
      if (valores[i]>mayor){
        mayor = valores[i];
      }
    }
    return mayor;
  }

  public int minimo(int[] valores){
    int menor= valores[0];
    for (int i=0; i < valores.length; i++){
      if (valores[i]<menor){
        menor = valores[i];
      }
    }
    return menor;
  }

/*  public void imprime(String[2][] valores){
      columnas = valores.length/2;

  }*/

  public double promedio(int[] valores){
    int total = 0;
    double prom;
    for (int i = 0; i < valores.length; i++){
      total += valores[i];
    }
    prom = total/valores.length;
    return prom;
  }

public void imprime(String[][] valores){
  for (int i=0; i<valores.length; i++){
    for (int j =0; j<valores[i].length; j++){
      System.out.print(valores[i][j]);
    }
    System.out.println("");
  }
}

  public static void main(String[]args){
	int [] a = {2,8,4,0,-1};
	int [] b = {5,11};
	String [][] c = {{"2","4","5",},{"3","7","6","7",}};
	PruebaArreglos pa = new PruebaArreglos();

	
	String fil = args[0];
	String col = args[1];

    int filas = Integer.parseInt(fil);
    int columnas = Integer.parseInt(col);


    for(int i=0; i<(args.length-2);i++){
      System.out.print(args[i+2] + " ");
      if (i+1 == columnas){
        System.out.println("");
        columnas += columnas;
      }
    }  


    //pa.imprime(c);

//Para usar los metodos de la clase el siguiente codigo debe ocultarse pues como no se recibiran
// parametros del arreglo args marcara un error al correr el codigo
//
//Si quiere usar el metodo main y recibir parametros en el arreglo de Strings args,
// las siguientes lineas transformelas de comentario a codigo normal


    

  }









} //Fin
