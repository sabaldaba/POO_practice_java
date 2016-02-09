public class ZonasHorarias{
  private Clock[] zonasHorarias;

  public ZonasHorarias(){
    this.zonasHorarias = new Clock[10];
  }

  public void establecerHora(int pos, String cd, int hr, int min, int sec){
    /*this.cd=zonasHorarias[0];
    this.hr=zonasHorarias[1];
    this.min=zonasHorarias[2];
    this.sec=zonasHorarias[3];*/
    if(this.zonasHorarias[pos] == null){
      this.zonasHorarias[pos] = new Clock(cd,hr,min,sec);
    }
    else{
        this.zonasHorarias[pos].setTime(hr,min,sec);
        this.zonasHorarias[pos].setCiudad(cd);
    }
  }

  public void imprimeZonasHorarias(){
    for(int i = 0; i<this.zonasHorarias.length; i++){
      if (this.zonasHorarias[i] != null){
        //System.out.println(this.zonasHorarias[i]);
        this.zonasHorarias[i].printTime();
      }
    }
  }

  public void horarioVerano(){
    for(int i = 0; i<this.zonasHorarias.length; i++){
      if (this.zonasHorarias[i] != null){
        this.zonasHorarias[i].incrementHours();
      }
    }
  }

  public static void main(String[]args){
    ZonasHorarias zh = new ZonasHorarias();
    zh.establecerHora(0, "Guadalajara", 12,13,5);
    zh.establecerHora(1, "Tokyo", 3,13,5);
    zh.establecerHora(2, "Dubai", 22,13,5);
    zh.establecerHora(3, "Las Vegas", 10,13,5);
    zh.establecerHora(4, "Berlin", 19,13,5);

    zh.imprimeZonasHorarias();
    zh.horarioVerano();
    zh.imprimeZonasHorarias();
  }




}
