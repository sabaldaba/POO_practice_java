import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;



public class Numerote{

	private byte[]numerote;
	private boolean signo;

	public Numerote(){
		this("0");
	}

	public Numerote(String a){
		this.numerote=new byte[a.length()];
		if(a.startsWith("-")==true){
			this.signo = false;
			a = a.substring(1, a.length());
		}
		else{
			this.signo=true;
		}
		int j=a.length()-1;
		for(int i=0; i<a.length();i++,j--){
			this.numerote[i]=Byte.parseByte(String.valueOf(a.charAt(j)));
		}

	}

	public Numerote suma(Numerote a){
		byte [] res;
		byte [] copia;
		byte [] mayor;
		byte tmp;
		String sRes="";
		Numerote ret = new Numerote();
		boolean flag=false;

		if(this.signo==a.signo){
			if(this.numerote.length>a.numerote.length){
				res = new byte[this.numerote.length+1];
				copia= new byte[this.numerote.length];
				mayor= new byte[this.numerote.length];
				for(int i=0;i<copia.length;i++){
					mayor[i]=this.numerote[i];
					if(i<a.numerote.length){
						copia[i]=a.numerote[i];
					}
					else{
						copia[i]=0;
					}
				}
			}

			else {//if(a.numerote.length>this.numerote.length){
				res = new byte[a.numerote.length+1];
				copia= new byte[a.numerote.length];
				mayor= new byte[a.numerote.length];
				for(int i=0;i<a.numerote.length;i++){
					mayor[i]=a.numerote[i];
					if(i<this.numerote.length){
						copia[i]=this.numerote[i];
					}
					else{
						copia[i]=0;
					}
				}
			}
			/*else{
				res = new byte[a.numerote.length+1];
				copia=new byte[a.numerote.length];
				mayor=new byte[a.numerote.length];
				for(int i=0;i<a.numerote.length;i++){
					copia[i]=a.numerote[i];
					mayor[i]=this.numerote[i];
				}
			}*/
			for(int i=0;i<res.length-1;i++){
				if (flag == true){
					mayor[i]+=1;
				}
				tmp=(byte)(mayor[i]+copia[i]);
				if(tmp>=10){
					res[i] = (byte)(tmp-10);
					sRes = (tmp-10)+sRes;
					flag = true;
				}
				else{
					res[i]=tmp;
					sRes = tmp + sRes;
					flag = false;
				}			
			}
			if(flag==true){
				sRes = 1 + sRes;
			}
			ret.numerote=res.clone();
			ret.signo=this.signo;
			//return new Numerote(sRes);
			//return ret;
		}
		return new Numerote(sRes);
		//return ret;

	}

	public Numerote resta(Numerote a){
		Numerote b;
		if(this.signo==false && a.signo==true){
			a.signo=false;
			b = a.suma(this);
		}
		else if(this.signo==true && a.signo==false){
			a.signo=true;
			b=a.suma(this);
		}
		else{
			byte[] res;
			byte[] copia;
			byte[] mayor;
			String sRes="";
			String s="";
			if(this.numerote.length>a.numerote.length){
				res=new byte[this.numerote.length];
				copia=new byte[this.numerote.length];
				mayor=new byte[this.numerote.length];
				for(int i=0;i<this.numerote.length;i++){
					mayor[i]=this.numerote[i];
					if(this.signo==false){
						s="-";
					}
					else{
						s="";
					}
					if(i<a.numerote.length){
						copia[i]=a.numerote[i];
					}
					else{
						copia[i]=0;
					}
				}
			}

			else if(a.numerote.length>this.numerote.length){
				res=new byte[a.numerote.length];
				copia=new byte[a.numerote.length];
				mayor=new byte[a.numerote.length];
				for(int i=0;i<a.numerote.length;i++){
					mayor[i]=a.numerote[i];
					if(this.signo==false){
						s="";
					}
					else{
						s="-";
					}
					if(i<this.numerote.length){
						copia[i]=this.numerote[i];
					}
					else{
						copia[i]=0;
					}
				}
			}
			else{
				res=new byte[this.numerote.length];
				copia=new byte[this.numerote.length];
				mayor=new byte[this.numerote.length];
				boolean fl = true;
				for(int i=this.numerote.length-1;i>-1;i--){
					int j=Integer.valueOf(a.numerote[i]);
					int r=Integer.valueOf(this.numerote[i]);
					if(j<r){
						fl=false;
						break;
					}
					else if(j>r){
						fl=true;
						break;
					}
				}
				if(fl==true){
					for(int i=0;i<this.numerote.length;i++){
						mayor[i]=a.numerote[i];
						copia[i]=this.numerote[i];
						if(this.signo==false){
							s="";
						}
						else{
							s="-";
						}
					}
				}
				else{
					for(int i=0;i<this.numerote.length;i++){
						mayor[i]=this.numerote[i];
						copia[i]=a.numerote[i];
						if(this.signo==false){
							s="-";
						}
						else{
							s="";
						}
					}
				}
			}
			int carry=0;
			for(int i=0;i<res.length;i++){
				res[i]=(byte)(mayor[i]-copia[i]-carry);
				if(res[i]<0){
					carry=1;
					res[i]+=10;
					sRes = res[i]+sRes;
				}
				else{
					res[i]=res[i];
					sRes = res[i]+sRes;
					carry=0;
				}
			}
			b=new Numerote(s+sRes);
		}
		return b;
	}

	public static void ejecutaArchivo(String entrada, String salida){
		try{
			BufferedReader br = new BufferedReader(new FileReader(entrada));
			PrintWriter pw = new PrintWriter(new FileWriter(salida));
			StringTokenizer st;
			String linea;
			String op;

			Numerote n1;
			Numerote n2;

			while((linea=br.readLine())!=null){
				st = new StringTokenizer(linea, ",");
				n1 = new Numerote(st.nextToken());
				System.out.println(n1.toString());
				n2 = new Numerote(st.nextToken());
				op = st.nextToken();
				if(op.equals("s")){
					pw.println(n1.suma(n2)+"");
				}
				else if(op.equals("r")){
					pw.println(n1.resta(n2)+"");
				}
				/*else if(op.equals("m")){
					pw.println(n1.multiplicaion(n2)+"");
				}*/
				else{
					pw.println(linea + "<---No tiene el formato requerido");
				}
			}
			br.close();
			pw.close();
		}
		catch(FileNotFoundException e){
			System.out.println("No se encontro el archivo");
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

	public String toString(){
		String imprime="";
		for(int i=this.numerote.length-1;i>=0;i--){
			imprime += this.numerote[i];
		}
		if(this.signo==false){
			imprime = "-"+imprime;
		}
		return imprime;
	}

	public static void main(String[] args){
		Numerote a = new Numerote("20");
		Numerote b = new Numerote("20");
		
		System.out.println(a.resta(b));
		


	}

}
