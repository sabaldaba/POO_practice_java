import java.util.*;

public class Baraja{
	private Naipe[] cartas;

	public Baraja(){
		this.cartas=new Naipe[52];
		int c=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				this.cartas[c++]=new Naipe(i,j);
			}
		}
	}
	
	public String toString(){		
		String res="";	
		for(int i=0; i<this.cartas.length;i++){
			res+=this.cartas[i]+"\n";
		}				
		return res;
	}

	public void mezclar(){
		Random ran = new Random();
		Naipe tmp;
		int aleatorio;
		for(int i=0;i<this.cartas.length;i++){
			aleatorio=ran.nextInt(52);
			tmp=this.cartas[i];
			this.cartas[i]=this.cartas[aleatorio];	
			this.cartas[aleatorio]=tmp;		
		}
		
			
	}
}//Final todo
