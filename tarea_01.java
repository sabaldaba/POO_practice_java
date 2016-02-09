/* Jorge Fernando Saldaña Cabal
A01350730 */
import javax.swing.*;
public class tarea_01{
        public static void numeroRomanos(){
                String romano = "";
                int original = 0,
                    miles = 0,
                    centenas = 0,
                    decenas = 0,
                    unidades = 0,
                    residuo_miles = 0,
                    residuo_centenas = 0,
                    residuo_decenas = 0;
                    //residuo_unidades = 0;

                do{
                        original = Integer.parseInt(JOptionPane.showInputDialog("Qué numero quieres convertir a Romano? \n(Debe ser menor a 3999)"));
                        miles = original / 1000;
                      } while(miles > 3);
                       //termina el inicio de do

                residuo_miles = original % 1000;
                if (miles > 0 && miles <=3){
                      for (int i=0; i<miles; i++){
                      romano = romano + "M";
                              }} // termina inicio de if y de for


                //Comienza parte de centenas
                centenas = residuo_miles / 100;
                residuo_centenas = residuo_miles % 100;
                if (centenas > 0 && centenas <=3){
                      for (int i=0; i<centenas; i++){
                      romano = romano + "C";}}

                else if (centenas == 4){
                    romano = romano + "CD" ;}

                else if (centenas == 5){
                    romano = romano + "D"; }

                else if (centenas > 5 && centenas <=8){
                          romano = romano + "D";
                          centenas = centenas - 5;
                          for (int i=0; i<centenas; i++){
                          romano = romano + "C";}}
                else if (centenas == 9){
                    romano = romano + "CM";
                      }

                // Comienza parte de decenas
                decenas = residuo_centenas / 10;
                residuo_decenas = residuo_centenas % 10;
                if (decenas > 0 && decenas <=3){
                      for (int i=0; i<decenas; i++){
                      romano = romano + "X";}}

                else if (decenas == 4){
                    romano = romano + "XL" ;}

                else if (decenas == 5){
                    romano = romano + "L"; }

                else if (decenas > 5 && decenas <=8){
                          romano = romano + "L";
                          decenas = decenas - 5;
                          for (int i=0; i<decenas; i++){
                          romano = romano + "X";}}
                else if (decenas == 0) {
                    romano = romano + "XC";
                      }

                //unidades = residuo_centenas %10;

                //Comienza parte de unidades
                //  unidades = residuo_decenas % 1;
                  if (residuo_decenas> 0 && residuo_decenas <=3){
                        for (int i=0; i< residuo_decenas; i++){
                        romano = romano + "I";}}

                  else if (residuo_decenas == 4){
                      romano = romano + "IV" ;}

                  else if (residuo_decenas == 5){
                      romano = romano + "V"; }

                  else if (residuo_decenas > 5 && residuo_decenas <=8){
                            romano = romano + "V";
                            residuo_decenas = residuo_decenas - 5;
                            for (int i=0; i< residuo_decenas; i++){
                              romano = romano + "I";}}
                  else if (residuo_decenas == 9){
                      romano = romano + "IX";
                        }



                System.out.println("El numero " + original + " es en romano: " + romano);

          } // termina clase ternaPitagorica




          public static void main(String[]args){
                  numeroRomanos();
          } //termina main
      } //termina todo
