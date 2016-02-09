// Fernando Saldaña Cabal
//A01350730

public class Complejo{
  private double real,
                 imag;

  public Complejo(){
    this(0.0,0.0);
  }

  public Complejo(double real, double imag){
    establecer(real,imag);
  }

  public void establecer(double real, double imag){
    this.real = real;
    this.imag = imag;
  }

  public Complejo agregar(double num1, double num2){
    this.real += num1;
    this.imag += num2;
    return new Complejo(this.real, this.imag);
  }

  public Complejo agregar(Complejo com1){
    this.real += com1.real;
    this.imag += com1.imag;
    return new Complejo(this.real, this.imag);
  }

  public void imprimir(){
    if (this.imag >= 0){
        System.out.println(this.real + "+" + this.imag + "i");
    }
    else{
    System.out.println(this.real +""+ this.imag + "i");  //Las dos comillas son para concatenar doubles
    }
  }

  public Complejo suma(Complejo c1){
    this.real += c1.real;
    this.imag += c1.imag;
    return new Complejo(this.real, this.imag);
  }

  public Complejo resta(Complejo c1){
    this.real -= c1.real;
    this.imag -= c1.imag;
    return new Complejo(this.real, this.imag);
  }

  public Complejo multiplicacion(Complejo c1){
    this.real *= c1.real;
    this.imag *= c1.imag;
    return new Complejo(this.real,this.imag);
  }

  public Complejo multiplicacion(double c1){
    this.real *= c1;
    this.imag *= c1;
    return new Complejo(this.real, this.imag);

  }
  public Complejo conjugado(){
    this.imag = this.imag * -1;
    return new Complejo(this.real, this.imag);
  }


  public static void main(String[]args){
    Complejo normal = new Complejo();
    Complejo prueba = new Complejo(10,10);
    Complejo grande = new Complejo(100,300);

    normal.imprimir();
    prueba.imprimir();
    System.out.println();

  }
} //Fin de clase gral.
