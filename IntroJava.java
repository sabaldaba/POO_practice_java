    import javax.swing.*;

public class IntroJava{
  public static void calificacion(){
    String strCalif=JOptionPane.showInputDialog("Introduce tu calificación: ");
    int calif=Integer.parseInt(strCalif);
    if (calif>= 70){
      JOptionPane.showMessageDialog(null,"Aprobado");
      //System.out.println("Aprobado");
    }
    else{
      JOptionPane.showMessageDialog(null,"Reprobado");
      //System.out.println("Reprobado");
    }
  }

  public static void del1Al100(){
    for(int i=0; i<100; i++){
      System.out.println(i+1);
    }
  }

  public static void serie(int base){
    for(int i=0; i<50; i++){
      System.out.print((i+1)*base+", ");
    }
  }

  public static int calorias(){
    int numComidas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas comidas realizaste hoy?"));
    int totalCalorias=0;
      for(int i=0; i < numComidas;i++){
            totalCalorias+=Integer.parseInt(JOptionPane.showInputDialog("¿Cuátas calorias consumiste en tu comida" +(i+1)+ "?"));
      }
      return(calorias);


  }

  public static void main(String[]args){
    calificacion();
    del1Al100();
    int x=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál serie quieres?"));
    serie(x);
    calorias();
  }




}
