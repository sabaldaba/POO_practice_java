public class Clock{
	private int hr,
		    min,
		    sec;

	private String cd;

	public Clock (){
		this("Guadalajara", 12,0,0); //llamar al contructor otro, debe ser la primer linea
	}

	public Clock (String cd, int hr, int min, int sec){
		setTime(hr,min,sec);  //llamar al metodo setTime
		setCiudad(cd);
	}

	public void setCiudad(String cd){
		this.cd=cd;
	}

	public void setTime(int hr, int min, int sec){
		if (hr>=0 && hr<24){
                        this.hr = hr;
                }
                else{
                        this.hr = 12;
                }

                if (min>=0 && min<60){
                        this.min = min;
                }
                else{
                        this.min = 0;
                }

                if (sec>=0 && sec<60){
                        this.sec = sec;
                }
                else{
                        this.sec = 0;
                }
	}

	public void printTime(){
		String  sHr = this.hr<10 ? "0"+this.hr:""+this.hr,
			sMin = this.min<10 ? "0"+this.min:""+this.min,
			sSec = this.sec<10 ? "0" + this.sec:""+this.sec;

		System.out.println("La hora en " + this.cd + " es " + sHr + ":" + sMin + ":" + sSec);
	}

	public int getHours(){
		return this.hr;
	}

	public int getMinutes(){
		return this.min;
	}

	public int getSeconds(){
		return this.sec;
	}

	public void incrementHours(){
//		if (this.hr < 24){
//			this.hr++; //incrementar la hora si es menor que 24
//		}
//		else{
//			this.hr=0; //si es 23 que cambie a 0
		this.hr = (this.hr+1)%24;
		}

	public void incrementMinutes(){
		this.min=(this.min+1)%60;
		if(this.min == 0){
			this.incrementHours();
		}
	}

	public void incrementSeconds(){
		this.sec = (this.sec+1)%60;
		if(this.sec==0){
			this.incrementMinutes();
		}
	}

	public boolean equals(Clock reloj){
//		if (this.hr==reloj.hr && this.min==reloj.min && this.sec==reloj.sec){
//			return true;
//		}
//		else{
//			return false;
//		}
		return this.hr==reloj.hr && this.min==reloj.min && this.sec==reloj.sec;
	}

	public void makeCopy(Clock reloj){
		this.hr = reloj.hr;
		this.min = reloj.min;
		this.sec = reloj.sec;
	}

	public Clock getCopy(){
		return new Clock(this.cd, this.hr, this.min, this.sec);
	}



}
