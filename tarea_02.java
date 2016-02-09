/* Jorge Fernando Saldaña Cabal
A01350730 */
public class tarea_02{
  public static void ternaPitagorica(){
    double x,
        y,
        v1,
        v2,
        v3,
        hyp=0;

        for (x = 2; x<500; x++){
          for (y = 2; y<500; y++){
            v1 = Math.pow(x, 2);
            v2 = Math.pow(y, 2);
            v3 = v1+v2;
            hyp = Math.sqrt(v3);
            if (hyp%1==0){
            System.out.println(x + "    " + y + "     " + hyp);

            } // Final del else if
            else if (hyp >= 500){
              break;
            }// Fin al if


          }//Fin de valor h for
        }//Fin de for de X


  }//final de metodo

  public static void main(String[]args){
    ternaPitagorica();

  } // fin de main


} //Final de todo
